package sorting;

public class MergeSort implements ISort {



    @Override
    public void sort(int[] ary) {
        int[] temp = new int[ary.length];
        mergeSort(ary, temp, 0, ary.length-1);
    }

    public void mergeSort(int[] ary, int[] temp, int left, int right) {
        if (left>=right) {
            return;
        }
        int mid = (left+right) / 2; 
        mergeSort(ary, temp, left, mid);
        mergeSort(ary, temp, mid+1, right);
        merge(ary, temp, left, mid, right);
    }

    public void merge(int[] ary, int[] temp, int left, int mid, int right) {
        if (ary[mid] <= ary[mid+1]) {
            return;
        }
        for (int i=left; i <= right; i++) {
            temp[i] = ary[i];
        }

        int iL = left;
        int iR = mid+1;
        for (int i=left; i <= right; i++) {
            if (iL > mid) {
                ary[i] = temp[iR++];
            }
            else if (iR > right) {
                ary[i] = temp[iL++];
            }
            else if (temp[iL] < temp[iR]) {
                ary[i] = temp[iL++];
            } else {
                ary[i] = temp[iR++];
            }
        }
    }
    
}
