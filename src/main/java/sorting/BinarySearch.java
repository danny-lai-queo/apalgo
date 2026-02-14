package sorting;

import java.security.InvalidParameterException;

public class BinarySearch {
    public static int[] find(int[] ary, int target) {
        if (ary.length == 0) throw new InvalidParameterException();

        int left = 0;
        int right = ary.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = ary[mid];
            if (value == target) {
                return new int[] {mid, left, right};
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[] { -1, left, right};
    }
}
