import java.util.HashMap;

public class HighestLowest {
  // void highLowElement (int[] a){
    // HashMap<Integer,Integer> h=new HashMap<>();
    // for (int i : a) {
    //   h.put(i, h.getOrDefault(i, 0)+1);
    // }
    // System.out.println(h);
    // int minE=0,minV=Integer.MAX_VALUE;
    // int maxE=0,maxV=Integer.MIN_VALUE;
    // for (int i : h.keySet()) {
    //   System.out.println(i+" "+h.get(i));
    //   if(h.get(i)>maxV)
    //   {
    //     maxV=h.get(i);
    //     maxE=i;
    //   }
    //   if(h.get(i)<minV){
    //     minV=h.get(i);
    //     minE=i;
    //   }
      
    // }
    // System.out.println("Max key: "+maxE+" Max Value: "+maxV);
    // System.out.println("Min key: "+minE+" Min Value: "+minV);

    // }


    // Let's get the smallest most frequesnt element 

    public int highLowElement(int[] a){
      HashMap<Integer,Integer> h=new HashMap<>();

      for (int i : a) {
        h.put(i, h.getOrDefault(i,0 )+1);
      }
      System.out.println(h);
      int maxE=0, maxV=Integer.MIN_VALUE;
      for (int i : h.keySet()) {
        if(maxV<h.get(i)){
          maxE=i;
          // maxV=h.get(i);
        }
      }
      return maxE;
    }
    public static void main(String[] args) {
    HighestLowest h=new HighestLowest();
    int[] a={10,5,10,15,5,10,5};
    int ans=h.highLowElement(a);
    System.out.println("Ans: "+ans);
  }
  
}


// 