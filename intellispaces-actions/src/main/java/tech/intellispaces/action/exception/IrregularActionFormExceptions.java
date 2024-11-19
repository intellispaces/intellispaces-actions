package tech.intellispaces.action.exception;

import tech.intellispaces.entity.text.StringFunctions;

public interface IrregularActionFormExceptions {

  static IrregularActionFormException withMessage(String message) {
    return new IrregularActionFormException(message);
  }

  static IrregularActionFormException withMessage(String template, Object... params) {
    return new IrregularActionFormException(StringFunctions.resolveTemplate(template, params));
  }
}
