import java.util.Arrays;

public class MoveZerosAtEnd {
  public void moveZeros(int[] a) {
    // By creating new Array

    // int[] na=new int[a.length];
    // int cnt=0;
    // for (int i = 0; i < a.length; i++) {
    // if (a[i]>0)
    // {
    // na[cnt]=a[i];
    // cnt++;
    // }
    // }
    // System.out.println(Arrays.toString(na));

    // By in place
    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 0) {
        if(index!=i) 
        swap(index, i, a);
        index++;
      }
    }
  }

  void swap(int p1, int p2, int[] a) {
    System.out.println("Called for i: "+p2);
    int temp = a[p1];
    a[p1] = a[p2];
    a[p2] = temp;
  }

  public static void main(String[] args) {
    MoveZerosAtEnd m = new MoveZerosAtEnd();
    int[] a = { 1,2, 4, 3, 0, 5, 0, 0, 0, 7 };
    m.moveZeros(a);
    System.out.println(Arrays.toString(a));
  }

}
