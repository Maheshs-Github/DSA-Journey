public class NonDupElement {
    public static int nonDup(int[] a){
    return nonDupAns(a,0,a.length-1);
  }

  
    public static int nonDupAns(int[] a,int lb,int ub){
    if(lb>=ub)
      return a[lb];
    int mid=Math.floorDiv(lb+ub,2);
    System.out.println("a[lb]: "+a[lb]+" a[ub]: "+a[ub]+" a[mid]: "+a[mid]);
    if(a[mid]==a[mid^1]){
       return nonDupAns(a, mid+1, ub);
    }
    else{
       return nonDupAns(a, lb, mid);
    }
  }

  public static void main(String[] args) {
     int ans=nonDup(new int[] {1,1,2,2,3,3,4,5,5,6,6}); //0
    System.out.println("ans: "+ans);
  }
  
}
