import java.util.Arrays;

public class FirstAndLastOccurance {

  // let's see brute force 
  // public static int[] fLOccurance(int[] a, int key) {
  //   int left = 0, right = a.length - 1, leftVal = -1, rightVal = -1;
  //   while (left <= right) {
  //     if (a[left] == key && leftVal == -1)
  //       leftVal = left;
  //     if (a[right] == key && rightVal == -1)
  //       rightVal = right;
  //     left++;
  //     right--;
  //   }
  //   if (leftVal != -1 && rightVal != -1)
  //     return new int[] { leftVal, rightVal };
  //   if (leftVal != -1 && rightVal == -1)
  //     return new int[] { leftVal, leftVal };
  
  //   if (leftVal == -1 && rightVal != -1)
  //     return new int[] { rightVal, rightVal };
  //   else
  //     return new int[] { -1,-1 };

  // }

  // now let's see how we can do with the BS 

  // public static int[] fLOccurance(int[] a, int key) {
//   public static int[] fLOccurance(int[] a, int key) {
//     return search(a,0,a.length-1,key);
// }
// public static int[] search(int[] a,int lb,int ub,int key){
//   int[] ans=new int[2];
//   int i=0;
//   if(lb>ub){
//     ans[i]=lb;
//     return ans;
//   }
//     int mid=Math.floorDiv(lb+ub, 2);
//     System.out.println("mid: "+mid);
//     if(a[mid]==key){
//       ans[i]=mid;
//       i++;
//     }
//       // System.out.println("ans: "+mid);
//     if (a[mid]<=key)
//       return search(a, mid+1, ub, key);
//     else if(a[mid]>=key)
//       return search(a, lb, mid-1, key);

//     return new int[] {-1,-1};
//   }

//   // let's see how we can get the first occurance then 
//     public static int fLOccurance(int[] a, int key) {
//     return search(a,0,a.length-1,key);
// }
// public static int search(int[] a,int lb,int ub,int key){
//   if(lb>ub){
//     return lb;
//   }
//     int mid=Math.floorDiv(lb+ub, 2);
//     // if (a[mid]>=key)
//     //   return search(a, lb, mid-1, key);
//     // else 
//     //   return search(a, mid+1, ub, key);
//     // i will assign the same fun for bot if else but order should be revsree
//         if (a[mid]<=key)
//           return search(a, mid+1, ub, key);
//         else 
//           return search(a, lb, mid-1, key);

//     // return -1;
//   }

// }

// 
// let's freshly start then 
  // let's see how we can get the first occurance then 
    public static int[] fLOccurance(int[] a, int key) {
    // return search(a,0,a.length-1,key);
    int lb=lSearch(a,0,a.length-1,key);
            // Key doesn't exist
        if (lb == a.length || a[lb] != key) {
            return new int[] { -1, -1 };
        }
        int ub=uSearch(a, 0, a.length-1, key);
        return new int[] {lb,ub};
}
public static int lSearch(int[] a,int lb,int ub,int key){
  if(ub<lb){
    // System.out.println("ub: "+ub);
    return lb;
  }
int mid=Math.floorDiv(lb+ub, 2);
if(a[mid]>=key)
  return lSearch(a,lb,mid-1,key);
else
  return lSearch(a,mid+1,ub,key);

  }

  public static int uSearch(int[] a,int lb,int ub,int key){
  if(lb>ub){
    // System.out.println("ub: "+ub);
    return ub;
  }
int mid=Math.floorDiv(lb+ub, 2);
if(a[mid]<=key)
  return uSearch(a,mid+1,ub,key);
else
  return uSearch(a,lb,mid-1,key);

  }


  public static void main(String[] args) {
    // int[] ans= fLOccurance(new int[] {1,2,2,2,3},2); //1,3
    // int[] ans= fLOccurance(new int[] {5,7,7,8,8,10},6); //-1,-1
    // int[] ans= fLOccurance(new int[] {4,4,4,4,4},4); //0,4


    // int[] ans=fLOccurance(new int[] {4,4,4,4,4},4); //0,4

    // for low bound
    // int ans=fLOccurance(new int[] {4,4,4,4,4},4); //0
    // int ans=fLOccurance(new int[] {5,7,7,8,8,10},8); //3
    // int ans= fLOccurance(new int[] {1,2,2,2,3},2); //1

    // System.out.println("ans: "+ans);
    // // System.out.println("ans: "+Arrays.toString(ans));

    // 
    // Let's get to the actual ans 
        // int[] ans= fLOccurance(new int[] {1,2,2,2,3},2); //1,3
        int[] ans= fLOccurance(new int[] {1,2,2,2,3},3); //1,3

    System.out.println("ans: "+Arrays.toString(ans));
    // System.out.println("ans: "+Arrays.toString(ans));
  }

}


// how chnaging the a[mid]<=key  condition gives the lower bound and upper bound 