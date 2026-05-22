import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UnionOfSortedArray {
  // public HashSet<Integer> unionArr(int[] a, int[] b) {
  // public void unionArr(int[] a, int[] b) {
  public int[] unionArr(int[] a, int[] b) {

    // With HashMap
    // HashMap<Integer, Integer> h = new HashMap<>();
    // for (int i = 0; i < a.length; i++) {
    // if (!h.containsKey(a[i]))
    // h.put(a[i], null);
    // }
    // for (int i = 0; i < b.length; i++) {
    // if (!h.containsKey(b[i]))
    // h.put(b[i], null);
    // }
    // System.out.print("{");
    // boolean first = true;
    // for (Integer val : h.keySet()) {
    // if (!first)
    // System.out.print(",");
    // System.out.print(val);
    // first = false;
    // }
    // System.out.print("}");
    // // System.out.println("Ans: "+h);



    // With HashSet
    // HashSet<Integer> h=new HashSet<>();
    // for (int i = 0; i < a.length; i++) {
    // h.add(a[i]);
    // }
    // for (int i = 0; i < b.length; i++) {
    // h.add(b[i]);
    // }
    // // System.out.println("Ans: "+h);
    // return h;




    // with 2 pointer approch
    ArrayList<Integer> al = new ArrayList<>();

    int i = 0, j = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        if(al.isEmpty() || al.get(al.size()-1)!=a[i]){
          al.add(a[i]);
        }
        System.out.println("A[i}: "+a[i]+" al: "+al);
        i++;
      }

      else if (a[i] == b[j]) {
        if(al.isEmpty() || al.get(al.size()-1)!=a[i]){
          al.add(a[i]);
        }
        System.out.println("A[i]: "+a[i]+" al: "+al);
        i++;
        j++;
      } else {
        if(al.isEmpty() || al.get(al.size()-1)!=b[j]){
          al.add(b[j]);
        }
        System.out.println("j: "+j+" A[j]: "+a[j]+" al: "+al);
        j++;
    }
    }
    while (i < a.length) {
      if(al.isEmpty() || al.get(al.size()-1)!=a[i]){
              al.add(a[i]);
            }
            i++;

    }
    while (j < b.length) {
      if(al.isEmpty() || al.get(al.size()-1)!=b[j]){
      al.add(b[j]);
    }
    j++;
    }
    // System.out.println(al);
     int[] ab=new int[al.size()];
    for(int m=0;m<al.size();m++){
        ab[m]=al.get(m);
    }
    return ab;

    // Here again time complexity is O(n+m+al), space complexity al


    // Let's su
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, b = { 2,2,2, 3, 4, 5, 6 };
    UnionOfSortedArray u = new UnionOfSortedArray();
    // HashSet<Integer> h=new HashSet<>();
    // h=u.unionArr(a, b);
    // System.out.println("Ans: "+h);
    int [] ans=new int[10];
    ans=u.unionArr(a, b);
    System.out.println("Ans: "+Arrays.toString(ans));
  }
}
