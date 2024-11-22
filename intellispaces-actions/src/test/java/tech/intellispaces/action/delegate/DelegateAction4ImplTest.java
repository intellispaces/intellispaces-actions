package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action4;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.broker.BrokerAction4;
import tech.intellispaces.action.broker.BrokerActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link DelegateAction4Impl}.
 */
public class DelegateAction4ImplTest {

  @Test
  public void testExecute() {
    // Given
    Action4<String, Short, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3, Short n4) -> Integer.toString(n1 + n2 + n3 + n4)));
    BrokerAction4<String, Short, Short, Short, Short> broker = spy(BrokerActions.brokerAction4(contractor));
    var delegate = new DelegateAction4Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;
    Short data4 = 4;

    // When
    String result = delegate.execute(data1, data2, data3, data4);

    // Then
    assertThat(result).isEqualTo("10");
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3), eq(data4));
    verify(contractor).execute(eq(data1), eq(data2), eq(data3), eq(data4));
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action4<Integer, Short, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3, Short n4) -> n1 + n2 + n3 + n4));
    BrokerAction4<Integer, Short, Short, Short, Short> broker = spy(BrokerActions.brokerAction4(contractor));
    var delegate = new DelegateAction4Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;
    Short data4 = 4;

    // When
    int result = delegate.executeReturnInt(data1, data2, data3, data4);

    // Then
    assertThat(result).isEqualTo(10);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3), eq(data4));
    verify(contractor).executeReturnInt(eq(data1), eq(data2), eq(data3), eq(data4));
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action4<Double, Short, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3, Short n4) -> (double) n1 + n2 + n3 + n4));
    BrokerAction4<Double, Short, Short, Short, Short> broker = spy(BrokerActions.brokerAction4(contractor));
    var delegate = new DelegateAction4Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;
    Short data4 = 4;

    // When
    double result = delegate.executeReturnDouble(data1, data2, data3, data4);

    // Then
    assertThat(result).isEqualTo(10.0);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3), eq(data4));
    verify(contractor).executeReturnDouble(eq(data1), eq(data2), eq(data3), eq(data4));
  }
}
