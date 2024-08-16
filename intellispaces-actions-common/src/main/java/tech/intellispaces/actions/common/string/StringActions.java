package tech.intellispaces.actions.common.string;

import tech.intellispaces.actions.interceptor.skipping.SkippingInterceptors;
import tech.intellispaces.actions.processor.Processor1;

public final class StringActions {

  private StringActions() {}

  public static Processor1<StringBuilder> commaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR);
  }

  public static Processor1<StringBuilder> skippingFirstTimeCommaAppender() {
    return new SeparatorAppender(COMMA_SEPARATOR).wrapAction1AsProcessor(SkippingInterceptors.skippingFirstTimeInterceptorFactory1());
  }

  private static final String COMMA_SEPARATOR = ", ";
}
