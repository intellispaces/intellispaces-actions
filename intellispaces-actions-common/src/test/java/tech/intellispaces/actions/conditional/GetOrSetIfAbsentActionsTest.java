package tech.intellispaces.actions.conditional;

import org.junit.jupiter.api.Test;
import tech.intellispaces.actions.Action1;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for class {@link GetOrSetIfAbsentActions}.
 */
public class GetOrSetIfAbsentActionsTest {

  @Test
  public void testGetByDataClass() {
    assertThat(GetOrSetIfAbsentActions.get(Data.class)).isExactlyInstanceOf(GetOrSetIfAbsentAction.class);
  }

  @Test
  public void testGetByDataClassAndGetterAndSetterAndSupplier() {
    // Given
    Action1<String, Data> action = GetOrSetIfAbsentActions.get(
        Data.class,
        Data::getValue,
        Data::setValue,
        () -> "Obtained string"
    );

    var data1 = new Data();
    data1.setValue("Stored string");

    var data2 = new Data();

    // When
    String result1 = action.execute(data1);
    String result2 = action.execute(data2);

    // Then
    assertThat(result1).isEqualTo("Stored string");
    assertThat(result2).isEqualTo("Obtained string");
  }
}
