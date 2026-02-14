package sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void case00() {
        int[] ary = { 1, 2, 3, 4, 5, 6};

        for (int k=0; k < ary.length; k++) {
            int target = ary[k];
            int[] result = BinarySearch.find(ary, target);
            int foundIndex = result[0];
            assertEquals(k, foundIndex);
        }
    }

    @Test
    public void case01() {
        int[] ary = { 2, 4, 6, 8, 10, 12};
        
        for (int target=1; target < 14; target += 2) {
            int[] result = BinarySearch.find(ary, target);
            int left = result[1];
            int right = result[2];
            assertEquals(-1, result[0]);
            assertTrue(left == right + 1);
            assertEquals((target-1)/2-1, right);
            assertEquals((target-1)/2, left);
        }
    }

    @Test
    public void case02() {
        int[] ary = {};
        assertThrows(InvalidParameterException.class, 
            () -> {
                BinarySearch.find(ary, 1);
            }
        );
    }


}
