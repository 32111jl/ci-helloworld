import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }

    @Test
    public void testFindLastEmpty() {
        // For any input where y appears in the second or later position, there is no error. Also,
        // if x is empty, there is no error.
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }


    @Test
    public void testOddOrPosAllPositives() {
        // Any nonempty x with only non-negative elements works, because the first part of the
        // compound if-test is not necessary unless the value is negative.
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testCountOfTargetEmptyArr() {
        int[] arr = {};
        assertEquals(0, ArrayUtils.countOf(arr, 1));
    }

    @Test
    public void testCountofNoTargets() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(0, ArrayUtils.countOf(arr, 0));
    }

    @Test
    public void testCountofAllTargets() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(4, ArrayUtils.countOf(arr, 1));
    }

    @Test
    public void testCountofOneTarget() {
        int[] arr = {1, 2, 2, 2};
        assertEquals(1, ArrayUtils.countOf(arr, 1));
    }

    @Test
    public void testCountofMultipleTargets() {
        int[] arr = {1, 2, 2, 2};
        assertEquals(3, ArrayUtils.countOf(arr, 2));
    }
}