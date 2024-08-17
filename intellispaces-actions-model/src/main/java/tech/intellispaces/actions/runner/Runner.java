package tech.intellispaces.actions.runner;

import tech.intellispaces.actions.Action0;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.wrapper.Wrapper0;
import tech.intellispaces.actions.wrapper.Wrapper5;

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

  Runner wrapAction0AsRunner(Function<Action0<Void>, Wrapper0<Void>> wrapperFactory);

  Runner wrapAction5AsRunner(
      Function<Action5<Void, Void, Void, Void, Void, Void>, Wrapper5<Void, Void, Void, Void, Void, Void>> wrapperFactory
  );
}
