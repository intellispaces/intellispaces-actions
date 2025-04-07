package tech.intellispaces.actions.cache;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.supplier.SupplierAction;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link CachedSupplierActions} class.
 */
public class CachedSupplierActionsTest {

  @Test
  public void testCachedSupplierAction_whenSupplier() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    SupplierAction<String> supplierActionAction = CachedSupplierActions.get(deque::pollFirst);
    String result1 = supplierActionAction.get();
    String result2 = supplierActionAction.get();
    String result3 = supplierActionAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testGet_whenFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    SupplierAction<String> supplierActionAction = CachedSupplierActions.get(v -> deque.pollFirst(), 1);
    String result1 = supplierActionAction.get();
    String result2 = supplierActionAction.get();
    String result3 = supplierActionAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testGet_whenBiFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    SupplierAction<String> supplierActionAction = CachedSupplierActions.get((v1, v2) -> deque.pollFirst(), 1, 2);
    String result1 = supplierActionAction.get();
    String result2 = supplierActionAction.get();
    String result3 = supplierActionAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testGet_whenTriFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    SupplierAction<String> supplierActionAction = CachedSupplierActions.get((v1, v2, v3) -> deque.pollFirst(), 1, 2, 3);
    String result1 = supplierActionAction.get();
    String result2 = supplierActionAction.get();
    String result3 = supplierActionAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testGet_whenQuadriFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    SupplierAction<String> supplierActionAction = CachedSupplierActions.get((v1, v2, v3, v4) -> deque.pollFirst(), 1, 2, 3, 4);
    String result1 = supplierActionAction.get();
    String result2 = supplierActionAction.get();
    String result3 = supplierActionAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }
}
