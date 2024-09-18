package intellispaces.common.action.interceptor.skipping;

import intellispaces.common.action.Action1;
import intellispaces.common.action.Actions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link SkippingInterceptors} class.
 */
public class SkippingInterceptorsTest {

  @Test
  public void testSkippingFirstTimeInterceptor1() {
    // Given
    List<Integer> values = new ArrayList<>();
    Action1<Void, Integer> skippingFirstTimeAction = Actions.of(values::add, Integer.class)
        .wrapAction1(SkippingInterceptors.skippingFirstTimeInterceptorFactory1());

    // When
    skippingFirstTimeAction.execute(1);
    skippingFirstTimeAction.execute(2);
    skippingFirstTimeAction.execute(3);

    // Then
    assertThat(values).containsExactly(2, 3);
  }
}
