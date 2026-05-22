import java.util.Arrays;

public class QuickSortClass {
    int[] a;

    public QuickSortClass(int[] a){
        this.a = a;
    }

    public void quickSort(int low, int high, int[] a){
        if (low < high) {
            int pivotIndex = partition(a, low, high);

            quickSort(low, pivotIndex - 1, a);
            quickSort(pivotIndex + 1, high, a);
        }
    }

    public int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        while(i <= j){
            while(i <= high && a[i] <= pivot){
                i++;
            }

            while(a[j] > pivot){
                j--;
            }

            if(i < j){
                swap(a, i, j);
            }
        }

        // place pivot correctly                                                          
        swap(a, low, j);

        return j;
    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] ab){
        int[] a = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        QuickSortClass q = new QuickSortClass(a);
        q.quickSort(0, a.length - 1, a);
        System.out.println(Arrays.toString(a));
    }
}