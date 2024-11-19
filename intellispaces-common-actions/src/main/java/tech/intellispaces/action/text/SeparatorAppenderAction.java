package tech.intellispaces.action.text;

import tech.intellispaces.action.processor.AbstractProcessorAction2;

import java.util.Objects;

/**
 * This action adds specified separator to {@link StringBuilder}.
 */
public class SeparatorAppenderAction extends AbstractProcessorAction2<StringBuilder, String> {

  @Override
  public void process(StringBuilder sb, String separator) {
    Objects.requireNonNull(sb, "StringBuilder must not be null");
    Objects.requireNonNull(separator, "Separator must not be null");
    sb.append(separator);
  }

  SeparatorAppenderAction() {}
}
