

public class LowerBound {
  // let's see with the iteration 
  //   public static int lBound(int a[], int key){
    // for (int i = 0; i < a.length-1; i++) {
    //   if(a[i]<key && a[i+1]>=key)
    //     return i+1;
    // }
    // return -1;
  // }

  // 
  // let's see how we can find the lower bound with BS 
    public static int lBound(int a[], int key){
      return search(a,0,a.length-1,key);
    }


  // 
  // let's see the Upper Bound too 
    //   public static int UBound(int a[], int key){
    // for (int i = a.length-1; i >0 ; i--) {
    //   if(a[i]>key && a[i-1]<=key)
    //     return i;
    // }
    // return -1;
  // }
  public static int search(int a[], int low,int high, int key){
    if(low>high)
      return low;
    int mid=Math.floorDiv(low+high, 2);
    // to gt lowebound using mid-1
    // if(a[mid]==key) return mid;
    if(a[mid]>=key)
      return search(a, low, mid-1, key);
    else
      return search(a, mid+1, high, key);
  }

  // 
  // okay Upper Bound with BS
  //     public static int uBound(int a[], int key){
  //     return search(a,0,a.length-1,key);
  //   }
  //     public static int search(int a[], int low,int high, int key){
  //       int mid=Math.floorDiv(low+high, 2);
  // System.out.println("high: "+high+" low: "+low+" mid: "+mid+" a[mid]"+a[mid]);
  //   if(low>high)
  //     return low;
  //   // to gt ubound using mid+1
  //   // if(a[mid]==key) return mid+1;
  //   if(a[mid]<=key)
  //    return search(a, mid+1, high, key);
  //   else
  //     return search(a, low, mid-1, key);
  // }
  public static void main(String[] args) {
    // int ans=lBound(new int[] {1,2,2,3,4}, 2);
    // int ans=UBound(new int[] {3,5,8,15,19}, 9);

    // int ans=lBound(new int[] {1,2,3,4}, 2); //1
    // int ans=lBound(new int[] {1,2,3,4}, 1); //0
    // int ans=lBound(new int[] {1,2,4}, 3); //2
    // int ans=lBound(new int[] {3,5,8,15,19}, 9); //3
    int ans=lBound(new int[] {3,5,8,9,9,15,19}, 9); //3

        // int ans=uBound(new int[] {1,2,3,4}, 3); //3
    // int ans=uBound(new int[] {3,5,8,15,19}, 9); //3
    // int ans=uBound(new int[] {3,5,8,9,9,9,9,9,15,19}, 9); //5 //8
    System.out.println("ans: "+ans);
  }  
}
