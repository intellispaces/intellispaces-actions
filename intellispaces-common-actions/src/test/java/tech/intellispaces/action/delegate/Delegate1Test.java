package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.supplier.SupplierAction;
import tech.intellispaces.action.supplier.SupplierActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link Delegate1}.
 */
public class Delegate1Test {

  @Test
  public void testExecute() {
    // Given
    Action1<String, Integer> contractor = spy(Actions.get((Integer i) -> Integer.toString(i)));
    SupplierAction<Action1<String, Integer>> broker = SupplierActions.get(contractor);
    Delegate1<String, Integer> delegate = new Delegate1<>(broker);

    // When
    String result = delegate.execute(Integer.valueOf(3));

    // Then
    assertThat(result).isEqualTo("3");
    assertThat(delegate.broker()).isSameAs(broker);
    assertThat(delegate.broker().get()).isSameAs(contractor);
    verify(contractor).execute(eq(Integer.valueOf(3)));
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action1<Integer, String> contractor = spy(Actions.get((String s) -> Integer.parseInt(s)));
    SupplierAction<Action1<Integer, String>> broker = SupplierActions.get(contractor);
    Delegate1<Integer, String> delegate = new Delegate1<>(broker);

    // When
    int result = delegate.executeReturnInt("3");

    // Then
    assertThat(result).isEqualTo(3);
    assertThat(delegate.broker()).isSameAs(broker);
    assertThat(delegate.broker().get()).isSameAs(contractor);
    verify(contractor).executeReturnInt(eq("3"));
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action1<Double, String> contractor = spy(Actions.get(Double::parseDouble));
    SupplierAction<Action1<Double, String>> broker = SupplierActions.get(contractor);
    Delegate1<Double, String> delegate = new Delegate1<>(broker);

    // When
    double result = delegate.executeReturnDouble("3.14");

    // Then
    assertThat(result).isEqualTo(3.14);
    assertThat(delegate.broker()).isSameAs(broker);
    assertThat(delegate.broker().get()).isSameAs(contractor);
    verify(contractor).executeReturnDouble(eq("3.14"));
  }
}
