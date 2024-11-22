package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Action2;
import tech.intellispaces.action.Action3;
import tech.intellispaces.action.Action4;
import tech.intellispaces.action.Action5;
import tech.intellispaces.action.broker.BrokerAction0;
import tech.intellispaces.action.broker.BrokerAction0BasedOnSupplier;
import tech.intellispaces.action.broker.BrokerAction1;
import tech.intellispaces.action.broker.BrokerAction1BasedOnSupplier;
import tech.intellispaces.action.broker.BrokerAction2;
import tech.intellispaces.action.broker.BrokerAction2BasedOnSupplier;
import tech.intellispaces.action.broker.BrokerAction3;
import tech.intellispaces.action.broker.BrokerAction3BasedOnSupplier;
import tech.intellispaces.action.broker.BrokerAction4;
import tech.intellispaces.action.broker.BrokerAction4BasedOnSupplier;
import tech.intellispaces.action.broker.BrokerAction5;
import tech.intellispaces.action.broker.BrokerAction5BasedOnSupplier;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Tests for class {@link DelegateActions}.
 */
public class DelegateActionsTest {

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction0_whenBroker() {
    // Given
    BrokerAction0<String> broker = mock(BrokerAction0.class);

    // When
    DelegateAction0<String> result = DelegateActions.delegateAction0(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction1_whenBroker() {
    // Given
    BrokerAction1<String, String> broker = mock(BrokerAction1.class);

    // When
    DelegateAction1<String, String> result = DelegateActions.delegateAction1(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction2_whenBroker() {
    // Given
    BrokerAction2<String, String, String> broker = mock(BrokerAction2.class);

    // When
    DelegateAction2<String, String, String> result = DelegateActions.delegateAction2(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction3_whenBroker() {
    // Given
    BrokerAction3<String, String, String, String> broker = mock(BrokerAction3.class);

    // When
    DelegateAction3<String, String, String, String> result = DelegateActions.delegateAction3(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction4_whenBroker() {
    // Given
    BrokerAction4<String, String, String, String, String> broker = mock(BrokerAction4.class);

    // When
    DelegateAction4<String, String, String, String, String> result = DelegateActions.delegateAction4(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction5_whenBroker() {
    // Given
    BrokerAction5<String, String, String, String, String, String> broker = mock(BrokerAction5.class);

    // When
    DelegateAction5<String, String, String, String, String, String> result = DelegateActions.delegateAction5(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction0_whenSupplier() {
    // Given
    Action0<String> contractor = mock(Action0.class);
    Supplier<Action0<String>> contractorSupplier = () -> contractor;

    // When
    DelegateAction0<String> result = DelegateActions.delegateAction0(contractorSupplier);

    // Then
    assertThat(result.broker()).isInstanceOf(BrokerAction0BasedOnSupplier.class);
    assertThat(result.broker().get()).isSameAs(contractor);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction1_whenSupplier() {
    // Given
    Action1<String, String> contractor = mock(Action1.class);
    Supplier<Action1<String, String>> contractorSupplier = () -> contractor;

    // When
    DelegateAction1<String, String> result = DelegateActions.delegateAction1(contractorSupplier);

    // Then
    assertThat(result.broker()).isInstanceOf(BrokerAction1BasedOnSupplier.class);
    assertThat(result.broker().map("")).isSameAs(contractor);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction2_whenSupplier() {
    // Given
    Action2<String, String, String> contractor = mock(Action2.class);
    Supplier<Action2<String, String, String>> contractorSupplier = () -> contractor;

    // When
    DelegateAction2<String, String, String> result = DelegateActions.delegateAction2(contractorSupplier);

    // Then
    assertThat(result.broker()).isInstanceOf(BrokerAction2BasedOnSupplier.class);
    assertThat(result.broker().map("", "")).isSameAs(contractor);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction3_whenSupplier() {
    // Given
    Action3<String, String, String, String> contractor = mock(Action3.class);
    Supplier<Action3<String, String, String, String>> contractorSupplier = () -> contractor;

    // When
    DelegateAction3<String, String, String, String> result = DelegateActions.delegateAction3(contractorSupplier);

    // Then
    assertThat(result.broker()).isInstanceOf(BrokerAction3BasedOnSupplier.class);
    assertThat(result.broker().map("", "", "")).isSameAs(contractor);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction4_whenSupplier() {
    // Given
    Action4<String, String, String, String, String> contractor = mock(Action4.class);
    Supplier<Action4<String, String, String, String, String>> contractorSupplier = () -> contractor;

    // When
    DelegateAction4<String, String, String, String, String> result = DelegateActions.delegateAction4(contractorSupplier);

    // Then
    assertThat(result.broker()).isInstanceOf(BrokerAction4BasedOnSupplier.class);
    assertThat(result.broker().map("", "", "", "")).isSameAs(contractor);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction5_whenSupplier() {
    // Given
    Action5<String, String, String, String, String, String> contractor = mock(Action5.class);
    Supplier<Action5<String, String, String, String, String, String>> contractorSupplier = () -> contractor;

    // When
    DelegateAction5<String, String, String, String, String, String> result = DelegateActions.delegateAction5(contractorSupplier);

    // Then
    assertThat(result.broker()).isInstanceOf(BrokerAction5BasedOnSupplier.class);
    assertThat(result.broker().map("", "", "", "", "")).isSameAs(contractor);
  }
}
