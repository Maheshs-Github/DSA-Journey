public class PeakElement {
  public static int peak(int[] a){
    return peakAns(a,0,a.length-1);
  }

    public static int peakAns(int[] a,int lb,int ub){
    if(lb>=ub)
      return lb;
    int mid=Math.floorDiv(lb+ub,2);
    System.out.println("a[lb]: "+a[lb]+" a[ub]: "+a[ub]+" a[mid]: "+a[mid]);
    if(a[lb]==a[ub])
      return peakAns(a, lb+1, ub-1);
    if(a[mid]>a[ub]){
      return peakAns(a, lb, mid);
    }
    else{
      return peakAns(a, mid+1, ub);
    }
  }
  public static void main(String[] args) {
        // int ans=peak(new int[] {1,2,1,3,5,6,4}); //5
        int ans=peak(new int[] {1,2,3,1}); //5
    // int ans=sortedRotated(new int[] {3,4,5,1,2}); //1
    System.out.println("ans: "+ans);
  }
  
}
