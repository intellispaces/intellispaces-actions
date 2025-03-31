package tech.intellispaces.commons.action;

import tech.intellispaces.commons.action.wrapper.WrapperAction;

import java.util.function.Function;

/**
 * Abstract general action.
 */
public abstract class AbstractAction implements Action {

  @Override
  public <W extends WrapperAction> Action wrapAction(Function<Action, W> wrapperFactory) {
    return wrapperFactory.apply(this);
  }

  @Override
  public int executeReturnInt(Object[] inputs) {
    return (Integer) execute(inputs);
  }

  @Override
  public double executeReturnDouble(Object[] inputs) {
    return (Double) execute(inputs);
  }

  @Override
  public <R> Action0<R> castToAction0() {
    return new Action0BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D> Action1<R, D> castToAction1() {
    return new Action1BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2> Action2<R, D1, D2> castToAction2() {
    return new Action2BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3> Action3<R, D1, D2, D3> castToAction3() {
    return new Action3BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> castToAction4() {
    return new Action4BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> castToAction5() {
    return new Action5BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4, D5, D6> Action6<R, D1, D2, D3, D4, D5, D6> castToAction6() {
    return new Action6BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4, D5, D6, D7> Action7<R, D1, D2, D3, D4, D5, D6, D7> castToAction7() {
    return new Action7BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4, D5, D6, D7, D8> Action8<R, D1, D2, D3, D4, D5, D6, D7, D8> castToAction8() {
    return new Action8BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4, D5, D6, D7, D8, D9> Action9<R, D1, D2, D3, D4, D5, D6, D7, D8, D9> castToAction9() {
    return new Action9BasedOnGeneralAction<>(this);
  }

  @Override
  public <R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> Action10<R, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10> castToAction10() {
    return new Action10BasedOnGeneralAction<>(this);
  }
}
