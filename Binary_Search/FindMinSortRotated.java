public class FindMinSortRotated {

    public static int sortedRotated(int[] a){
    return rotatedAns(a,0,a.length-1);
  }

    public static int rotatedAns(int[] a,int lb,int ub){
    if(lb>=ub)
      return a[lb];
    int mid=Math.floorDiv(lb+ub,2);
    System.out.println("a[lb]: "+a[lb]+" a[ub]: "+a[ub]+" a[mid]: "+a[mid]);
    if(a[mid]>a[ub]){
       return rotatedAns(a, mid+1, ub);
    }
    else{
       return rotatedAns(a, lb, mid);
    }
  }

  public static void main(String[] args) {
    int ans=sortedRotated(new int[] {4 ,5 ,6 ,7 ,0 ,1 ,2}); //0
    // int ans=sortedRotated(new int[] {3,4,5,1,2}); //1
    System.out.println("ans: "+ans);
    
  }
}
