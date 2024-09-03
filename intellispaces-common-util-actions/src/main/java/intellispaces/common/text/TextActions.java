package intellispaces.common.text;

import intellispaces.common.action.Actions;
import intellispaces.common.action.interceptor.skipping.SkippingInterceptors;
import intellispaces.common.action.processor.Processor1;
import intellispaces.common.action.runner.Runner;

public final class TextActions {

  private TextActions() {}

  public static Processor1<StringBuilder> commaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR);
  }

  public static Runner commaAppender(StringBuilder sb) {
    Processor1<StringBuilder> commaAppender = commaAppender();
    return Actions.runner(commaAppender::process, sb);
  }

  public static Runner commaAppender(StringBuilder sb1, StringBuilder sb2) {
    return commaAppender(sb1)
        .then(commaAppender(sb2));
  }

  public static Processor1<StringBuilder> skippingFirstTimeCommaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR)
        .wrapAction1AsProcessor(SkippingInterceptors.skippingFirstTimeInterceptorFactory1());
  }

  public static Runner skippingFirstTimeCommaAppender(StringBuilder sb) {
    return commaAppender(sb)
        .wrapAction0AsRunner(SkippingInterceptors.skippingFirstTimeInterceptorFactory0());
  }

  public static Runner skippingFirstTimeCommaAppender(StringBuilder sb1, StringBuilder sb2) {
    return skippingFirstTimeCommaAppender(sb1)
        .then(skippingFirstTimeCommaAppender(sb2));
  }

  private static final String COMMA_SEPARATOR = ", ";
}
