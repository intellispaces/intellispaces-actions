package tech.intellispaces.framework.commons.action.string;

import org.junit.jupiter.api.Test;
import tech.intellispaces.framework.commons.action.Executor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Tests for class {@link StringActions}.
 */
public class StringActionsTest {

  @Test
  public void testCommaAppender_whenHull() {
    assertThatThrownBy(() -> StringActions.commaAppender(null))
        .isExactlyInstanceOf(NullPointerException.class);
  }

  @Test
  public void testCommaAppender() {
    // Given
    var sb = new StringBuilder();
    Executor commaAppender = StringActions.commaAppender(sb);

    // When
    commaAppender.execute();
    commaAppender.execute();
    commaAppender.execute();

    // Then
    assertThat(sb.toString()).isEqualTo(", , ");
  }
}
