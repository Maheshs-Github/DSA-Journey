public class SearchSortedRotatedDup {

  public static boolean search(int[] a,int key){
    return searchAns(a,0,a.length-1,key);
  }
    
    public static boolean searchAns(int[] a,int lb, int ub,int key){
        if(lb>ub){
            return false;
        }
        int mid=Math.floorDiv(lb+ub,2);
        if(a[mid]==key) return true;
        if(a[lb]==a[mid] && a[mid]==a[ub])
         return searchAns(a, lb + 1, ub - 1, key);
        if(a[lb]<=a[mid]){

            if(key>=a[lb] && key<a[mid])
            return searchAns(a,lb,mid-1,key);
            else
            return searchAns(a,mid+1,ub,key);
        }
        else{
            if(key>a[mid] && key<=a[ub])
            return searchAns(a,mid+1,ub,key);
            else
            return searchAns(a,lb,mid-1,key);
        
        }
    }

  public static void main(String[] args) {
    // boolean ans=search(new int[] {1,0,1,1,1},0); //true
    boolean ans=search(new int[] {1,1,1,1,1},0); //false
    System.out.println("Ans: "+ans);
  }
}
