package tech.intellispaces.action.interceptor.skip;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action1;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.runnable.RunnableAction;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link SkipInterceptors} class.
 */
public class SkipInterceptorsTest {

  @Test
  public void testFirstTimeOnlyInterceptor0() {
    // Given
    List<Integer> list = new ArrayList<>();
    RunnableAction action = Actions.runnableAction(() -> list.add(list.size() + 1))
        .wrapRunnableAction(SkipInterceptors.firstTimeInterceptorFactory0());

    // When
    action.execute();
    action.execute();
    action.execute();

    // Then
    assertThat(list).containsExactly(1);
  }

  @Test
  public void testSkipFirstTimeInterceptor1() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action1<Void, Integer> skippingFirstTimeAction = Actions.get(list::add, Integer.class)
        .wrapAction1(SkipInterceptors.skipFirstTimeInterceptorFactory1());

    // When
    skippingFirstTimeAction.execute(1);
    skippingFirstTimeAction.execute(2);
    skippingFirstTimeAction.execute(3);

    // Then
    assertThat(list).containsExactly(2, 3);
  }
}
