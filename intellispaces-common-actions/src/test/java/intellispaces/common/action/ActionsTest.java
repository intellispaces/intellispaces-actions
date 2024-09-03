package intellispaces.common.action;

import intellispaces.common.action.getter.Getter;
import intellispaces.common.action.getter.ResettableGetter;
import intellispaces.common.action.runner.Runner;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Actions}.
 */
public class ActionsTest {

  @Test
  public void testRunner_whenRunnable() {
    // Given
    List<Integer> values = new ArrayList<>();
    Runnable runnable = () -> values.add(values.size() + 1);
    Runner runner = Actions.runner(runnable);

    // When
    runner.execute();
    runner.execute();
    runner.execute();

    // Then
    assertThat(values).containsExactly(1, 2, 3);
  }

  @Test
  public void testRunner_whenConsumer() {
    // Given
    List<Integer> values = new ArrayList<>();
    Runner runner = Actions.runner(values::add, 1);

    // When
    runner.execute();
    runner.execute();
    runner.execute();

    // Then
    assertThat(values).containsExactly(1, 1, 1);
  }

  @Test
  public void testJoinedRunners() {
    // Given
    List<Integer> values = new ArrayList<>();
    Runner runner = Actions.runner(values::add, 1)
        .then(Actions.runner(values::add, 2));

    // When
    runner.execute();
    runner.execute();
    runner.execute();

    // Then
    assertThat(values).containsExactly(1, 2, 1, 2, 1, 2);
  }

  @Test
  public void testResettableGetter_whenNoInitValue() {
    ResettableGetter<String> getter = Actions.resettableGetter(String.class);
    assertThat(getter.get()).isNull();

    getter.set("value1");
    assertThat(getter.get()).isEqualTo("value1");

    getter.set("value2");
    assertThat(getter.get()).isEqualTo("value2");
  }

  @Test
  public void testResettableGetter_whenInitValue() {
    ResettableGetter<String> getter = Actions.resettableGetter("value1");
    assertThat(getter.get()).isEqualTo("value1");

    getter.set("value2");
    assertThat(getter.get()).isEqualTo("value2");

    getter.set("value3");
    assertThat(getter.get()).isEqualTo("value3");
  }

  @Test
  public void testCachedLazyGetter_whenSupplier() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    Getter<String> getterAction = Actions.cachedLazyGetter(deque::pollFirst);
    String result1 = getterAction.get();
    String result2 = getterAction.get();
    String result3 = getterAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testCachedLazyGetter_whenFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    Getter<String> getterAction = Actions.cachedLazyGetter(v -> deque.pollFirst(), 1);
    String result1 = getterAction.get();
    String result2 = getterAction.get();
    String result3 = getterAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testCachedLazyGetter_whenBiFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    Getter<String> getterAction = Actions.cachedLazyGetter((v1, v2) -> deque.pollFirst(), 1, 2);
    String result1 = getterAction.get();
    String result2 = getterAction.get();
    String result3 = getterAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testCachedLazyGetter_whenTriFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    Getter<String> getterAction = Actions.cachedLazyGetter((v1, v2, v3) -> deque.pollFirst(), 1, 2, 3);
    String result1 = getterAction.get();
    String result2 = getterAction.get();
    String result3 = getterAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }

  @Test
  public void testCachedLazyGetter_whenQuadFunction() {
    // Given
    Deque<String> deque = new ArrayDeque<>(List.of("a", "b", "c"));

    // When
    Getter<String> getterAction = Actions.cachedLazyGetter((v1, v2, v3, v4) -> deque.pollFirst(), 1, 2, 3, 4);
    String result1 = getterAction.get();
    String result2 = getterAction.get();
    String result3 = getterAction.get();

    // Then
    assertThat(result1).isEqualTo(result2).isEqualTo(result3).isEqualTo("a");
    assertThat(deque).containsExactly("b", "c");
  }
}
