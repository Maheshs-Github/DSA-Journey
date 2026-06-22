import java.util.ArrayList;
import java.util.Arrays;

public class ArraySorted {
  // public boolean isSorted(ArrayList<Integer> a)
  // {
  //   for(int i=1;i<a.size();i++){
  //   // for(int i=1;i<a.lenght;i++){
  //     // if(a[i-1] > a[i]){
  //     if(a.get(i-1) > a.get(i)){
  //       return false;
  //     }
  //   }
  //   return true;
  // }

// 
  // REVISION
  public boolean isSorted(int[] a){
    for (int i = 0; i < a.length-1; i++) {
    if(a[i]>a[i+1])   
      return false;
    }
    return true;
  }
  public static void main(String[] args) {
    ArraySorted s=new ArraySorted();
    int[] a={1,2,7,4,5};
    // ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1, 2, 3, 1, 5));
    // al.add(a);
    // boolean ans=s.isSorted(a);
    boolean ans=s.isSorted(a);
    System.out.println("ans: "+ans);
  }
}

