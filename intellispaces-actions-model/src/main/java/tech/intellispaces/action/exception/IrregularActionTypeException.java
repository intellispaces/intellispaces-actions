package tech.intellispaces.action.exception;

import tech.intellispaces.general.exception.UnexpectedException;

public class IrregularActionTypeException extends UnexpectedException {

  public IrregularActionTypeException(String message) {
    super(message);
  }
}
