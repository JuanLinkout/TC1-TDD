package usecase;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

public class ArrayInterpolatorTest {

    private ArrayInterpolator arrayInterpolator;

   @Before
    public void setUp() {
        arrayInterpolator = new ArrayInterpolator();
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when arrays with different sizes are provided")
    public void testInterpolateArrayWithDifferentLengthArrays() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        assertThatIllegalArgumentException().isThrownBy(() -> arrayInterpolator.interpolateArray(array1, array2));
    }

    @Test
    @DisplayName("Should interpolate arrays correctly if zeros are provided")
    public void testArraysWithZeros() {
        int[] array = {0, 0, 0};
        int[] array2 = {7, 8, 9};
        int[] expected = {0, 7, 0, 8, 0, 9};
        int[] result = arrayInterpolator.interpolateArray(array, array2);
        assertThat(expected).isEqualTo(result);
    }

    @Test
    @DisplayName("Should interpolate arrays correctly if empty arrays are provided")
    public void testEmptyArrays() {
        int[] array = {};
        int[] array2 = {};
        int[] expected = {};
        int[] result = arrayInterpolator.interpolateArray(array, array2);
        assertThat(expected).isEqualTo(result);
    }

    @Test
    @DisplayName("Should interpolate arrays correctly")
    public void testInterpolateArray() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expected = {1, 4, 2, 5, 3, 6};
        int[] result = arrayInterpolator.interpolateArray(array1, array2);
        assertThat(expected).isEqualTo(result);
    }
}
