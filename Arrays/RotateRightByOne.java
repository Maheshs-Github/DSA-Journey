// import java.util.Arrays;

// public class RotateLeftByOne {
//   public void rotateLeft(int[] a) {
//     // for(int i=0;i<a.length-1;i++){
//     // int temp=a[i];
//     // a[i]=a[i+1];
//     // a[i+1]=temp;
//     // }

//     int temp = a[0];
//     for (int i = 1; i < a.length; i++) {
//       a[i-1]=a[i];
//     }
//     a[a.length-1]=temp;

//   }

//   public static void main(String[] args) {
//     RotateLeftByOne r = new RotateLeftByOne();
//     int[] a = { 1, 2, 3, 4, 5 };
//     r.rotateLeft(a);
//     System.out.print("ans: " + Arrays.toString(a));
// ans: [2, 3, 4, 5, 1]
//   }
// }

// let's see how we rotate by 2 positions , 1st how we can rotate right 

import java.util.Arrays;

public class RotateRightByOne {
  public void rotateByK(int[] a,int k){
    for (int j = 0; j < k % a.length; j++) {
      System.out.println("k");

    int temp=a[a.length-1];
    // for (int i = 1; i < a.length-1; i++) {
    for (int i = a.length-1; i >0 ; i--) {
      // int temp2=a[i];
      a[i]=a[i-1];
      // a[]
    }
    a[0]=temp;
    }
  }
  public static void main(String[] args) {
    RotateRightByOne r = new RotateRightByOne();
    int[] a = { 1, 2, 3, 4, 5 };
    r.rotateByK(a,12);
    System.out.print("ans: " + Arrays.toString(a));
    // ans: [5, 1, 2, 3, 4]
  }
}

// Now let's see with reverse approch 

// import java.util.Arrays;

// public class RotateRightByOne {
//   public void rotateByK(int[] a, int l) {
//     int k=l%a.length;

//     // System.out.println("Ans: " + Arrays.toString(a));
//     // String n1 = "Mahesh";
//     // name(n1);

//     reverse(0,a.length-1,a);
//     reverse(0,k-1,a);
//     reverse(k,a.length-1,a);
//   }

//   // rotate function/method
//   public void reverse(int p1,int p2,int[] a) {
//     // int p1 = 0, p2 = a.length - 1;
//     while (p1 < p2) {
//       System.out.println("p1: "+p1+" p2: "+p2);
//       int temp = a[p1];
//       a[p1] = a[p2];
//       a[p2] = temp;
//       p1++;
//       p2--;
//     }
//   }

//   // public void name(String n1) {
//   //   System.out.println("Hello There " + n1);
//   // }

//   public static void main(String[] args) {
//     RotateRightByOne r = new RotateRightByOne();
//     int[] a = { 1, 2, 3, 4 ,5};
//     r.rotateByK(a, 12);
//     System.out.print("ans: " + Arrays.toString(a));
//     // ans: [5, 1, 2, 3, 4]
//   }
// }
