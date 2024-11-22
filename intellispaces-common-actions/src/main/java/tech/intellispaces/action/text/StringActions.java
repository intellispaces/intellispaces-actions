package tech.intellispaces.action.text;

import tech.intellispaces.action.dataadapter.DataAdapters;
import tech.intellispaces.action.interceptor.skip.SkipInterceptors;
import tech.intellispaces.action.processor.ProcessorAction1;
import tech.intellispaces.action.processor.ProcessorActions;
import tech.intellispaces.action.runnable.RunnableAction;

/**
 * String related actions.
 */
public class StringActions {

  public static SeparatorAppenderAction separatorAppender() {
    return INSTANCE;
  }

  /**
   * Returns processor action that takes the instance of the {@link StringBuilder} and adds the separator {@code ", "}
   * on each call.
   */
  public static ProcessorAction1<StringBuilder> commaAppender() {
    return ProcessorActions.processorAction1(
      separatorAppender().convertToAction1(
          DataAdapters.direct(),
          DataAdapters.predefined(DEFAULT_SEPARATOR)
      )
    );
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to given instance of the {@link StringBuilder}
   * on each call.
   */
  public static RunnableAction commaAppender(StringBuilder sb) {
    return commaAppender().asRunnable(sb);
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to two instances pf the {@link StringBuilder}
   * on each call.
   */
  public static RunnableAction commaAppender(StringBuilder sb1, StringBuilder sb2) {
    return commaAppender(sb1).andThen(
        commaAppender(sb2));
  }

  /**
   * Returns processor action that takes the instance of the {@link StringBuilder} and adds the separator {@code ", "}.
   * The action does not add the separator on the first call, but adds it on each subsequent call.
   */
  public static ProcessorAction1<StringBuilder> skipFirstTimeCommaAppender() {
    return commaAppender().wrapProcessorAction1(
        SkipInterceptors.skipFirstTimeInterceptorFactory1()
    );
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to two instances pf the {@link StringBuilder}/
   * The runner does not add the separator on the first call, but adds it on each subsequent call.
   */
  public static RunnableAction skipFirstTimeCommaAppender(StringBuilder sb) {
    return commaAppender(sb)
        .wrapRunnableAction(SkipInterceptors.skipFirstTimeInterceptorFactory0());
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to two instances pf the {@link StringBuilder}.
   * The action does not add a separator on the first call, but adds it on each subsequent call.
   */
  public static RunnableAction skipFirstTimeCommaAppender(StringBuilder sb1, StringBuilder sb2) {
    return skipFirstTimeCommaAppender(sb1)
        .andThen(skipFirstTimeCommaAppender(sb2));
  }

  private StringActions() {}

  private static final SeparatorAppenderAction INSTANCE = new SeparatorAppenderAction();
  private static final String DEFAULT_SEPARATOR = ", ";
}
