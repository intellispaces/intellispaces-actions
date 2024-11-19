package tech.intellispaces.action.conditional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link GetAndSetIfAbsentAction} class;
 */
public class GetAndSetIfAbsentActionTest {

  @Test
  public void testExecute_whenEmptyData() {
    // Given
    var action = new GetAndSetIfAbsentAction<String, Data>();
    var data = new Data();

    // When
    String result = action.execute(
        data,
        Data::getValue,
        Data::setValue,
        () -> "Obtained string"
    );

    // Then
    assertThat(result).isEqualTo("Obtained string");
    assertThat(data.getValue()).isEqualTo("Obtained string");
  }

  @Test
  public void testExecute_whenNotEmptyData() {
    // Given
    var action = new GetAndSetIfAbsentAction<String, Data>();
    var data = new Data();
    data.setValue("Stored string");

    // When
    String result = action.execute(
        data,
        Data::getValue,
        Data::setValue,
        () -> "Obtained string"
    );

    // Then
    assertThat(result).isEqualTo("Stored string");
    assertThat(data.getValue()).isEqualTo("Stored string");
  }

}
