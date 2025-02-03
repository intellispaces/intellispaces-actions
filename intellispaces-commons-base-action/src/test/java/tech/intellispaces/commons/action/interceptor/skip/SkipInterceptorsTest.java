package tech.intellispaces.commons.action.interceptor.skip;

import org.junit.jupiter.api.Test;
import tech.intellispaces.commons.action.Action;
import tech.intellispaces.commons.action.Action0;
import tech.intellispaces.commons.action.Action1;
import tech.intellispaces.commons.action.Action5;
import tech.intellispaces.commons.action.Actions;
import tech.intellispaces.commons.action.runnable.RunnableAction;
import tech.intellispaces.commons.action.wrapper.WrapperAction;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link SkipInterceptors} class.
 */
public class SkipInterceptorsTest {

  @Test
  public void testSkipFirstTimeInterceptor_whenAction0() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action0<Boolean> interceptedAction = Actions.get(() -> list.add(list.size() + 1));
    WrapperAction action = SkipInterceptors.skipFirstTimeInterceptor(interceptedAction);

    // When
    Object result1 = action.execute(null);
    Object result2 = action.execute(null);
    Object result3 = action.execute(null);

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(true);
    assertThat(result3).isEqualTo(true);
    assertThat(list).containsExactly(1, 2);
  }

  @Test
  public void testSkipFirstTimeInterceptor_whenAction1() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action1<Boolean, Integer> interceptedAction = Actions.get((Integer i) -> list.add(i));
    WrapperAction action = SkipInterceptors.skipFirstTimeInterceptor(interceptedAction);

    // When
    Object result1 = action.execute(new Object[] { 1 });
    Object result2 = action.execute(new Object[] { 2 });
    Object result3 = action.execute(new Object[] { 3 });

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(true);
    assertThat(result3).isEqualTo(true);
    assertThat(list).containsExactly(2, 3);
  }

  @Test
  public void testSkipFirstTimeInterceptorFactory_whenAction0() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action0<Boolean> interceptedAction = Actions.get(() -> list.add(list.size() + 1));
    Action action = interceptedAction.wrapAction(SkipInterceptors.skipFirstTimeInterceptorFactory());

    // When
    Object result1 = action.execute(null);
    Object result2 = action.execute(null);
    Object result3 = action.execute(null);

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(true);
    assertThat(result3).isEqualTo(true);
    assertThat(list).containsExactly(1, 2);
  }

  @Test
  public void testSkipFirstTimeInterceptorFactory0() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action0<Boolean> interceptedAction = Actions.get(() -> list.add(list.size() + 1));
    Action0<Boolean> action = interceptedAction.wrapAction0(SkipInterceptors.skipFirstTimeInterceptorFactory0());

    // When
    Boolean result1 = action.execute();
    Boolean result2 = action.execute();
    Boolean result3 = action.execute();

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(true);
    assertThat(result3).isEqualTo(true);
    assertThat(list).containsExactly(1, 2);
  }

  @Test
  public void testSkipFirstTimeInterceptorFactory1() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action1<Boolean, Integer> interceptedAction = Actions.get((Integer i) -> list.add(i));
    Action1<Boolean, Integer> action = interceptedAction.wrapAction1(SkipInterceptors.skipFirstTimeInterceptorFactory1());

    // When
    Boolean result1 = action.execute(1);
    Boolean result2 = action.execute(2);
    Boolean result3 = action.execute(3);

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(true);
    assertThat(result3).isEqualTo(true);
    assertThat(list).containsExactly(2, 3);
  }

  @Test
  public void testSkipFollowingTimesInterceptorFactory0() {
    // Given
    List<Integer> list = new ArrayList<>();
    RunnableAction interceptedAction = Actions.runnableAction(() -> list.add(list.size() + 1));
    RunnableAction action = interceptedAction.wrapRunnableAction(SkipInterceptors.skipFollowingTimesInterceptorFactory0());

    // When
    action.execute();
    action.execute();
    action.execute();

    // Then
    assertThat(list).containsExactly(1);
  }

  @Test
  public void testSkipFollowingTimesInterceptorFactory5() {
    // Given
    List<Integer> list = new ArrayList<>();
    Action5<Boolean, Integer, Integer, Integer, Integer, Integer> interceptedAction = Actions.get(
        (Integer i1, Integer i2, Integer i3, Integer i4, Integer i5) -> list.add(i1 + i2 + i3 + i4 + i5)
    );
    Action5<Boolean, Integer, Integer, Integer, Integer, Integer> action = interceptedAction.wrapAction5(
        SkipInterceptors.skipFollowingTimesInterceptorFactory5()
    );

    // When
    Boolean result1 = action.execute(1, 1, 1, 1, 1);
    Boolean result2 = action.execute(2, 2, 2, 2, 2);
    Boolean result3 = action.execute(3, 3, 3, 3, 3);

    // Then
    assertThat(result1).isEqualTo(true);
    assertThat(result2).isNull();
    assertThat(result3).isNull();
    assertThat(list).containsExactly(5);
  }
}
