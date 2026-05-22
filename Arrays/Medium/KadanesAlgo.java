import java.util.ArrayList;
import java.util.Arrays;

public class KadanesAlgo {
  // public int maximumSubArraySum(int[] a){

    // int sum=0,maxSum=Integer.MIN_VALUE;
    // // System.out.println("MIN: "+Integer.MIN_VALUE);
    // for (int i = 0; i < a.length; i++) {
    //   if(a[i]>(a[i]+sum))
    //     sum=a[i];
    //   else
    //     sum+=a[i];
    //   if(sum>maxSum)
    //     maxSum=sum;             
    // }
    // return maxSum;


    // well we 1st saw the optimal apprach, let's see the brute force ome 
    // int maxSum=Integer.MIN_VALUE;
    // for (int i = 0; i < a.length; i++) {
    //   int  sum=0;
    //   for (int j = i; j < a.length; j++) {
    //     sum+=a[j];
    //     if(sum>maxSum)
    //       maxSum=sum;
    //   }
    // }
    // return maxSum;
  // }

  // there is 1 more folow up question now let's try to return the subarray , not it's sum 
  public ArrayList<Integer> maximumSubArraySum(int[] a){
    int sum=0, maxSum=Integer.MIN_VALUE;
    ArrayList<Integer> a1=new ArrayList<>();
    int left=0,right=0,maxLeft=0,maxRight=0;
    for (int i = 0; i < a.length; i++) {
      if(a[i]>sum+a[i]){
        // a1.removeAll(a1);
        // a1.add(a[i]);
        left=i;
        right=i;
        sum=a[i];
      }
      else{
        // a1.add(a[i]);
        right=i;
        sum+=a[i];
      }
      if(sum>maxSum){
        maxLeft=left;
        maxRight=right;
        maxSum=sum;
      }
    }
    // System.out.println("Ans: "+a1);
    // System.out.println("Max Sub Array => maxLeft: "+maxLeft+" maxRight: "+maxRight);
    for (int i = maxLeft; i <=maxRight; i++) {
      a1.add(a[i]);
    }

    // return maxSum;
    return a1;
  }
  public static void main(String[] args) {
    KadanesAlgo k=new KadanesAlgo();
    int[] a={1,2,3,4};
    // 10
    // int[] a={-1,-2,-3,-4};
    // int[] a={100,-101,200,100,400,-10};
    // int ans=k.maximumSubArraySum(a);
    // System.out.println("Ans: "+ans);

    ArrayList<Integer> a1=new ArrayList<>();
        a1=k.maximumSubArraySum(a);
    System.out.println("Ans: "+a1);
  }
}


// with the help of kadanes algo we find the max sum subarray 

