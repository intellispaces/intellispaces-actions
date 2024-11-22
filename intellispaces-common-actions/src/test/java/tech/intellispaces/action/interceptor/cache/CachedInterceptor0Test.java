package tech.intellispaces.action.interceptor.cache;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action0;
import tech.intellispaces.action.Actions;
import tech.intellispaces.action.wrapper.WrapperAction0;

import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Tests for class {@link CachedInterceptor0}.
 */
public class CachedInterceptor0Test {

  @Test
  public void test1() {
    // Given
    var counter = new AtomicInteger();
    Action0<Integer> action0 = spy(Actions.get(counter::incrementAndGet));
    WrapperAction0<Integer> interceptor = new CachedInterceptor0<>(action0);

    // When
    Integer result1 = interceptor.execute();
    Integer result2 = interceptor.execute();
    int result3 = interceptor.executeReturnInt();
    int result4 = interceptor.executeReturnInt();

    // Then
    assertThat(result1).isEqualTo(1);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(1);
    assertThat(result4).isEqualTo(1);
    verify(action0, times(1)).execute();
    verify(action0, never()).executeReturnInt();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void test2() {
    // Given
    var counter = new AtomicInteger();
    Action0<Double> action0 = spy(Actions.get(() -> (double) counter.incrementAndGet()));
    WrapperAction0<Double> interceptor = new CachedInterceptor0<>(action0);

    // When
    Double result1 = interceptor.execute();
    Double result2 = interceptor.execute();
    double result3 = interceptor.executeReturnDouble();
    double result4 = interceptor.executeReturnDouble();

    // Then
    assertThat(result1).isEqualTo(1);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(1);
    assertThat(result4).isEqualTo(1);
    verify(action0, times(1)).execute();
    verify(action0, never()).executeReturnDouble();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void test3() {
    // Given
    var counter = new AtomicInteger();
    Action0<Integer> action0 = spy(Actions.get(counter::incrementAndGet));
    WrapperAction0<Integer> interceptor = new CachedInterceptor0<>(action0);

    // When
    int result1 = interceptor.executeReturnInt();
    int result2 = interceptor.executeReturnInt();
    Integer result3 = interceptor.execute();
    Integer result4 = interceptor.execute();

    // Then
    assertThat(result1).isEqualTo(1);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(1);
    assertThat(result4).isEqualTo(1);
    verify(action0, times(1)).executeReturnInt();
    verify(action0, never()).execute();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }

  @Test
  public void test4() {
    // Given
    var counter = new AtomicInteger();
    Action0<Double> action0 = spy(Actions.get(() -> (double) counter.incrementAndGet()));
    WrapperAction0<Double> interceptor = new CachedInterceptor0<>(action0);

    // When
    double result1 = interceptor.executeReturnDouble();
    double result2 = interceptor.executeReturnDouble();
    Double result3 = interceptor.execute();
    Double result4 = interceptor.execute();

    // Then
    assertThat(result1).isEqualTo(1);
    assertThat(result2).isEqualTo(1);
    assertThat(result3).isEqualTo(1);
    assertThat(result4).isEqualTo(1);
    verify(action0, times(1)).executeReturnDouble();
    verify(action0, never()).execute();
    assertThat(interceptor.wrappedAction()).isSameAs(action0);
  }
}
