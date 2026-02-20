package sorting;

public class InsertionSort2 implements ISort {

    @Override
    public void sort(int[] ary) {
        // put smallest to the beginning
        int numSwap = 0;
        for (int i=ary.length-1; i > 0; i--) {
            if (ary[i] < ary[i-1]) {
                int temp = ary[i-1];
                ary[i-1] = ary[i];
                ary[i] = temp;
                numSwap++;
            }
        }

        // if the array is already sorted, then exit
        if (numSwap == 0) return;

        // starting from third element (if any) to shift values without doing full swap
        for (int i=2; i < ary.length; i++) {
            int insertionValue = ary[i];
            int k = i;
            for ( ; ary[k] < ary[k-1]; k--) {  // since ary[0] is smallest no need to check for k > 0
                ary[k] = ary[k-1];
            }
            ary[k] = insertionValue;
        }
    }
    
}
