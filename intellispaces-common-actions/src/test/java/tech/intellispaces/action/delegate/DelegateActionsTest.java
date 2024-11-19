package tech.intellispaces.action.delegate;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Action2;
import tech.intellispaces.action.Action3;
import tech.intellispaces.action.Action4;
import tech.intellispaces.action.Action5;
import tech.intellispaces.action.supplier.SupplierAction;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Tests for class {@link DelegateActions}.
 */
public class DelegateActionsTest {

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction0() {
    // Given
    SupplierAction<Action0<String>> broker = mock(SupplierAction.class);

    // When
    Delegate0<String> result = DelegateActions.delegateAction0(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction1() {
    // Given
    SupplierAction<Action1<String, String>> broker = mock(SupplierAction.class);

    // When
    Delegate1<String, String> result = DelegateActions.delegateAction1(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction2() {
    // Given
    SupplierAction<Action2<String, String, String>> broker = mock(SupplierAction.class);

    // When
    Delegate2<String, String, String> result = DelegateActions.delegateAction2(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction3() {
    // Given
    SupplierAction<Action3<String, String, String, String>> broker = mock(SupplierAction.class);

    // When
    Delegate3<String, String, String, String> result = DelegateActions.delegateAction3(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction4() {
    // Given
    SupplierAction<Action4<String, String, String, String, String>> broker = mock(SupplierAction.class);

    // When
    Delegate4<String, String, String, String, String> result = DelegateActions.delegateAction4(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testDelegateAction5() {
    // Given
    SupplierAction<Action5<String, String, String, String, String, String>> broker = mock(SupplierAction.class);

    // When
    Delegate5<String, String, String, String, String, String> result = DelegateActions.delegateAction5(broker);

    // Then
    assertThat(result.broker()).isSameAs(broker);
  }
}
