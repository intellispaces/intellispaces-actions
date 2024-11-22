package tech.intellispaces.action.exception;

import tech.intellispaces.entity.exception.UnexpectedException;

public class IrregularActionTypeException extends UnexpectedException {

  public IrregularActionTypeException(String message) {
    super(message);
  }
}
