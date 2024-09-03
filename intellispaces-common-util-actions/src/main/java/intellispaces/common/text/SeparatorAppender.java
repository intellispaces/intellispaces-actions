package intellispaces.common.text;

import intellispaces.common.action.processor.AbstractProcessor1;

class SeparatorAppender extends AbstractProcessor1<StringBuilder> {
  private final String separator;

  SeparatorAppender(String separator) {
    this.separator = separator;
  }

  @Override
  public void process(StringBuilder sb) {
    sb.append(separator);
  }
}
