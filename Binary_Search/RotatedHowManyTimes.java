import java.util.ArrayList;
import java.util.Arrays;

public class RotatedHowManyTimes {
      public static int sortedRotated(ArrayList<Integer> a){
    return rotatedAns(a,0,a.size()-1);
  }

    public static int rotatedAns(ArrayList<Integer> a,int lb,int ub){
    if(lb>=ub)
      return a.get(lb);
    int mid=Math.floorDiv(lb+ub,2);
    // System.out.println("a[lb]: "+a[lb]+" a[ub]: "+a[ub]+" a[mid]: "+a[mid]);
    if(a.get(mid)>a.get(ub)){
       return rotatedAns(a, mid+1, ub);
    }
    else{
       return rotatedAns(a, lb, mid);
    }
  }
  public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2));
    int ans=sortedRotated(list1); //0
    // int ans=sortedRotated(new int[] {3,4,5,1,2}); //1
    System.out.println("ans: "+ans);
  }
}
