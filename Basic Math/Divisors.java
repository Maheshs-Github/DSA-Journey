import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Divisors {

  public ArrayList<Integer> divisorsOfNo(int no){
  ArrayList<Integer> a=new ArrayList<>();
  // for(int i=1;i<=no/2;i++){
  for(int i=1;i<=(int)Math.sqrt(no);i++){
  if(no%i==0){
    a.add(i);
    if (!(no/i==i)){
      a.add(no/i);
    }
  }
  }
  Collections.sort(a);
  return a;
  }



  // with array
  // public int[] divisorsOfNo(int no) {

  //   int count = 0;
  //   for (int i = 1; i <= no; i++) {
  //     if (no % i == 0) {
  //       count++;
  //     }
  //   }

  //   int a[] = new int[count];
  //   int index = 0;
  //   for (int i = 1; i <= no; i++) {
  //     if (no % i == 0) {
  //       a[index] = i;
  //       index++;
  //     }
  //   }
  //   return a;
  // }

  public static void main(String[] args) {
    Divisors i = new Divisors();
    // int no1 = 3, no2 = 9;
    // int no = 153;
    // int no=371;
    ArrayList<Integer> ans=new ArrayList<>();

    // int no=12;
    int no = 36;
    // int[] ans = new int[no];
    ans = i.divisorsOfNo(no);
    System.out.println("Ans: " + ans);
    // System.out.println("Ans: " + Arrays.toString(ans));
  }
}

// Approch 1: we created the ArrayList and returned the values , got the values
// and store the values as a ArrayList
// Approch 2: let's see we are storing int the array