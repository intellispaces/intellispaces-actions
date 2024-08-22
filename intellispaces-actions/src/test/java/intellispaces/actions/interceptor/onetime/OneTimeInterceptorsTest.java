package intellispaces.actions.interceptor.onetime;

import org.junit.jupiter.api.Test;
import intellispaces.actions.Actions;
import intellispaces.actions.runner.Runner;

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
    Runner action = Actions.runner(() -> values.add(values.size() + 1))
        .wrapAction0AsRunner(OneTimeInterceptors.firstTimeInterceptorFactory0());

    // When
    action.execute();
    action.execute();
    action.execute();

    // Then
    assertThat(values).containsExactly(1);
  }
}
