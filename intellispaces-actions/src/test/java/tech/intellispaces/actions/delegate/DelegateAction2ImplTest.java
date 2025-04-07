package tech.intellispaces.actions.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.broker.BrokerAction2;
import tech.intellispaces.actions.broker.BrokerActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link DelegateAction2Impl}.
 */
public class DelegateAction2ImplTest {

  @Test
  public void testExecute() {
    // Given
    Action2<String, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2) -> Integer.toString(n1 + n2)));
    BrokerAction2<String, Short, Short> broker = spy(BrokerActions.brokerAction2(contractor));
    var delegate = new DelegateAction2Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;

    // When
    String result = delegate.execute(data1, data2);

    // Then
    assertThat(result).isEqualTo("3");
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2));
    verify(contractor).execute(eq(data1), eq(data2));
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action2<Integer, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2) -> n1 + n2));
    BrokerAction2<Integer, Short, Short> broker = spy(BrokerActions.brokerAction2(contractor));
    var delegate = new DelegateAction2Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;

    // When
    int result = delegate.executeReturnInt(data1, data2);

    // Then
    assertThat(result).isEqualTo(3);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2));
    verify(contractor).executeReturnInt(eq(data1), eq(data2));
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action2<Double, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2) -> (double) n1 + n2));
    BrokerAction2<Double, Short, Short> broker = spy(BrokerActions.brokerAction2(contractor));
    var delegate = new DelegateAction2Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;

    // When
    double result = delegate.executeReturnDouble(data1, data2);

    // Then
    assertThat(result).isEqualTo(3.0);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2));
    verify(contractor).executeReturnDouble(eq(data1), eq(data2));
  }
}
