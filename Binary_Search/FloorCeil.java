import java.util.Arrays;

public class FloorCeil {
  public static int[] floCel(int[] a, int key) {
    return search(a, 0, a.length - 1, key);
  }

  public static int[] search(int[] a, int low, int high, int key) {
    if (high < 0)
      return new int[] { -1,a[low] };
    System.out.println("len: " + a[a.length - 1]);
    if (low > a.length - 1)
      return new int[] { a[high], -1 };

    // System.out.println("hello");
    if (low > high) {
      // System.out.println("[ "+high +" "+ low+" ]");
      return new int[] { a[high], a[low] };
    }
    int mid = Math.floorDiv(low + high, 2);
    System.out.println("high: " + high + " low: " + low + " mid: " + mid + " a[mid]" + a[mid]);
    if (a[mid] == key) {
      // System.out.println("[ "+mid +mid+" ]");
      return new int[] { a[mid], a[mid] };
    }
    if (a[mid] >= key)
      return search(a, low, mid - 1, key);
    else
      return search(a, mid + 1, high, key);
  }

  public static void main(String[] args) {
    // int[] ans=floCel(new int[] {3,5,8,15,19}, 9); //8,15
    // int[] ans = floCel(new int[] { 3, 5, 8, 15, 19 }, 1); // -1,3
    int[] ans = floCel(new int[] { 3, 5, 8, 15, 19 }, 21); // -1,3

    System.out.println("Arrays : " + Arrays.toString(ans));
  }

}

// okay simply what we had to do here 
    // int[] ans=floCel(new int[] {3,5,8,15,19}, 9); //8,15
    // int[] ans=floCel(new int[] {3,5,8,15,19}, 8); //8,8
    // int[] ans = floCel(new int[] { 3, 5, 8, 15, 19 }, 1); // -1,3
    // int[] ans = floCel(new int[] { 3, 5, 8, 15, 19 }, 21); // -1,3

    // first 2 example are simple , if we find the elment just return it teice , if we do not get the specific elment just negibours or adjecent 9-> 8,15 
    // let's see our example {3,5,8,15,19} , key =9
    //  first call low=0 , high=4 , mid=4/2=2 a[mid]=8
    // key>mid, so low=3, high=4, mid=6/2=3 a[mid]=15
    // key<mid , so low=3, high=3 mid=3 a[mid]=15
    // key<mid , so low =3 , high=2 , so low > high RETURN a[high],a[low]


    // let's the dry run of this program on edge cases