package tech.intellispaces.actions.executor;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;

import java.util.function.Function;

public interface Executor extends Action0<Void> {

  @Override
  default Void execute(Void data) {
    return execute();
  }

  @Override
  default Void execute(Void data1, Void data2) {
    return execute();
  }

  @Override
  default Void execute(Void data1, Void data2, Void data3) {
    return execute();
  }

  @Override
  default Void execute(Void data1, Void data2, Void data3, Void data4) {
    return execute();
  }

  Executor then(Action0<Void> otherAction);

  Executor wrap(
      Function<Action5<Void, Void, Void, Void, Void, Void>, Action5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  );
}
