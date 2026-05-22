import java.util.HashMap;

public class NoAppearOnce {
  public int apperOnce(int[] a){
    // HashMap<Integer,Integer> h=new HashMap<>();
    // for (int i = 0; i < a.length; i++) {
    //   if(!h.containsKey(a[i])){
    //     h.put(a[i], 1);
    //   }
    //   else{
    //     h.put(a[i], h.get(a[i])+1);
    //   }
    // }
    // System.out.println(h);
    // for (int i : h.keySet()) {
    //   if(h.get(i)==1){
    //     System.out.println("Ans: "+i);
    //     return i;
    //   }
    // }
    // return -1;


    // most optimal approch 
    int xor=0;
    for (int i : a) {
      xor^=i;
    }
    return xor;
  }
  public static void main(String[] args) {
    NoAppearOnce n=new NoAppearOnce();
    int [] a={1,2,3,2,1};
    int ans=n.apperOnce(a);
    System.out.println("Ans: "+ans);
  }
  
}
