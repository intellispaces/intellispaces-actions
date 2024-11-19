package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.supplier.SupplierAction;
import tech.intellispaces.action.supplier.SupplierActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link Delegate0}.
 */
public class Delegate0Test {

  @Test
  public void testExecute() {
    // Given
    Action0<String> contractor = spy(Actions.get(() -> "The string"));
    SupplierAction<Action0<String>> broker = SupplierActions.get(contractor);
    Delegate0<String> delegate = new Delegate0<>(broker);

    // When
    String result = delegate.execute();

    // Then
    assertThat(result).isEqualTo("The string");
    assertThat(delegate.broker()).isSameAs(broker);
    assertThat(delegate.broker().get()).isSameAs(contractor);
    verify(contractor).execute();
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action0<Integer> contractor = spy(Actions.get(() -> 123));
    SupplierAction<Action0<Integer>> broker = SupplierActions.get(contractor);
    Delegate0<Integer> delegate = new Delegate0<>(broker);

    // When
    int result = delegate.executeReturnInt();

    // Then
    assertThat(result).isEqualTo(123);
    assertThat(delegate.broker()).isSameAs(broker);
    assertThat(delegate.broker().get()).isSameAs(contractor);
    verify(contractor).executeReturnInt();
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action0<Double> contractor = spy(Actions.get(() -> 1.23));
    SupplierAction<Action0<Double>> broker = SupplierActions.get(contractor);
    Delegate0<Double> delegate = new Delegate0<>(broker);

    // When
    double result = delegate.executeReturnDouble();

    // Then
    assertThat(result).isEqualTo(1.23);
    assertThat(delegate.broker()).isSameAs(broker);
    assertThat(delegate.broker().get()).isSameAs(contractor);
    verify(contractor).executeReturnDouble();
  }
}
