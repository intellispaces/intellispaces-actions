package tech.intellispaces.commons.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.Actions;
import tech.intellispaces.commons.action.broker.BrokerAction5;
import tech.intellispaces.commons.action.broker.BrokerActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link DelegateAction5Impl}.
 */
public class DelegateAction5ImplTest {

  @Test
  public void testExecute() {
    // Given
    Action5<String, Short, Short, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3, Short n4, Short n5) -> Integer.toString(n1 + n2 + n3 + n4 + n5)));
    BrokerAction5<String, Short, Short, Short, Short, Short> broker = spy(BrokerActions.brokerAction5(contractor));
    var delegate = new DelegateAction5Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;
    Short data4 = 4;
    Short data5 = 5;

    // When
    String result = delegate.execute(data1, data2, data3, data4, data5);

    // Then
    assertThat(result).isEqualTo("15");
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3), eq(data4), eq(data5));
    verify(contractor).execute(eq(data1), eq(data2), eq(data3), eq(data4), eq(data5));
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action5<Integer, Short, Short, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3, Short n4, Short n5) -> n1 + n2 + n3 + n4 + n5));
    BrokerAction5<Integer, Short, Short, Short, Short, Short> broker = spy(BrokerActions.brokerAction5(contractor));
    var delegate = new DelegateAction5Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;
    Short data4 = 4;
    Short data5 = 5;

    // When
    int result = delegate.executeReturnInt(data1, data2, data3, data4, data5);

    // Then
    assertThat(result).isEqualTo(15);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3), eq(data4), eq(data5));
    verify(contractor).executeReturnInt(eq(data1), eq(data2), eq(data3), eq(data4), eq(data5));
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action5<Double, Short, Short, Short, Short, Short> contractor = spy(Actions.get(
        (Short n1, Short n2, Short n3, Short n4, Short n5) -> (double) n1 + n2 + n3 + n4 + n5));
    BrokerAction5<Double, Short, Short, Short, Short, Short> broker = spy(BrokerActions.brokerAction5(contractor));
    var delegate = new DelegateAction5Impl<>(broker);

    Short data1 = 1;
    Short data2 = 2;
    Short data3 = 3;
    Short data4 = 4;
    Short data5 = 5;

    // When
    double result = delegate.executeReturnDouble(data1, data2, data3, data4, data5);

    // Then
    assertThat(result).isEqualTo(15.0);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data1), eq(data2), eq(data3), eq(data4), eq(data5));
    verify(contractor).executeReturnDouble(eq(data1), eq(data2), eq(data3), eq(data4), eq(data5));
  }
}
