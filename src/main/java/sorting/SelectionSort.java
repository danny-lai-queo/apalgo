package sorting;

public class SelectionSort implements ISort {

    public void sort(int[] ary) {
        for (int i=0; i < ary.length-1; i++) {
            int minIdx = i;
            int min = ary[i];
            for (int k=i+1; k < ary.length; k++) {
                if (min > ary[k]) {
                    minIdx = k;
                    min = ary[k];
                }
            }
            int temp = ary[minIdx];
            ary[minIdx] = ary[i];
            ary[i] = temp;
        }
    }

}
