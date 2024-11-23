package tech.intellispaces.action.interceptor.skip;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Actions;

import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link SkipFirstTimeInterceptor0}.
 */
public class SkipFirstTimeInterceptor0Test {

  @Test
  public void testExecuteAndThenExecuteReturnInt() {
    // Given
    var counter = new AtomicInteger();
    Action0<Integer> action0 = spy(Actions.get(counter::incrementAndGet));
    var interceptor = new SkipFirstTimeInterceptor0<>(action0, 5);

    // When
    Integer result1 = interceptor.execute();
    Integer result2 = interceptor.execute();
    int result3 = interceptor.executeReturnInt();
    int result4 = interceptor.executeReturnInt();

    // Then
    assertThat(result1).isEqualTo(5);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(2);
    assertThat(result4).isEqualTo(3);
    verify(action0, times(1)).execute();
    verify(action0, times(2)).executeReturnInt();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void testExecuteAndThenExecuteReturnDouble() {
    // Given
    var counter = new AtomicInteger();
    Action0<Double> action0 = spy(Actions.get(() -> (double) counter.incrementAndGet()));
    var interceptor = new SkipFirstTimeInterceptor0<>(action0, 5.0);

    // When
    Double result1 = interceptor.execute();
    Double result2 = interceptor.execute();
    double result3 = interceptor.executeReturnDouble();
    double result4 = interceptor.executeReturnDouble();

    // Then
    assertThat(result1).isEqualTo(5.0);
    assertThat(result2).isEqualTo(1.0);
    assertThat(result3).isEqualTo(2.0);
    assertThat(result4).isEqualTo(3.0);
    verify(action0, times(1)).execute();
    verify(action0, times(2)).executeReturnDouble();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void testExecuteReturnIntAndThanExecute() {
    // Given
    var counter = new AtomicInteger();
    Action0<Integer> action0 = spy(Actions.get(counter::incrementAndGet));
    var interceptor = new SkipFirstTimeInterceptor0<>(action0, 5);

    // When
    int result1 = interceptor.executeReturnInt();
    int result2 = interceptor.executeReturnInt();
    Integer result3 = interceptor.execute();
    Integer result4 = interceptor.execute();

    // Then
    assertThat(result1).isEqualTo(5);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(2);
    assertThat(result4).isEqualTo(3);
    verify(action0, times(2)).execute();
    verify(action0, times(1)).executeReturnInt();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void testExecuteReturnDoubleAndThenExecute() {
    // Given
    var counter = new AtomicInteger();
    Action0<Double> action0 = spy(Actions.get(() -> (double) counter.incrementAndGet()));
    var interceptor = new SkipFirstTimeInterceptor0<>(action0, 5.0);

    // When
    double result1 = interceptor.executeReturnDouble();
    double result2 = interceptor.executeReturnDouble();
    Double result3 = interceptor.execute();
    Double result4 = interceptor.execute();

    // Then
    assertThat(result1).isEqualTo(5.0);
    assertThat(result2).isEqualTo(1.0);
    assertThat(result3).isEqualTo(2.0);
    assertThat(result4).isEqualTo(3.0);
    verify(action0, times(2)).execute();
    verify(action0, times(1)).executeReturnDouble();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void testExecute_whenNoDefaultResult() {
    // Given
    var counter = new AtomicInteger();
    Action0<Integer> action0 = spy(Actions.get(counter::incrementAndGet));
    var interceptor = new SkipFirstTimeInterceptor0<>(action0);

    // When
    Integer result1 = interceptor.execute();
    Integer result2 = interceptor.execute();

    // Then
    assertThat(result1).isNull();
    assertThat(result2).isEqualTo(1);
    verify(action0, times(1)).execute();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }
}
