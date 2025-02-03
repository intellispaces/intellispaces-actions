package tech.intellispaces.commons.action.exception;

import tech.intellispaces.commons.base.text.StringFunctions;

public interface IrregularActionTypeExceptions {

  static IrregularActionTypeException withMessage(String message) {
    return new IrregularActionTypeException(message);
  }

  static IrregularActionTypeException withMessage(String template, Object[] params) {
    return new IrregularActionTypeException(StringFunctions.resolveTemplate(template, params));
  }
}
