package intellispaces.common.text;

import intellispaces.common.action.processor.Processor1;
import intellispaces.common.action.runner.Runner;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Tests for class {@link StringActions}.
 */
public class StringActionsTest {

  @Test
  public void testCommaAppender_whenProcessor() {
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
  public void testCommaAppender_whenRunner_andOneStringBuilders() {
    // Given
    var sb = new StringBuilder();
    Runner commaAppender = StringActions.commaAppender(sb);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb.toString()).isEqualTo(", , , ");
  }

  @Test
  public void testCommaAppender_whenRunner_andTwoStringBuilders() {
    // Given
    var sb1 = new StringBuilder();
    var sb2 = new StringBuilder();
    Runner commaAppender = StringActions.commaAppender(sb1, sb2);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb1.toString()).isEqualTo(", , , ");
    assertThat(sb2.toString()).isEqualTo(", , , ");
  }

  @Test
  public void testSkippingFirstTimeCommaAppender_whenProcessor() {
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

  @Test
  public void testSkippingFirstTimeCommaAppender_whenRunner_andOneStringBuilders() {
    // Given
    var sb = new StringBuilder();
    Runner commaAppender = StringActions.skippingFirstTimeCommaAppender(sb);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb.toString()).isEqualTo(", , ");
  }

  @Test
  public void testSkippingFirstTimeCommaAppender_whenRunner_andTwoStringBuilders() {
    // Given
    var sb1 = new StringBuilder();
    var sb2 = new StringBuilder();
    Runner commaAppender = StringActions.skippingFirstTimeCommaAppender(sb1, sb2);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb1.toString()).isEqualTo(", , ");
    assertThat(sb2.toString()).isEqualTo(", , ");
  }

  @Test
  public void testCommaAppender_whenProcessor_andStringBuilderIsNull() {
    // Given
    Processor1<StringBuilder> commaAppender = StringActions.commaAppender();

    // When
    ThrowableAssert.ThrowingCallable callable = () -> commaAppender.process(null);

    // Then
    assertThatThrownBy(callable).isExactlyInstanceOf(NullPointerException.class);
  }
}
