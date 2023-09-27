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
}
