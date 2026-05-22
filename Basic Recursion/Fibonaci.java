// import java.util.Arrays;

import java.util.Arrays;

public class Fibonaci {

  // Let's see with Array
  public int[] fibSeries(int n){
    int[] a=new int[n+1];
    a[0]=0;
    a[1]=1;
    for(int i=2;i<=n;i++){
      a[i]=a[i-2]+a[i-1];
    }
    return a;
  }

  // Let's see without using Array 
  // public void fibSeries(int n){
  //   int no1=0;
  //   int no2=1;
  //   for(int i=2;i<=n+1;i++){
  //     System.out.println("no1: "+no1+" no2: "+no2);
  //     int temp=no2;
  //     no2=no1+no2;
  //     no1=temp;
  //   }
  // }
  public static void main(String[] args) {
    Fibonaci f=new Fibonaci();
    int n=7;
    int ans[]=new int[n+1];
    ans=f.fibSeries(n);
    System.out.println("Ans: "+ Arrays.toString(ans));

    // f.fibSeries(n);
  }
}
