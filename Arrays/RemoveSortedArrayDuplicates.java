// import java.util.Arrays;

// public class RemoveSortedArrayDuplicates {
//   // public int[] removeDup(int[] a) {
//   public int removeDup(int[] a) {
//     int[] newA = new int[a.length];
//     int cnt = 0;
//     for (int i = 0; i < a.length; i++) {
//       // System.out.println("a[i]: " + a[i]);
//       boolean isUnique = true;
//       for (int j = 0; j < cnt; j++) {
//         if (a[i] == newA[j]) {
//           isUnique = false;
//           break;
//         }
//         // System.out.println("newA[j]: " + newA[j]);
//       }
//       if (isUnique) {
//         newA[cnt] = a[i];
//         cnt++;
//       }
//     }
//     // return newA;
//     return cnt;
//   }

//   public static void main(String[] args) {
//     RemoveSortedArrayDuplicates r = new RemoveSortedArrayDuplicates();
//     // int[] a = { 1, 2, 3, 1, 2, 4, 5 };
//     int[] a = { 0, 0, 3, 3, 5, 6 };
    
//     // int[] ans = r.removeDup(a);
//     // System.out.println("Ans: " + Arrays.toString(ans));
//         int ans = r.removeDup(a);
//     System.out.println("Ans: " + ans);
//   }
// }




// Let's see with the HashSet

// import java.util.Arrays;
// import java.util.HashSet;

// public class RemoveSortedArrayDuplicates {
//   public int removeDup(int[] a){
//     HashSet<Integer> h=new HashSet<>();
//     int index=0;
//     for (int i = 0; i < a.length; i++) {
//       if(!h.contains(a[i])){
//         h.add(a[i]);
//         a[index]=a[i];
//         index++;
//       }
//     }
//     return index;
//   }

//   public static void main(String[] args) {
//     RemoveSortedArrayDuplicates r=new RemoveSortedArrayDuplicates();
//     int[] a={0,0,1,1,1,2,2,3,3,4};
//     int ans=r.removeDup(a);
//     System.out.println("Ans: "+Arrays.toString(a));
//     for (int i = 0; i < ans; i++) {
//      System.out.print(a[i]+" "); 
//     }
//   }
// }







// /Let's see more optimized way, using 2 pointer approch 
public class RemoveSortedArrayDuplicates {
  public int removeDup(int[] a){
    int index=0;
    for (int i = 1; i < a.length; i++) {
      if(a[i]==a[index])
        continue;
      index++;
      a[index]=a[i];
    }
    return index;
  }

  public static void main(String[] args) {
    RemoveSortedArrayDuplicates r=new RemoveSortedArrayDuplicates();
    int[] a={1,1,2,2,2,3,4,4,5};
   int ans= r.removeDup(a);
   System.out.println("Ans: "+ans);
   for(int i=0;i<=ans;i++){
    System.out.print(a[i]+" ");
   }
  }
}