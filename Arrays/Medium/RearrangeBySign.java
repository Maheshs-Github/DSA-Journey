package Medium;

import java.util.ArrayList;

public class RearrangeBySign {

  public static int[] arrange(int[] a){
    int lastNegative=1,lastPositive=0;
    // ArrayList<Integer> a1=new ArrayList<>();
    int[] a2=new int[a.length];
    for (int i = 0; i < a.length; i++) {
      if(a[i]<0){
        a2[lastNegative]=a[i];
        lastNegative+=2;
      }
      else{
        a2[lastPositive]=a[i];
      lastPositive+=2;
      }

      // for (int j : a2) {
      //   System.out.println("In a: "+j);
      // }

    }
          for (int j : a2) {
        System.out.println("a: "+j);
      }
      return a2;
  }
  public static void main(String[] args) {
    int a[] = {1,2,-3,-1,-2,3};

    arrange(a);
  }
  
}


// India Offer Meeting with UI Team - 10:30 -12:52