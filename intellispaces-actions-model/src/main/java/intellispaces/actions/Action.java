package intellispaces.actions;

import intellispaces.actions.wrapper.Wrapper;

import java.util.function.Function;

/**
 * Action.<p/>
 *
 * Action is a lightweight object that implements repeatedly repeating the same manipulation performed on different data<p/>
 */
public interface Action {

  int actionOrder();

  Object execute();

  Object execute(Object[] data);

  <R> Action0<R> asAction0();

  <R, D> Action1<R, D> asAction1();

  <R, D1, D2> Action2<R, D1, D2> asAction2();

  <R, D1, D2, D3> Action3<R, D1, D2, D3> asAction3();

  <R, D1, D2, D3, D4> Action4<R, D1, D2, D3, D4> asAction4();

  <R, D1, D2, D3, D4, D5> Action5<R, D1, D2, D3, D4, D5> asAction5();

  <W extends Wrapper> W wrapAction(Function<Action, W> wrapperFactory);
}
