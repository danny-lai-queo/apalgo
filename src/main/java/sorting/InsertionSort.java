package sorting;

public class InsertionSort implements ISort {

    @Override
    public void sort(int[] ary) {
        for (int i=1; i < ary.length; i++) {
            int k = i-1;
            int insertVal = ary[i];
            while (k >= 0 && ary[k] >= insertVal) {
                k--;
            }

            // shift ary[k+1]...ary[i-1] to ary[k+2]...ary[i]
            int stop = k+1;
            for (int m=i; m > stop; m--) {
                ary[m] = ary[m-1];
            }

            ary[k+1] = insertVal;
        }
    }
    
}
