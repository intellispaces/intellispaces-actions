package tech.intellispaces.commons.action.text;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Tests for {@link SeparatorAppenderAction} class.
 */
public class SeparatorAppenderActionTest {

  @Test
  public void testProcess() {
    // Given
    var separatorAppender = StringActions.separatorAppender();
    var sb = new StringBuilder();

    // Then
    assertThat(sb.toString()).isEmpty();

    separatorAppender.process(sb, ",");
    assertThat(sb.toString()).isEqualTo(",");

    separatorAppender.process(sb, ",");
    assertThat(sb.toString()).isEqualTo(",,");
  }

  @Test
  public void testProcess_whenStringBuilderIsNull() {
    // Given
    var separatorAppender = StringActions.separatorAppender();

    // When
    ThrowableAssert.ThrowingCallable callable = () -> separatorAppender.process(null, ",");

    // Then
    assertThatThrownBy(callable).isExactlyInstanceOf(NullPointerException.class)
        .hasMessage("StringBuilder must not be null");
  }

  @Test
  public void testProcess_whenSeparatorIsNull() {
    // Given
    var separatorAppender = StringActions.separatorAppender();
    var sb = new StringBuilder();

    // When
    ThrowableAssert.ThrowingCallable callable = () -> separatorAppender.process(sb, null);

    // Then
    assertThatThrownBy(callable).isExactlyInstanceOf(NullPointerException.class)
        .hasMessage("Separator must not be null");
  }
}
