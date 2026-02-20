package sorting;

public class InsertionSort implements ISort {

    @Override
    public void sort(int[] ary) {
        for (int i=1; i < ary.length; i++) {
            int k = i-1;
            for (k=i-1; k >= 0 && ary[k] > ary[k+1]; k--) {
                int temp = ary[k];
                ary[k] = ary[k+1];
                ary[k+1] = temp;
            }
        }
    }
    
}
