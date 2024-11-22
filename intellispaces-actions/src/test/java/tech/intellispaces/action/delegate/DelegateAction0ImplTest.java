package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.broker.BrokerAction0;
import tech.intellispaces.action.broker.BrokerActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link DelegateAction0Impl}.
 */
public class DelegateAction0ImplTest {

  @Test
  public void testExecute() {
    // Given
    Action0<String> contractor = spy(Actions.get(() -> "The string"));
    BrokerAction0<String> broker = spy(BrokerActions.brokerAction0(contractor));
    var delegate = new DelegateAction0Impl<>(broker);

    // When
    String result = delegate.execute();

    // Then
    assertThat(result).isEqualTo("The string");
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).get();
    verify(contractor).execute();
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action0<Integer> contractor = spy(Actions.get(() -> 123));
    BrokerAction0<Integer> broker = spy(BrokerActions.brokerAction0(contractor));
    var delegate = new DelegateAction0Impl<>(broker);

    // When
    int result = delegate.executeReturnInt();

    // Then
    assertThat(result).isEqualTo(123);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).get();
    verify(contractor).executeReturnInt();
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action0<Double> contractor = spy(Actions.get(() -> 1.23));
    BrokerAction0<Double> broker = spy(BrokerActions.brokerAction0(contractor));
    var delegate = new DelegateAction0Impl<>(broker);

    // When
    double result = delegate.executeReturnDouble();

    // Then
    assertThat(result).isEqualTo(1.23);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).get();
    verify(contractor).executeReturnDouble();
  }
}
