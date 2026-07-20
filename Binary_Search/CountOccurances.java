import java.util.Arrays;

public class CountOccurances {
  // first i want to get with finding first amd last occurance 
  public static int FirstAndLastOccurance(int[] a,int key){
    int lb=lBound(a, 0, a.length-1, key);
    if (lb<0 || lb==a.length) {
      return -1;
    }
    int ub=uBound(a, 0, a.length-1, key);
    return (ub-lb)+1;

  }
  public static int lBound(int[] a,int lb,int ub,int key){
    if(ub<lb)
      return lb;
    int mid=Math.floorDiv(lb+ub, 2);
    if(a[mid]>=key)
      return lBound(a, lb, mid-1, key);
    else
      return lBound(a, mid+1, ub, key);
  }
    public static int uBound(int[] a,int lb,int ub,int key){
    if(lb>ub)
      return ub;
    int mid=Math.floorDiv(lb+ub, 2);
    if(a[mid]<=key)
      return uBound(a, mid+1, ub, key);
    else
      return uBound(a, lb, mid-1, key);
  }
  public static void main(String[] args) {
    // int ans=FirstAndLastOccurance(new int[] {1,2,2,2,3}, 2); //3
    // int ans=FirstAndLastOccurance(new int[] {5,7,7,8,8,10}, 8); //2
    int ans=FirstAndLastOccurance(new int[] {5,7,7,8,8,10}, 6); //2
    System.out.println("ans: "+ans);
  }
  
}
