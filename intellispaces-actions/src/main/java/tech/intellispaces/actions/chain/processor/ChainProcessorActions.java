package tech.intellispaces.actions.chain.processor;

import tech.intellispaces.actions.Action;
import tech.intellispaces.actions.Action1;
import tech.intellispaces.actions.Action2;
import tech.intellispaces.actions.Action3;
import tech.intellispaces.actions.Action4;
import tech.intellispaces.actions.Action5;
import tech.intellispaces.actions.Action6;
import tech.intellispaces.actions.processor.ProcessorAction;
import tech.intellispaces.actions.processor.ProcessorAction1;
import tech.intellispaces.actions.processor.ProcessorAction2;
import tech.intellispaces.actions.processor.ProcessorAction3;
import tech.intellispaces.actions.processor.ProcessorAction4;
import tech.intellispaces.actions.processor.ProcessorAction5;
import tech.intellispaces.actions.processor.ProcessorAction6;

/**
 * The provider of chain processor actions.
 */
public interface ChainProcessorActions {

  static ProcessorAction get(Action action1, Action action2) {
    return new ChainProcessorAction(action1, action2);
  }

  static <D> ProcessorAction1<D> get(Action1<Void, D> action1, Action1<Void, D> action2) {
    return new ChainProcessorAction1<>(action1, action2);
  }

  static <D1, D2> ProcessorAction2<D1, D2> get(Action2<Void, D1, D2> action1, Action2<Void, D1, D2> action2) {
    return new ChainProcessorAction2<>(action1, action2);
  }

  static <D1, D2, D3> ProcessorAction3<D1, D2, D3> get(
      Action3<Void, D1, D2, D3> action1,
      Action3<Void, D1, D2, D3> action2
  ) {
    return new ChainProcessorAction3<>(action1, action2);
  }

  static <D1, D2, D3, D4> ProcessorAction4<D1, D2, D3, D4> get(
      Action4<Void, D1, D2, D3, D4> action1,
      Action4<Void, D1, D2, D3, D4> action2
  ) {
    return new ChainProcessorAction4<>(action1, action2);
  }

  static <D1, D2, D3, D4, D5> ProcessorAction5<D1, D2, D3, D4, D5> get(
      Action5<Void, D1, D2, D3, D4, D5> action1,
      Action5<Void, D1, D2, D3, D4, D5> action2
  ) {
    return new ChainProcessorAction5<>(action1, action2);
  }

  static <D1, D2, D3, D4, D5, D6> ProcessorAction6<D1, D2, D3, D4, D5, D6> get(
      Action6<Void, D1, D2, D3, D4, D5, D6> action1,
      Action6<Void, D1, D2, D3, D4, D5, D6> action2
  ) {
    return new ChainProcessorAction6<>(action1, action2);
  }
}
