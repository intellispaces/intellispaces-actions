package tech.intellispaces.actions;

/**
 * General action.<p/>
 *
 * Action is any activity that can be executed.<p/>
 *
 * The action is an object. Each action object has method named 'execute' to perform activity.<p/>
 */
public interface Action {

  Object execute(Object... data);

  <$R> Action0<$R> asAction0();

  <$R, $D> Action1<$R, $D> asAction1();

  <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2();

  <$R, $D1, $D2, $D3> Action3<$R, $D1, $D2, $D3> asAction3();

  <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4();

  <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5();
}
