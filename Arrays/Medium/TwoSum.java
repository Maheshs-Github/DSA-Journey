import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
  // public boolean Sum(int[] a,int k){
  //   for (int i = 0; i < a.length; i++) {
  //     for (int j = i+1; j < a.length; j++) {
  //       if(a[i]+a[j]==k)
  //         return true;
  //     }
  //   }
  //   return false;
  // }

  //   public String Sum(int[] a,int k){
  //   for (int i = 0; i < a.length; i++) {
  //     for (int j = i+1; j < a.length; j++) {
  //       if(a[i]+a[j]==k)
  //         return "Yes";
  //     }
  //   }
  //   return "No";
  // }

  //   public int[] Sum(int[] a,int k){
  //     int[] arr=new int[2];
  //   for (int i = 0; i < a.length; i++) {
  //     for (int j = i+1; j < a.length; j++) {
  //       if(a[i]+a[j]==k)
  //       {
  //         arr[0]=i;
  //         arr[1]=j;
  //         return arr;
  //       }
  //     }
  //   }
  //   return arr;
  // }


  // let's how we can get the optimizd solution with the sliding and two pointer approach 

  // with this approach if the array is even unsorted we can get the two sum elemensts 
  public int[] Sum(int a[],int k){
    int[] ans=new int[2];
    // HashSet<Integer> h=new HashSet<>();
    // for (int i = 0; i < a.length; i++) {  
    //   int val=k-a[i];
    //   if(h.contains(val)){
    //     ans[0]= a[i];
    //     ans[1]=val;
    //     return ans;
    //   }
    //   h.add(a[i]);
    // }
    // return new int[]{-1,-1};

    // this is sliding window and two pointer approch to get two sum, but for that we need the sorted array why is that , we are taking the lefmost and rightmost value of the sorted array , u can see the approch 
    //   int left=0,right=a.length-1;
    //   while(left!=right){
    //     int sum=a[left]+a[right];
    //   if(sum==k){
    //     ans[0]=left;
    //     ans[1]=right;
    //     return ans;
    //   }
    //   if(sum>k)
    //     right--;
    //   if(sum<k)
    //     left++;
    // }
    // return ans;


    // Let's see how we can get the index of specific sum, let's see for sorted is out of option 
    HashMap<Integer,Integer> h=new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      int val=k-a[i];
      if(h.containsKey(val)){
        ans[0]=h.get(val);
        ans[1]=i;
        return ans;
      }
      h.put(a[i], i);
    }
    System.out.println("Ans: "+h);
    return new int[]{-1,-1};

  }

  public static void main(String[] args) {
    TwoSum t=new TwoSum();
    int[] a={2,6,5,8,11};
    // boolean ans=t.Sum(a,14);
    // System.out.println("Ans: "+ans);
    //     String ans=t.Sum(a,14);
    // System.out.println("Ans: "+ans);
      int[] ans=t.Sum(a,14);
    System.out.println("Ans: "+Arrays.toString(ans));
  }
}

