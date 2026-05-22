import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
  public int[] reverse(int a[]){

    // Approch 1: just simply store the first as last in t o new array
    // int no=a.length;
    // int b[]=new int[no];
    // for (int i=0;i<no;i++){
    //   b[i]=a[no-(i+1)];
    // }
    // return b;

    // Approch 2: let's do in place with the help of 2 pointers
    int no=a.length;
    int p1=0,p2=no-1;
    while (p1!=p2) {
      int temp=a[p1];
      a[p1]=a[p2];
      a[p2]=temp;
      p1++;
      p2--;
    }
    return a;
  }
  public static void main(String[] args) {
    ReverseArray r=new ReverseArray();
    ArrayList<Integer> a=new ArrayList<>();
    int[] originalArray={1,2,3,4,5};
    System.out.println(Arrays.toString(r.reverse(originalArray)));
  }
  
}
