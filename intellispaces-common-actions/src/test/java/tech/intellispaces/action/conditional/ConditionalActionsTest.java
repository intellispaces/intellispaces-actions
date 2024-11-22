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
  public void testGetOrSetIfAbsentAction_byDataClass() {
    try (MockedStatic<GetOrSetIfAbsentActions> getAndSetIfAbsentActions = mockStatic(GetOrSetIfAbsentActions.class)) {
      // Given
      Class<Data> dataClass = Data.class;
      GetOrSetIfAbsentAction<?, Data> action = mock(GetOrSetIfAbsentAction.class);
      getAndSetIfAbsentActions.when(() -> GetOrSetIfAbsentActions.get(dataClass)).thenReturn(action);

      // When
      GetOrSetIfAbsentAction<?, Data> result = ConditionalActions.getOrSetIfAbsentAction(dataClass);

      // Then
      assertThat(result).isSameAs(action);
    }
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testGetOrSetIfAbsentAction_byDataClassAndResultClass() {
    try (MockedStatic<GetOrSetIfAbsentActions> getAndSetIfAbsentActions = mockStatic(GetOrSetIfAbsentActions.class)) {
      // Given
      Class<Data> dataClass = Data.class;
      Class<String> resultClass = String.class;
      GetOrSetIfAbsentAction<?, Data> action = mock(GetOrSetIfAbsentAction.class);
      getAndSetIfAbsentActions.when(() -> GetOrSetIfAbsentActions.get(dataClass)).thenReturn(action);

      // When
      GetOrSetIfAbsentAction<?, Data> result = ConditionalActions.getOrSetIfAbsentAction(dataClass, resultClass);

      // Then
      assertThat(result).isSameAs(action);
    }
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testGetAndSetIfAbsentAction_byDataClassAndGetterAndSetterOrConsumer() {
    try (MockedStatic<GetOrSetIfAbsentActions> getAndSetIfAbsentActions = mockStatic(GetOrSetIfAbsentActions.class)) {
      // Given
      Class<Data> dataClass = Data.class;
      Function<Data, String> getter = Data::getValue;
      BiConsumer<Data, String > setter = Data::setValue;
      Supplier<String> supplier = () -> "The string";

      Action1<String, Data> action = mock(Action1.class);
      getAndSetIfAbsentActions.when(() -> GetOrSetIfAbsentActions.get(
          dataClass, getter, setter, supplier
      )).thenReturn(action);

      // When
      Action1<String, Data> result = ConditionalActions.getOrSetIfAbsentAction(
          dataClass, getter, setter, supplier
      );

      // Then
      assertThat(result).isSameAs(action);
    }
  }
}
