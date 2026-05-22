// import java.util.Arrays;

// public class Sort012 {
//   public void sort1(int[] a, int lb, int ub) {
//     if (lb < ub) {
//       int mid = (lb + ub) / 2;
//       sort1(a, lb, mid);
//       sort1(a, mid + 1, ub);
//       merge(a, lb, mid, ub);
//     }
//   }

//   public void merge(int[] a, int lb, int mid, int ub) {
//     int[] ans = new int[a.length];
//     int l = lb, h = mid + 1, k = l;
//     while (l <= mid && h <= ub) {
//       if (a[l] < a[h])
//         ans[k++] = a[l++];
//       else
//         ans[k++] = a[h++];
//     }
//     while (l <= mid) {
//       ans[k++] = a[l++];
//     }
//     while (h <= ub) {
//       ans[k++] = a[h++];
//     }
//     for (int i = lb; i <= ub; i++) {
//       a[i] = ans[i];
//     }
//   }

//   public static void main(String[] args) {
//     Sort012 s = new Sort012();
//     int[] a = { 0, 2, 1, 0, 2, 1, 0 };
//     s.sort1(a, 0, a.length - 1);
//     System.out.println("Ans: " + Arrays.toString(a));
//   }
// }

// Above one was the brute force aprach , but it was not a in place 
import java.util.Arrays;

public class Sort012 {
    public void sort1(int[] a) {
        // int zeroCnt=0,oneCnt=0,twoCnt=0;
        // for (int i = 0; i < a.length; i++) {
        // if(a[i]==0)
        // zeroCnt++;
        // if(a[i]==1)
        // oneCnt++;
        // if (a[i]==2)
        // twoCnt++;
        // }
        // int k=0;
        // while (zeroCnt>0) {
        // a[k++]=0;
        // zeroCnt--;
        // }
        // while (oneCnt>0) {
        // a[k++]=1;
        // oneCnt--;
        // }
        // while (twoCnt>0) {
        // a[k++]=2;
        // twoCnt--;
        // }

        // Let's see the Optimized Approach , Dutch national flag algorithm

        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high) {

            if (a[mid] == 0) {

                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;

                low++;
                mid++;
            }

            else if (a[mid] == 1) {

                mid++;
            }

            else {

                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;

                high--;
            }
        }

    }

    public static void main(String[] args) {
        Sort012 s = new Sort012();
        int[] a = { 0, 2, 1, 0, 2, 1, 0 };
        s.sort1(a);
        System.out.println("Ans: " + Arrays.toString(a));
    }
}
