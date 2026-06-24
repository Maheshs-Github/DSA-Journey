import java.util.HashMap;

public class LongestSubArrayOfSum {
  public int longSub(int[] a,int k){


    // brute force approach with the nested loop , 1 marks the 1st elmenst , othere creates the subarray from that elment , 3rd do the sum for each subaaray and chekes the maxLen 

    // int maxLen=0;
    // for (int i = 0; i < a.length; i++) {
    //   // System.out.println("i: "+i);
    //   for (int j = i; j < a.length; j++) {
    //   // System.out.println("j: "+j);
    //     int sum=0;           
    //     for (int l = i; l <= j; l++) {
    //       sum+=a[l];
    //   // System.out.println("i: "+i+" j: "+j+" l: "+l+" sum: "+sum);
    //     }
    //     if(sum==k && maxLen<j-i+1){
    //       // System.out.println("maxLen: "+maxLen);       
    //       // System.out.println("j-i+1: "+(j-i+1));              
    //       maxLen=j-i+1;                                             
    //     }
    //   }
    //   // System.out.println("i: "+i);
    //   // if(i==1)
    //   //   break;

    // }
    // return maxLen;


    // 
    // better approch ,last one give sthe TC(O(n)^3), we can do it with n^2 as well how, saw that l loop it was just perfomening the sum from start we can reduce it like summing each time , let's see 

    //     int maxLen=0;
    // for (int i = 0; i < a.length; i++) {
    //   // System.out.println("i: "+i);
    //   int sum=0;
    //   for (int j = i; j < a.length; j++) {
    //   // System.out.println("j: "+j);
    //      sum+=a[j];           

    //     if(sum==k && maxLen<j-i+1){
    //       // System.out.println("maxLen: "+maxLen);       
    //       // System.out.println("j-i+1: "+(j-i+1));              
    //       maxLen=j-i+1;                                             
    //     }
    //   }
    //   // System.out.println("i: "+i);
    //   // if(i==1)
    //   //   break;

    // }
    // return maxLen;


    // optimal approach 
    // it is a sliding window and 2 pointer approch let's see how we cando it 
//     int left=0,right=0,maxLen=0;
//     int sum=0;
//     while(right < a.length){

//     sum += a[right];

//     while(sum > k){
//         sum -= a[left];
//         left++;
//     }

//     if(sum == k && maxLen<right-left+1){
//         // maxLen = Math.max(maxLen, right-left+1);
//         maxLen=right-left+1;
//     }

//     right++;
// }
//     return maxLen;


// 
// REVISION, this is sliding window apprch but it's onlay works for the positive ones , why sliding window is not working on -ve 
int sum=0,left=0,right=0, maxLen=0;
while(right<a.length){
  System.out.println("sum: "+sum+" a[right]: "+a[right]);
  System.out.println("maxLen: "+maxLen);
  sum+=a[right];

if(sum==k){
  if(maxLen<right-left+1)
    maxLen=right-left+1;
}
  if(sum>=k){
    sum-=a[left];
    left++;
}


    right++;
  

}
return maxLen;


// Let's see the one whioch can work for the +ve as well as -ve numbers 
// HashMap<Integer,Integer> h=new HashMap<>();
// int sum=0,maxLen=0;
// for (int i = 0; i < a.length; i++) {
//   sum+=a[i];
//   if(sum==k && maxLen<i+1){
//       maxLen=i+1;
//   }
//   System.out.println("a[i]: "+a[i]+" sum: "+sum+" sum-k: "+(sum-k)+" maxLen: "+maxLen);
//   if( h.containsKey(sum-k)){
//       if(maxLen<(i-h.get(sum-k))+1)
//       maxLen=(i-h.get(sum-k))+1;
//   }
//   h.put(sum,i);
//   for (Integer key : h.keySet()) {
//     System.out.println("key: "+key+" value: "+h.get(key));
//   }
// }
// return maxLen;

  }
  public static void main(String[] args) {
    LongestSubArrayOfSum l=new LongestSubArrayOfSum();
    // int[] a={10, 5, 2, 7, 1, 9};
    // int[] a={1, 2, -1, 1, 1};
        // int[] a={2, -1, 2, 3};
    // int ans=l.longSub(a,15);
    //         int[] a={1, -1, 5, -2, 3};
    // int ans=l.longSub(a,4);

    // ?Let's do some +ve examples 
    // int[] a = {1, 2, 1, 1, 1, 3};
    // int k = 3;
//     int[] a = {2, 1, 1, 1, 2, 1};
// int k = 4;
// int[] a = {1, 2, 3, 1, 1, 1, 1};
// int k = 6;
//     int ans=l.longSub(a,k); 

// for -ve case 
int[] a = {1, -1, 5, -2, 3};
int k = 3;
    int ans=l.longSub(a,k); 

    System.out.println("Ans: "+ans);
  }  
}

