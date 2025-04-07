package tech.intellispaces.actions.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.broker.BrokerAction1;
import tech.intellispaces.actions.broker.BrokerActions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link DelegateAction1Impl}.
 */
public class DelegateAction1ImplTest {

  @Test
  public void testExecute() {
    // Given
    Action1<String, Short> contractor = spy(Actions.get((Short n) -> Integer.toString(n)));
    BrokerAction1<String, Short> broker = spy(BrokerActions.brokerAction1(contractor));
    var delegate = new DelegateAction1Impl<>(broker);

    Short data = 3;

    // When
    String result = delegate.execute(data);

    // Then
    assertThat(result).isEqualTo("3");
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data));
    verify(contractor).execute(eq(data));
  }

  @Test
  public void testExecuteReturnInt() {
    // Given
    Action1<Integer, Short> contractor = spy(Actions.get((Short n) -> (int) n));
    BrokerAction1<Integer, Short> broker = spy(BrokerActions.brokerAction1(contractor));
    var delegate = new DelegateAction1Impl<>(broker);

    Short data = 3;

    // When
    int result = delegate.executeReturnInt(data);

    // Then
    assertThat(result).isEqualTo(3);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data));
    verify(contractor).executeReturnInt(eq(data));
  }

  @Test
  public void testExecuteReturnDouble() {
    // Given
    Action1<Double, Short> contractor = spy(Actions.get((Short n) -> (double) n));
    BrokerAction1<Double, Short> broker = spy(BrokerActions.brokerAction1(contractor));
    var delegate = new DelegateAction1Impl<>(broker);

    Short data = 3;

    // When
    double result = delegate.executeReturnDouble(data);

    // Then
    assertThat(result).isEqualTo(3.0);
    assertThat(delegate.broker()).isSameAs(broker);
    verify(broker).map(eq(data));
    verify(contractor).executeReturnDouble(eq(data));
  }
}
