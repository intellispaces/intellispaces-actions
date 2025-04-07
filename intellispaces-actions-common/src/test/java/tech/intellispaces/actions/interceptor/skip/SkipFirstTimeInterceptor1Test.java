package tech.intellispaces.actions.interceptor.skip;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Actions;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static tech.intellispaces.commons.type.PrimitiveFunctions.booleanToDouble;
import static tech.intellispaces.commons.type.PrimitiveFunctions.booleanToInt;

/**
 * Tests for class {@link SkipFirstTimeInterceptor1}.
 */
public class SkipFirstTimeInterceptor1Test {

  @Test
  public void testExecuteAndThenExecuteReturnInt() {
    // Given
    var list = new ArrayList<Number>();
    Action1<Integer, Number> action1 = spy(Actions.get((Number n) -> booleanToInt(list.add(n))));
    var interceptor = new SkipFirstTimeInterceptor1<>(action1);

    // When
    Integer result1 = interceptor.execute(Integer.valueOf(1));
    Integer result2 = interceptor.execute(2);
    Integer result3 = interceptor.execute(3.0);
    int result4 = interceptor.executeReturnInt(Integer.valueOf(4));
    int result5 = interceptor.executeReturnInt(5);
    int result6 = interceptor.executeReturnInt(6.0);

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(1);
    assertThat(result4).isEqualTo(1);
    assertThat(result5).isEqualTo(1);
    assertThat(result6).isEqualTo(1);

    verify(action1, times(1)).execute(eq(2));
    verify(action1, times(1)).execute(eq(3.0));
    verify(action1, times(1)).executeReturnInt(eq(Integer.valueOf(4)));
    verify(action1, times(1)).executeReturnInt(eq(5));
    verify(action1, times(1)).executeReturnInt(eq(6.0));

    assertThat(list).containsExactly(2, 3.0, 4, 5, 6.0);

    assertThat(interceptor.wrappedAction()).isSameAs(action1);
  }

  @Test
  public void testExecuteAndThenExecuteReturnDouble() {
    // Given
    var list = new ArrayList<Number>();
    Action1<Double, Number> action1 = spy(Actions.get((Number n) -> booleanToDouble(list.add(n))));
    var interceptor = new SkipFirstTimeInterceptor1<>(action1);

    // When
    Double result1 = interceptor.execute(Integer.valueOf(1));
    Double result2 = interceptor.execute(2);
    Double result3 = interceptor.execute(3.0);
    double result4 = interceptor.executeReturnDouble(Integer.valueOf(4));
    double result5 = interceptor.executeReturnDouble(5);
    double result6 = interceptor.executeReturnDouble(6.0);

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(1.0);
    assertThat(result3).isEqualTo(1.0);
    assertThat(result4).isEqualTo(1.0);
    assertThat(result5).isEqualTo(1.0);
    assertThat(result6).isEqualTo(1.0);

    verify(action1, times(1)).execute(eq(2));
    verify(action1, times(1)).execute(eq(3.0));
    verify(action1, times(1)).executeReturnDouble(eq(Integer.valueOf(4)));
    verify(action1, times(1)).executeReturnDouble(eq(5));
    verify(action1, times(1)).executeReturnDouble(eq(6.0));

    assertThat(list).containsExactly(2, 3.0, 4, 5, 6.0);

    assertThat(interceptor.wrappedAction()).isSameAs(action1);
  }

  @Test
  public void testExecuteReturnIntAndThenExecute() {
    // Given
    var list = new ArrayList<Number>();
    Action1<Integer, Number> action1 = spy(Actions.get((Number n) -> booleanToInt(list.add(n))));
    var interceptor = new SkipFirstTimeInterceptor1<>(action1, -1);

    // When
    int result1 = interceptor.executeReturnInt(Integer.valueOf(1));
    int result2 = interceptor.executeReturnInt(2);
    int result3 = interceptor.executeReturnInt(3.0);
    Integer result4 = interceptor.execute(Integer.valueOf(4));
    Integer result5 = interceptor.execute(5);
    Integer result6 = interceptor.execute(6.0);

    // Then
    assertThat(result1).isEqualTo(-1);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(1);
    assertThat(result4).isEqualTo(1);
    assertThat(result5).isEqualTo(1);
    assertThat(result6).isEqualTo(1);

    verify(action1, times(1)).executeReturnInt(eq(2));
    verify(action1, times(1)).executeReturnInt(eq(3.0));
    verify(action1, times(1)).execute(eq(Integer.valueOf(5)));
    verify(action1, times(1)).execute(eq(5));
    verify(action1, times(1)).execute(eq(6.0));

    assertThat(list).containsExactly(2, 3.0, 4, 5, 6.0);

    assertThat(interceptor.wrappedAction()).isSameAs(action1);
  }

  @Test
  public void testExecuteReturnDoubleAndThenExecute() {
    // Given
    var list = new ArrayList<Number>();
    Action1<Double, Number> action1 = spy(Actions.get((Number n) -> booleanToDouble(list.add(n))));
    var interceptor = new SkipFirstTimeInterceptor1<>(action1, -1.0);

    // When
    double result1 = interceptor.executeReturnDouble(Integer.valueOf(1));
    double result2 = interceptor.executeReturnDouble(2);
    double result3 = interceptor.executeReturnDouble(3.0);
    Double result4 = interceptor.execute(Integer.valueOf(4));
    Double result5 = interceptor.execute(5);
    Double result6 = interceptor.execute(6.0);

    // Then
    assertThat(result1).isEqualTo(-1.0);
    assertThat(result2).isEqualTo(1.0);
    assertThat(result3).isEqualTo(1.0);
    assertThat(result4).isEqualTo(1.0);
    assertThat(result5).isEqualTo(1.0);
    assertThat(result6).isEqualTo(1.0);

    verify(action1, times(1)).executeReturnDouble(eq(2));
    verify(action1, times(1)).executeReturnDouble(eq(3.0));
    verify(action1, times(1)).execute(eq(Integer.valueOf(4)));
    verify(action1, times(1)).execute(eq(5));
    verify(action1, times(1)).execute(eq(6.0));

    assertThat(list).containsExactly(2, 3.0, 4, 5, 6.0);

    assertThat(interceptor.wrappedAction()).isSameAs(action1);
  }
}
