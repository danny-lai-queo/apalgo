package sorting;

public class QuickSort implements ISort {

    @Override
    public void sort(int[] ary) {
        qsort(ary, 0, ary.length-1);
    }

    public void qsort(int[] ary, int left , int right) {
        if (left >= right) {
            return;
        }
        int p = partition(ary, left, right);
        qsort(ary, left, p-1);
        qsort(ary, p+1, right);
    }

    public int partition(int[] ary, int left, int right) {
        int pivotVal = ary[left];
        int inc = left;
        int dec = right+1;
        while (true) {
            while (ary[++inc] < pivotVal && inc != right) {
            }
            while (ary[--dec] > pivotVal && dec != left) {
            }
            if (inc >= dec) break;

            int temp = ary[inc];
            ary[inc] = ary[dec];
            ary[dec] = temp;
        }

        int temp = ary[left];
        ary[left] = ary[dec];
        ary[dec] = temp;

        return dec;
    }

}
