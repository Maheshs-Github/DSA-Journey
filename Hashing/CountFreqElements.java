// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;

// public class CountFreqElements {
//   public ArrayList<int[]> countFreq(int[] a) {
//     ArrayList<int[]> a1 = new ArrayList<>();
//     for (int i = 0; i < a.length; i++) {
//       boolean found = false;
//       // if (a1.contains(a1.get(i)[0]))
//       for (int[] pair : a1) {
//         if (pair[0] == a[i]) {
//           // System.out.println(pair[1]);
//           found = true;
//           break;
//         }
//       }
//       if (found)
//         continue;
//       int cnt = 0;
//       for (int j = 0; j < a.length; j++) {
//         // System.out.println(a[i]);

//         if (a[i] == a[j])
//           cnt++;
//         // a1.add([a[i],i]);
//       }
//       a1.add(new int[] { a[i], cnt });
//     }
//     System.out.println("a1: " + a1);

//     return a1;
//   }

//   // with the Hashmap
//   // public HashMap<Integer,Integer> countFreq(int[] a){
//   // HashMap<Integer,Integer> h=new HashMap<>();
//   // for(int no:a){
//   // h.put(no, h.getOrDefault(h, 0)+1);
//   // }
//   // return h;
//   // }
//   public static void main(String[] args) {
//     CountFreqElements c = new CountFreqElements();
//     int[] a = { 1, 5, 2, 1, 7, 5, 9 };
//     ArrayList<int[]> a1 = new ArrayList<>();
//     a1 = c.countFreq(a);
//     // System.out.println(Arrays.toString(a1));
//     for(int[] pair:a1){
//       System.out.println("0: "+pair[0]+" 1: "+pair[1]);
//     }

//     // HashMap<Integer,Integer> h=new HashMap<>();

//     // h= c.countFreq(a);
//     // System.out.println("h: "+h);
//   }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountFreqElements {
  public List<List<Integer>> countFreq(int[] a){
  List<List<Integer>> l=new ArrayList<>() {
    
  };

    boolean[] visited =new boolean[a.length];
    for(int i=0;i<a.length;i++){
      // System.out.println("visted: "+Arrays.toString(visited));
      if(visited[i])
        continue;
      // System.out.println(a[i]);
      int cnt=0;
      for(int j=0;j<a.length;j++){
        if(a[i]==a[j])
        {
          cnt++;
          visited[j]=true;
        }
      }
      // System.out.println(a[i]+" "+cnt);
      List<Integer> l1=new ArrayList<>();
      l1.add(a[i]);
      l1.add(cnt);
      l.add(l1);
        
    }
    return l;
  }

  public static void main(String[] args) {
    CountFreqElements c=new CountFreqElements();
    int[] a={ 1, 2, 2, 1, 3};

    List<List<Integer>> l=new ArrayList<>();
    l=c.countFreq(a);
    System.out.println("Ans: "+(l));
  }
}