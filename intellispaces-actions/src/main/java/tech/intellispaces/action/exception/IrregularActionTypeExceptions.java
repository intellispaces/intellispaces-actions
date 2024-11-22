package tech.intellispaces.action.exception;

import tech.intellispaces.entity.text.StringFunctions;

public interface IrregularActionTypeExceptions {

  static IrregularActionTypeException withMessage(String message) {
    return new IrregularActionTypeException(message);
  }

  static IrregularActionTypeException withMessage(String template, Object[] params) {
    return new IrregularActionTypeException(StringFunctions.resolveTemplate(template, params));
  }
}
