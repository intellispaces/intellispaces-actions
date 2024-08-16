package tech.intellispaces.actions.common.string;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.processor.Processor1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Tests for class {@link StringActions}.
 */
public class StringActionsTest {

  @Test
  public void testCommaAppender_whenNull() {
    // Given
    Processor1<StringBuilder> commaAppender = StringActions.commaAppender();

    // When
    ThrowableAssert.ThrowingCallable callable = () -> commaAppender.process(null);

    // Then
    assertThatThrownBy(callable).isExactlyInstanceOf(NullPointerException.class);
  }

  @Test
  public void testCommaAppender() {
    // Given
    Processor1<StringBuilder> commaAppender = StringActions.commaAppender();

    // When
    var sb = new StringBuilder();
    commaAppender.process(sb);
    commaAppender.process(sb);
    commaAppender.process(sb);

    // Then
    assertThat(sb.toString()).isEqualTo(", , , ");
  }

  @Test
  public void testSkippingFirstTimeCommaAppender() {
    // Given
    Processor1<StringBuilder> commaAppender = StringActions.skippingFirstTimeCommaAppender();

    // When
    var sb = new StringBuilder();
    commaAppender.process(sb);
    commaAppender.process(sb);
    commaAppender.process(sb);

    // Then
    assertThat(sb.toString()).isEqualTo(", , ");
  }
}
