public class FindMinInSortedRotated {

  public static int search(int[] a){
    return rotatedAns(a,0,a.length-1);
  }
  public static int rotatedAns(int[] a,int lb,int ub){
    if(lb==ub)
      return lb;
    int mid=Math.floorDiv(lb+ub, 2);
    // if(a[mid]==key) return mid;
    if(!(a[lb]<=a[mid]))
      return rotatedAns(a, lb, mid-1);
    else 
      return rotatedAns(a,mid+1,ub);
  }
  public static void main(String[] args) {
    // int ans=search(new int[]{4,5,1,2,3}); //1
    int ans=search(new int[]{0,1,2,3,4,5,6}); 
    System.out.println("Ans: "+ans);
  }
  
}
