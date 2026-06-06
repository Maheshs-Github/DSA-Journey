import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {
  public static void  findGreaterNextPermutation(int[] a) {

    // let's first find all the permutaion, for 3 digits only
    // System.out.println("2%4: " + (3 % 4));
    // System.out.println("len +1: " + (a.length + 1));
    // List<List<Integer>> permutations = new ArrayList<>();
    // for (int i = 1; i <= a.length; i++) {
    // ArrayList<Integer> cmutation = new ArrayList<>();
    // ArrayList<Integer> cmutation2 = new ArrayList<>();
    // int sec, third;
    // cmutation.add(i);
    // sec = ((i + 1) % (a.length)) == 0 ? 3 : ((i + 1) % (a.length));
    // cmutation.add(sec);
    // third = ((i + 2) % (a.length)) == 0 ? 3 : ((i + 2) % (a.length));
    // cmutation.add(third);
    // permutations.add(cmutation);
    // cmutation2.addAll(Arrays.asList(i, third, sec));
    // permutations.add(cmutation2);
    // System.out.println("cmutation: " + cmutation);
    // }
    // List<Integer> arrList = Arrays.stream(a).boxed().toList();
    // // if (permutations.contains(arrList))
    // // System.out.println("Hello" + arrList);
    // for (List<Integer> l : permutations) {
    // if(l.equals(arrList)){
    // System.out.println("Hello" + permutations.get(permutations.indexOf(l)+1));
    // }

    // }
    // // return permutations;
    // System.out.println("perr: " + permutations);

    // well leave that let's see the optimal apprch then
    // int leftSmallest ;
    // int left = a.length - 1;
    // while (left>0 && a[left] <= a[left - 1] ) {
    // // System.out.println("leftSmallest: " + a[leftSmallest]+ "a[left]:
    // "+a[left]);
    // left--;
    // }
    // leftSmallest=left;
    // for (int i = a.length-1; i <left ; i--) {
    // if(a[i]>a[left-1])
    // leftSmallest=i;
    // }
    // System.out.println("a[Left-1]: " + a[left - 1]);
    // System.out.println("leftSmallest: " + a[leftSmallest]);
    // System.out.println("a: "+Arrays.toString(a));
    // if((left-1)!=0){
    // int temp=a[left-1];
    // a[left-1]=a[leftSmallest];
    // a[leftSmallest]=temp;
    // }

    // System.out.println("a: "+Arrays.toString(a));
    // int lb=left,ub=a.length-1;
    // while(lb<ub){
    // int temp1=a[lb];
    // a[lb]=a[ub];
    // a[ub]=temp1;
    // lb++; ub--;
    // }
    // System.out.println("a: "+Arrays.toString(a));

    //
    // Let's see with teh simple code by chatGpt idea
    int pivot = -1;
    for (int i = a.length - 2; i >= 0; i--) {
      System.out.println("i: "+i);
      if (a[i] < a[i + 1]) {
        System.out.println("Imf for i: "+i);
        pivot = i;
        break;
      }
    }
    System.out.println("pivot: " + a[pivot]);
    if (pivot == -1) {
      reverseA(a, 0, a.length - 1);
    System.out.println("Ans: "+Arrays.toString(a));
      return ;
    }
    System.out.println("before  swap: " + Arrays.toString(a));

    for (int i = a.length - 1; i > pivot; i--) {
      System.out.println("a[i]: "+a[i]+" a[pivot]: "+a[pivot]);
      if (a[i] > a[pivot]) {
        swap(a, i, pivot);
        break;
      }

    }
    System.out.println("a after swap: " + Arrays.toString(a));
    reverseA(a, pivot + 1, a.length - 1);
    // return a;
    System.out.println("Ans: "+Arrays.toString(a));

  }

  public static void reverseA(int[] a, int lb, int ub) {
    while (lb < ub) {
      int temp = a[lb];
      a[lb] = a[ub];
      a[ub] = temp;
      lb++;
      ub--;
    }
  }

  public static void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    NextPermutation n = new NextPermutation();
    // int[] ans = findGreaterNextPermutation(new int[] { 1, 2, 5, 4, 3 });
     findGreaterNextPermutation(new int[] { 1, 2, 5, 4, 3 });
    // int[] ans=findGreaterNextPermutation(new int[] { 3,2,1});
    // System.out.println("ans: " + Arrays.toString(ans));
  }
}
