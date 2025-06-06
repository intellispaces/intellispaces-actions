package tech.intellispaces.actions.text;

import tech.intellispaces.actions.dataadapter.DataAdapters;
import tech.intellispaces.actions.interceptor.skip.SkipInterceptors;
import tech.intellispaces.actions.processor.ProcessorAction1;
import tech.intellispaces.actions.processor.ProcessorActions;
import tech.intellispaces.actions.runnable.RunnableAction;

/**
 * String related actions.
 */
public class StringActions {

  /**
   * Returns separator appender action.
   */
  public static SeparatorAppenderAction separatorAppender() {
    return INSTANCE;
  }

  /**
   * Returns processor action that takes the instance of the {@link StringBuilder} and adds the separator on each call.
   *
   * @param separator the separator.
   */
  public static ProcessorAction1<StringBuilder> separatorAppender(String separator) {
    return ProcessorActions.processorAction1(
        separatorAppender().convertToAction1(
            DataAdapters.oneToOne(),
            DataAdapters.predefined(separator)
        )
    );
  }

  /**
   * Returns runnable action that adds the separator to given instance of the {@link StringBuilder}
   * on each call.
   *
   * @param sb the string builder.
   * @param separator the separator.
   */
  public static RunnableAction separatorAppender(StringBuilder sb, String separator) {
    return separatorAppender(separator).asRunnable(sb);
  }

  /**
   * Returns runnable action that adds the separator to two instances pf the {@link StringBuilder}.
   * The runner does not add the separator on the first call, but adds it on each subsequent call.
   *
   * @param sb the string builder.
   * @param separator the separator.
   */
  public static RunnableAction skipFirstTimeSeparatorAppender(StringBuilder sb, String separator) {
    return separatorAppender(sb, separator)
        .wrapRunnableAction(SkipInterceptors.skipFirstTimeInterceptorFactory0());
  }

  /**
   * Returns processor action that takes the instance of the {@link StringBuilder} and adds the separator {@code ", "}
   * on each call.
   */
  public static ProcessorAction1<StringBuilder> commaAppender() {
    return ProcessorActions.processorAction1(
      separatorAppender().convertToAction1(
          DataAdapters.oneToOne(),
          DataAdapters.predefined(DEFAULT_SEPARATOR)
      )
    );
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to given instance of the {@link StringBuilder}
   * on each call.
   *
   * @param sb the string builder.
   */
  public static RunnableAction commaAppender(StringBuilder sb) {
    return commaAppender().asRunnable(sb);
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to two instances pf the {@link StringBuilder}
   * on each call.
   *
   * @param sb1 the first string builder.
   * @param sb2 the second string builder.
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
   *
   * @param sb the string builder.
   */
  public static RunnableAction skipFirstTimeCommaAppender(StringBuilder sb) {
    return commaAppender(sb)
        .wrapRunnableAction(SkipInterceptors.skipFirstTimeInterceptorFactory0());
  }

  /**
   * Returns runnable action that adds the separator {@code ", "} to two instances pf the {@link StringBuilder}.
   * The action does not add a separator on the first call, but adds it on each subsequent call.
   *
   * @param sb1 the first string builder.
   * @param sb2 the second string builder.
   */
  public static RunnableAction skipFirstTimeCommaAppender(StringBuilder sb1, StringBuilder sb2) {
    return skipFirstTimeCommaAppender(sb1)
        .andThen(skipFirstTimeCommaAppender(sb2));
  }

  private StringActions() {}

  private static final SeparatorAppenderAction INSTANCE = new SeparatorAppenderAction();
  private static final String DEFAULT_SEPARATOR = ", ";
}
