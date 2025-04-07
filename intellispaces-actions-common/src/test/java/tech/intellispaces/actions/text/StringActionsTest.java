package tech.intellispaces.actions.text;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.processor.ProcessorAction1;
import tech.intellispaces.actions.runnable.RunnableAction;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Tests for class {@link StringActions}.
 */
public class StringActionsTest {

  @Test
  public void testSeparatorAppenderProcessorAction() {
    // Given
    ProcessorAction1<StringBuilder> commaAppender = StringActions.separatorAppender(";");

    // When
    var sb = new StringBuilder();
    commaAppender.process(sb);
    commaAppender.process(sb);
    commaAppender.process(sb);

    // Then
    assertThat(sb.toString()).isEqualTo(";;;");
  }

  @Test
  public void testSeparatorAppenderRunnableAction_whenSingleStringBuilder() {
    // Given
    var sb = new StringBuilder();
    RunnableAction commaAppender = StringActions.separatorAppender(sb, ";");

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb.toString()).isEqualTo(";;;");
  }

  @Test
  public void testSkipFirstTimeSeparatorAppenderRunnableAction_whenSingleStringBuilder() {
    // Given
    var sb = new StringBuilder();
    RunnableAction commaAppender = StringActions.skipFirstTimeSeparatorAppender(sb, ";");

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb.toString()).isEqualTo(";;");
  }

  @Test
  public void testCommaAppenderProcessorAction() {
    // Given
    ProcessorAction1<StringBuilder> commaAppender = StringActions.commaAppender();

    // When
    var sb = new StringBuilder();
    commaAppender.process(sb);
    commaAppender.process(sb);
    commaAppender.process(sb);

    // Then
    assertThat(sb.toString()).isEqualTo(", , , ");
  }

  @Test
  public void testCommaAppenderProcessorAction_whenStringBuilderIsNull() {
    // Given
    ProcessorAction1<StringBuilder> commaAppender = StringActions.commaAppender();

    // When
    ThrowableAssert.ThrowingCallable callable = () -> commaAppender.process(null);

    // Then
    assertThatThrownBy(callable).isExactlyInstanceOf(NullPointerException.class);
  }

  @Test
  public void testCommaAppenderRunnableAction_whenSingleStringBuilder() {
    // Given
    var sb = new StringBuilder();
    RunnableAction commaAppender = StringActions.commaAppender(sb);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb.toString()).isEqualTo(", , , ");
  }

  @Test
  public void testCommaAppenderRunnableAction_whenTwoStringBuilders() {
    // Given
    var sb1 = new StringBuilder();
    var sb2 = new StringBuilder();
    RunnableAction commaAppender = StringActions.commaAppender(sb1, sb2);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb1.toString()).isEqualTo(", , , ");
    assertThat(sb2.toString()).isEqualTo(", , , ");
  }

  @Test
  public void testSkipFirstTimeCommaAppenderProcessorAction() {
    // Given
    ProcessorAction1<StringBuilder> commaAppender = StringActions.skipFirstTimeCommaAppender();

    // When
    var sb = new StringBuilder();
    commaAppender.process(sb);
    commaAppender.process(sb);
    commaAppender.process(sb);

    // Then
    assertThat(sb.toString()).isEqualTo(", , ");
  }

  @Test
  public void testSkipFirstTimeCommaAppenderRunnableAction_whenSingleStringBuilder() {
    // Given
    var sb = new StringBuilder();
    RunnableAction commaAppender = StringActions.skipFirstTimeCommaAppender(sb);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb.toString()).isEqualTo(", , ");
  }

  @Test
  public void testSkipFirstTimeCommaAppenderRunnableAction_whenTwoStringBuilders() {
    // Given
    var sb1 = new StringBuilder();
    var sb2 = new StringBuilder();
    RunnableAction commaAppender = StringActions.skipFirstTimeCommaAppender(sb1, sb2);

    // When
    commaAppender.run();
    commaAppender.run();
    commaAppender.run();

    // Then
    assertThat(sb1.toString()).isEqualTo(", , ");
    assertThat(sb2.toString()).isEqualTo(", , ");
  }
}
