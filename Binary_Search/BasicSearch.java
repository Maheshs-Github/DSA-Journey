// package Binary_Search;

public class BasicSearch {
  // let's do with the 2 poiter first
  // public static int search(int[] a ,int key){

  // int low=0,high=a.length-1;
  // while (low<=high) {
  // if(a[low]==key) return low;
  // else if(a[high]==key) return high;
  // low++;
  // high--;
  // }
  // return -1;
  // }

  // Let's see with the recursive aproach
  // public static int search(int[] a,int low,int high, int key ){
  // if(low>high)
  // return -1;
  // int mid=Math.floorDiv(high+low, 2);
  // System.out.println("high: "+high+" low: "+low+" mid: "+mid+" a[mid]:
  // "+a[mid]);
  // if(a[mid]==key) return mid;
  // else if(key<a[mid])
  // return search(a, low, mid, key);
  // else
  // return search(a, mid+1, high, key);
  // // return -1;
  // }

  // there is a catch we do not want the method to have the low and high para
  public static int search(int[] a, int key) {
    int ans = search1(a, 0, a.length - 1, key);
    return ans;
  }

  public static int search1(int[] a, int low, int high, int key) {
        if (low > high)
      return -1;
    int mid = Math.floorDiv(high + low, 2);
    System.out.println("high: " + high + " low: " + low + " mid: " + mid + " a[mid]: " + a[mid]);
    if (a[mid] == key)
      return mid;

    else if (key < a[mid])
      return search1(a, low, mid-1, key);
    else
      return search1(a, mid + 1, high, key);

  }

  public static void main(String[] args) {
    int ans=search(new int[] {1,2,3,4,5,6,7,8},6);
    // int ans = search(new int[] { -1, 0, 3, 5, 9, 12 }, 6);
    // int ans = search(new int[] { 5}, 5);
    System.out.println("ans: " + ans);
  }
}

// htl, siteling, crax, console, console bundle, aem geeks , clous manager