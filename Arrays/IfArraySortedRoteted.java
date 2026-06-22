// import java.util.Arrays;

// public class IfArraySortedRoteted{
//   int[] arr;
//   public int[] sort(int[] arr){
//     this.arr=arr;
//         for (int i=0;i<arr.length;i++){
//       boolean isSorted=false;
      
//       for(int j=1;j<arr.length-i;j++){
//         // isSorted=false;
//         if(arr[j-1]>arr[j]){
//           int temp=arr[j];
//           arr[j]=arr[j-1];
//           arr[j-1]=temp;
//           isSorted=true;
//         }
//     // System.out.println("for i: "+i+" j: "+j+" Arr is: "+Arrays.toString(arr));
//       }
//       if(!isSorted)
//       break;
//     }
//     return arr;
//   }
//   // public int rotatedByNumber(int[] input){
//   // // public void rotatedByNumber(){
//   // int ans=-1;
//   //   for (int i=0;i<arr.length;i++){
//   //     int[] roatatedArrayByX=rotateByX(i);
//   //     // System.out.println("Roatted for X: "+i+" is a: "+Arrays.toString(roatatedArrayByX));
//   //     if(Arrays.equals(input,roatatedArrayByX)){
//   //       ans=i;
//   //       break;
//   //     }
//   //   }
//   //   return ans;
//   // }

//     public boolean isSortedAndRotated(int[] input){
//     for (int i=0;i<arr.length;i++){
//       int[] roatatedArrayByX=rotateByX(i);
//       System.out.println("input: "+Arrays.toString(input));
//       System.out.println("Roatted for X: "+i+" is a: "+Arrays.toString(roatatedArrayByX));
//       if(Arrays.equals(input,roatatedArrayByX)){
//         return true;
//       }
//     }
//     return false;
//   }

//   public int[] rotateByX(int x){
//     int[] b= new int[arr.length];
//     for(int i=0;i<arr.length;i++){
//       b[i]=arr[(i+x)%arr.length];
//     }
//     return b;
//   }
  

//   public static void main(String[] ab){
//     // System.out.println("hello There");
//     IfArraySortedRoteted i=new IfArraySortedRoteted();
//     int[] arr={2, 3, 4, 1};
//     int[] input=arr.clone();
//     // int[] ans=i.sort(arr);
//     System.out.println(Arrays.toString(i.sort(arr)));
//     // System.out.println("Ans: "+Arrays.toString(ans));
//     // System.out.println(Arrays.toString(i.rotateByX(2)));
//     // System.out.println(i.rotatedByNumber(input));
//     System.out.println(i.isSortedAndRotated(input));

//     // Check by which number it was rotated 
    
//   }
// }




// // // on Leetcode we only have the single method to write the code in it , Let's do by that apprch for debugging 

// // import java.util.Arrays;

// // public class IfArraySortedRoteted{

// //   public boolean check(int[] nums) {
// //     int[] nums2=nums.clone();
// //     System.out.println("nums2(at 1st): "+Arrays.toString(nums2)+" num: "+Arrays.toString(nums));
// //     // nums2(at 1st): [2, 1, 3, 4] num: [2, 1, 3, 4]
// //     // int[] sortedNum=sort(nums);
// //     sort(nums);

// //     System.out.println("input(after sort): "+Arrays.toString(nums2)+" nums: "+Arrays.toString(nums));
// //     // input(after sort): [2, 1, 3, 4] nums: [1, 2, 3, 4]
// //     // Actually sort is updating the actual nums array so i do not think we need to store value u in any other variable , there is no need to returna s well , but rotateByX needs to be return bcoz itit returning thr differnt value and is not even affecting the nums , as we are just atking the values from it 

// //         for (int i=0;i<nums.length;i++){
// //       int[] roatatedArrayByX=rotateByX(i,nums);
// //       System.out.println("input: "+Arrays.toString(nums2));
// //       System.out.println("Roatted for X: "+i+" is a: "+Arrays.toString(roatatedArrayByX)+" And nums: "+Arrays.toString(nums));
// //       // Roatted for X: 2 is a: [3, 4, 1, 2] And nums: [1, 2, 3, 4]
// //       if(Arrays.equals(nums2,roatatedArrayByX)){
// //         return true;
// //       }
// //     }
// //     return false;
// //   }




// //   // public int[] sort(int[] arr){
// //   public void sort(int[] arr){
// //     // this.arr=arr;
// //         for (int i=0;i<arr.length;i++){
// //       boolean isSorted=false;
      
// //       for(int j=1;j<arr.length-i;j++){
// //         // isSorted=false;
// //         if(arr[j-1]>arr[j]){
// //           int temp=arr[j];
// //           arr[j]=arr[j-1];
// //           arr[j-1]=temp;
// //           isSorted=true;
// //         }
// //     // System.out.println("for i: "+i+" j: "+j+" Arr is: "+Arrays.toString(arr));
// //       }
// //       if(!isSorted)
// //       break;
// //     }
// //     // return arr;
// //   }


// //   public int[] rotateByX(int x,int[] arr){
// //     int[] b= new int[arr.length];
// //     for(int i=0;i<arr.length;i++){
// //       b[i]=arr[(i+x)%arr.length];
// //     }
// //     return b;
// //   }
  

// //   public static void main(String[] ab){
// //     // System.out.println("hello There");
// //     IfArraySortedRoteted i=new IfArraySortedRoteted();
// //     int[] nums={2,1,3,4};
// //     System.out.println(Arrays.toString(nums));
// //     System.out.println("Ans: "+i.check(nums));

    
// //   }
// // }


















// with optimized approch
import java.util.ArrayList;
import java.util.Arrays;

public class IfArraySortedRoteted {
  // public boolean isSorted(ArrayList<Integer> a)
  // {
  //   int count=0;
  //   for(int i=1;i<a.size();i++){
  //   // for(int i=1;i<a.lenght;i++){
  //     // if(a[i-1] > a[i]){
  //     if(a.get(i-1) > a.get(i)){
  //       count++;
  //     }
  //   }
  //   if(a.get(a.size()-1)>a.get(0)){
  //     count++;
  //   }
  //   return count<=1;
  // }

  // 
  // REVISION , Simply if the next elemnst is greatere  than the previous then it is SORTED
  // also if Roatated if the a[n] is less than the  a[0], bcoz u know it is rotated ,
  //  but there is 1 consition too i thought count will be always 0, u know sorted should be like a[i]<a[i+1]
  // but for example [4,5,1,2,3], 5>1 then taht is why we have the return with count<=1, damnn 
  public static boolean isSortedRotated(int [] a){
    int count=0;
    for (int i = 0; i < a.length-1; i++) {
      if(a[i+1]<a[i])
        count+=1;
    }
    if(a[a.length-1]>a[0])
      count+=1;

    System.out.println("count: "+count);
    return count <=1;
  }

  public static void main(String[] args) {
    IfArraySortedRoteted s=new IfArraySortedRoteted();
    int[] a={4,5,1, 2, 3};
    // ArrayList<Integer> al=new ArrayList<>(Arrays.asList(4,5,1, 2, 3));
    // al.add(a);
    // boolean ans=s.isSorted(a);
    // boolean ans=s.isSorted(al);
    boolean ans=isSortedRotated(a);
    System.out.println("ans: "+ans);
  }
}

