package tech.intellispaces.actions.exception;

import tech.intellispaces.commons.exception.UnexpectedException;

public class IrregularActionTypeException extends UnexpectedException {

  public IrregularActionTypeException(String message) {
    super(message);
  }
}
