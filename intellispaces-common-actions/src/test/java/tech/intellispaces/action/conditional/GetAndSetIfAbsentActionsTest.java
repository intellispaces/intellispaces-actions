package tech.intellispaces.action.conditional;

import org.junit.jupiter.api.Test;
import tech.intellispaces.action.Action1;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for class {@link GetAndSetIfAbsentActions}.
 */
public class GetAndSetIfAbsentActionsTest {

  @Test
  public void testGetByDataClass() {
    assertThat(GetAndSetIfAbsentActions.get(Data.class)).isExactlyInstanceOf(GetAndSetIfAbsentAction.class);
  }

  @Test
  public void testGetByDataClassAndGetterAndSetterAndSupplier() {
    // Given
    Action1<String, Data> action = GetAndSetIfAbsentActions.get(
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
