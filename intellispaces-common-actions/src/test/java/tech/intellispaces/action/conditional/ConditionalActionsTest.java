package tech.intellispaces.action.conditional;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import tech.intellispaces.action.Action1;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

/**
 * Test for class {@link ConditionalActions}.
 */
public class ConditionalActionsTest {

  @Test
  @SuppressWarnings("unchecked")
  public void testGetAndSetIfAbsentActionByDataClass() {
    try (MockedStatic<GetAndSetIfAbsentActions> getAndSetIfAbsentActions = mockStatic(GetAndSetIfAbsentActions.class)) {
      // Given
      Class<Data> dataClass = Data.class;
      GetAndSetIfAbsentAction<?, Data> action = mock(GetAndSetIfAbsentAction.class);
      getAndSetIfAbsentActions.when(() -> GetAndSetIfAbsentActions.get(dataClass)).thenReturn(action);

      // When
      GetAndSetIfAbsentAction<?, Data> result = ConditionalActions.getAndSetIfAbsentAction(dataClass);

      // Then
      assertThat(result).isSameAs(action);
    }
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testGetAndSetIfAbsentActionByDataClassAndGetterAndSetterAndConsumer() {
    try (MockedStatic<GetAndSetIfAbsentActions> getAndSetIfAbsentActions = mockStatic(GetAndSetIfAbsentActions.class)) {
      // Given
      Class<Data> dataClass = Data.class;
      Function<Data, String> getter = Data::getValue;
      BiConsumer<Data, String > setter = Data::setValue;
      Supplier<String> supplier = () -> "The string";

      Action1<String, Data> action = mock(Action1.class);
      getAndSetIfAbsentActions.when(() -> GetAndSetIfAbsentActions.get(
          dataClass, getter, setter, supplier
      )).thenReturn(action);

      // When
      Action1<String, Data> result = ConditionalActions.getAndSetIfAbsentAction(
          dataClass, getter, setter, supplier
      );

      // Then
      assertThat(result).isSameAs(action);
    }
  }
}
