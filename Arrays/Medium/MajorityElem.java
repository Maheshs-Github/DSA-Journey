import java.util.HashMap;

// 
public class MajorityElem {
  public int majorityElem(int[] a){

    // well we had to find the majority elment , so basically if we have the array of the n , the element that occuer the n/2 times will be in majority 
    // well in this approach we just calculated the frequencie and checked the final max frequency 
    // HashMap<Integer,Integer> h=new HashMap<>();
    // for (int i = 0; i < a.length; i++) {
    //   h.put(a[i], h.getOrDefault(a[i], 0)+1);
    // }
    // System.out.println("H: "+h);
    // int MAX=Integer.MIN_VALUE;
    // int ans=0;
    // for (Integer i : h.keySet()) {
    //   // System.out.println("i: "+i);
    //   if(h.get(i)>MAX){
    //     MAX=h.get(i);
    //     ans=i;
    //   }
    // }
    // return ans;

    // 
    // okay now let's see with the Moore’s Voting Algorithm
    int count=0,candidate=a[0];
    for (int i = 0; i < a.length; i++) {
      if(count==0)
        candidate=a[i];
      if(a[i]==candidate)
        count++;
      else
        count--;
    }

    int freq=0;
    for (int i = 0; i < a.length; i++) {
      if(a[i]==candidate)
        freq++;
    }
    if(freq>a.length/2)
    return candidate;
  return -1;
  }
  public static void main(String[] args) {
    MajorityElem f=new MajorityElem();
    int a[]={1,2,3,1,2,1,1,3};
    int ans=f.majorityElem(a);
    System.out.println("Ans: "+ans);
  }
  
}
