public class InsertAtPosition {
  public static int insert(int a[], int key) {
    return search(a, 0, a.length-1, key);
  }

  public static int search(int a[], int low, int high, int key) {
    if (low > high)
      return low;
    int mid = Math.floorDiv(low + high, 2);
    if (a[mid] >= key)
      return search(a, low, mid - 1, key);
    else
      return search(a, mid + 1, high, key);
  }

  public static void main(String[] args) {
    int ans=insert(new int[] {3,5,8,9,9,15,19}, 9); //3
    System.out.println("ans: "+ans);
  }

}

// /actually it is same as lowebound