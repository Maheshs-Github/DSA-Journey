
// import java.util.Arrays;

// public class RotateLeftByOne {

//    public void rotateLeft(int[] a) {
//       int temp=a[0];
//       for (int i = 1; i < a.length; i++) {
//          a[i-1]=a[i];
//       }
//       a[a.length-1]=temp;
//    }

//    public static void main(String[] var0) {
//       RotateLeftByOne r = new RotateLeftByOne();
//       int[] a = new int[]{1, 2, 3, 4, 5};
//       r.rotateLeft(a);
//       System.out.print("ans: " + Arrays.toString(a));
//    }
// }

  



// Rotate Left by k

import java.util.Arrays;

public class RotateLeftByOne {

   public void rotateLeft(int[] a,int k1) {
      int k=k1%a.length;
      reverse(0,a.length-1,a);
      reverse(0, a.length-1-k, a);
      reverse(a.length-k+1, a.length-1, a);
   }
   public void reverse(int p1,int p2,int[] a){
      while (p1<p2) {
         int temp=a[p1];
         a[p1]=a[p2];
         a[p2]=temp;
         p1++;
         p2--;
      }
   }

   public static void main(String[] var0) {
      RotateLeftByOne r = new RotateLeftByOne();
      int[] a = new int[]{1, 2, 3, 4, 5};
      r.rotateLeft(a,1);
      System.out.print("ans: " + Arrays.toString(a));
      // [4,5,3,2,1]
   }
}

  
