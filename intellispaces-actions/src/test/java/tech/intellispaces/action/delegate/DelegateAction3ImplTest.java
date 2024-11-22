package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action3;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.broker.BrokerAction3;
import tech.intellispaces.action.broker.BrokerActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link DelegateAction3Impl}.
 */
public class DelegateAction3ImplTest {

  @Test
  public void testExecute() {
    // Given
    Action3<String, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3) -> Integer.toString(n1 + n2 + n3)));
    BrokerAction3<String, Short, Short, Short> broker = spy(BrokerActions.brokerAction3(contractor));
    var delegate = new DelegateAction3Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;

    // When
    String result = delegate.execute(data1, data2, data3);

    // Then
    assertThat(result).isEqualTo("6");
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3));
    verify(contractor).execute(eq(data1), eq(data2), eq(data3));
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action3<Integer, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3) -> n1 + n2 + n3));
    BrokerAction3<Integer, Short, Short, Short> broker = spy(BrokerActions.brokerAction3(contractor));
    var delegate = new DelegateAction3Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;

    // When
    int result = delegate.executeReturnInt(data1, data2, data3);

    // Then
    assertThat(result).isEqualTo(6);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3));
    verify(contractor).executeReturnInt(eq(data1), eq(data2), eq(data3));
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action3<Double, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3) -> (double) n1 + n2 + n3));
    BrokerAction3<Double, Short, Short, Short> broker = spy(BrokerActions.brokerAction3(contractor));
    var delegate = new DelegateAction3Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;

    // When
    double result = delegate.executeReturnDouble(data1, data2, data3);

    // Then
    assertThat(result).isEqualTo(6.0);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3));
    verify(contractor).executeReturnDouble(eq(data1), eq(data2), eq(data3));
  }
}
