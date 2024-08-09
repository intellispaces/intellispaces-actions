package tech.intellispaces.actions;

import java.util.function.Function;

public interface Action5<R, D1, D2, D3, D4, D5> extends Action {

  R execute(D1 data1, D2 data2, D3 data3, D4 data4, D5 data5);

  @Override
  R execute(Object... data);

  <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction5(
      Function<Action5<R, D1, D2, D3, D4, D5>, A> wrapperFactory
  );
}
