package tech.intellispaces.actions;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.runnable.RunnableAction;
import tech.intellispaces.actions.supplier.ResettableSupplierAction;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Actions}.
 */
public class ActionsTest {

  @Test
  public void testRunnableAction_whenRunnable() {
    // Given
    List<Integer> values = new ArrayList<>();
    Runnable runnable = () -> values.add(values.size() + 1);
    RunnableAction runnableAction = Actions.runnableAction(runnable);

    // When
    runnableAction.execute();
    runnableAction.execute();
    runnableAction.execute();

    // Then
    assertThat(values).containsExactly(1, 2, 3);
  }

  @Test
  public void testRunnableAction_whenConsumer() {
    // Given
    List<Integer> values = new ArrayList<>();
    RunnableAction runnableAction = Actions.runnableAction(values::add, 1);

    // When
    runnableAction.execute();
    runnableAction.execute();
    runnableAction.execute();

    // Then
    assertThat(values).containsExactly(1, 1, 1);
  }

  @Test
  public void testChainOfRunnableActions() {
    // Given
    List<Integer> values = new ArrayList<>();
    RunnableAction runnableAction = Actions.runnableAction(values::add, 1)
        .andThen(Actions.runnableAction(values::add, 2));

    // When
    runnableAction.execute();
    runnableAction.execute();
    runnableAction.execute();

    // Then
    assertThat(values).containsExactly(1, 2, 1, 2, 1, 2);
  }

  @Test
  public void testResettableSupplierAction_whenNoInitValue() {
    ResettableSupplierAction<String> resettableSupplierAction = Actions.resettableSupplierAction(String.class);
    assertThat(resettableSupplierAction.get()).isNull();

    resettableSupplierAction.set("value1");
    assertThat(resettableSupplierAction.get()).isEqualTo("value1");

    resettableSupplierAction.set("value2");
    assertThat(resettableSupplierAction.get()).isEqualTo("value2");
  }

  @Test
  public void testResettableSupplierAction_whenInitValue() {
    ResettableSupplierAction<String> resettableSupplierAction = Actions.resettableSupplierAction("value1");
    assertThat(resettableSupplierAction.get()).isEqualTo("value1");

    resettableSupplierAction.set("value2");
    assertThat(resettableSupplierAction.get()).isEqualTo("value2");

    resettableSupplierAction.set("value3");
    assertThat(resettableSupplierAction.get()).isEqualTo("value3");
  }
}
