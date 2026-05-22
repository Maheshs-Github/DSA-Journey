import java.util.HashSet;

public class FindMissingNumber {
  public void missingNo(int [] a){
    // for (int i = 1; i <= a.length; i++) {
    //   System.out.println("i: "+i);
    //   boolean found=false;
    //   for (int j = 0; j < a.length; j++) {
    //     System.out.println("j: "+j);
    //     if(a[j]==i){
    //       found=true;
    //       break;
    //     }
    //   }
    //   if(!found){
    //     return i;
    //   }
    // }
    //  return -1;


    // let's see how we can do it with the HashSet
    // HashSet<Integer> h=new HashSet<>();
    // for (int i = 0; i < a.length; i++) {
    //   h.add(a[i]);
    // }
    // int index=1;
    // for (Integer integer : h) {
    //   // System.out.println(integer);
    //   if(integer!=index){
    //     // return index;
    //     System.out.println(index);
    //     break;
    //   }
    //   index++;
    // }


    // Let's see with the Sum approch (optimized )
    // System.out.println("Sum: "+(a.length*(a.length+1))/2);
    int Sum=0;
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      Sum+=a[i];
      if(max<a[i])
        max=a[i];
    }
    // System.out.println((max*(max+1))/2-Sum);
    int ans=((max*(max+1))/2)-Sum;
    if(ans>0)
      System.out.println(ans);
    else
      System.out.println(-1);
  }
  public static void main(String[] args) {
    FindMissingNumber f=new FindMissingNumber();
    int[] a={2,1,4};
    // int ans=f.missingNo(a);
    // System.out.println("Ans: "+ans);
    f.missingNo(a);
  }
}
