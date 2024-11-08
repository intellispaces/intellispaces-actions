package intellispaces.common.action.runner;

import intellispaces.common.action.Action0;
import intellispaces.common.action.Action5;
import intellispaces.common.action.wrapper.WrapperAction0;
import intellispaces.common.action.wrapper.WrapperAction5;

import java.util.function.Function;

public interface Runner extends Action0<Void> {

  void run();

  @Override
  default Void execute() {
    run();
    return null;
  }

  @Override
  default Void execute(Void data) {
    run();
    return null;
  }

  @Override
  default Void execute(Void data1, Void data2) {
    run();
    return null;
  }

  @Override
  default Void execute(Void data1, Void data2, Void data3) {
    run();
    return null;
  }

  @Override
  default Void execute(Void data1, Void data2, Void data3, Void data4) {
    run();
    return null;
  }

  Runner then(Action0<Void> otherAction);

  Runner wrapAction0AsRunner(Function<Action0<Void>, WrapperAction0<Void>> wrapperFactory);

  Runner wrapAction5AsRunner(
      Function<Action5<Void, Void, Void, Void, Void, Void>, WrapperAction5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  );
}
