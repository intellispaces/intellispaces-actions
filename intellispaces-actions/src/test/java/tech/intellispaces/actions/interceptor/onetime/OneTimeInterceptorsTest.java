package tech.intellispaces.actions.interceptor.onetime;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.executor.Executor;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link OneTimeInterceptors} class.
 */
public class OneTimeInterceptorsTest {

  @Test
  public void testFirstTimeOnlyInterceptor0() {
    // Given
    List<Integer> values = new ArrayList<>();
    Executor action = Actions.executor(() -> values.add(values.size() + 1))
        .wrapAction0AsExecutor(OneTimeInterceptors.firstTimeInterceptorFactory0());

    // When
    action.execute();
    action.execute();
    action.execute();

    // Then
    assertThat(values).containsExactly(1);
  }
}
