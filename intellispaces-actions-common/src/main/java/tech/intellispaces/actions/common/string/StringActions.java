package tech.intellispaces.actions.common.string;

import tech.intellispaces.actions.Actions;
import tech.intellispaces.actions.interceptor.skipping.SkippingInterceptors;
import tech.intellispaces.actions.processor.Processor1;
import tech.intellispaces.actions.runner.Runner;

public final class StringActions {

  private StringActions() {}

  public static Processor1<StringBuilder> commaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR);
  }

  public static Runner commaAppender(StringBuilder sb) {
    Processor1<StringBuilder> commaAppender = commaAppender();
    return Actions.runner(commaAppender::process, sb);
  }

  public static Runner commaAppender(StringBuilder sb1, StringBuilder sb2) {
    Processor1<StringBuilder> commaAppender1 = commaAppender();
    Processor1<StringBuilder> commaAppender2 = commaAppender();
    return Actions.runner(() -> {
      commaAppender1.process(sb1);
      commaAppender2.process(sb2);
    });
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
    return commaAppender(sb1, sb2)
        .wrapAction0AsRunner(SkippingInterceptors.skippingFirstTimeInterceptorFactory0());
  }

  private static final String COMMA_SEPARATOR = ", ";
}
