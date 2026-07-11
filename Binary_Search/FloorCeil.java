public class FloorCeil {
  public static void floCel(int[] a,int key){
       search(a,0,a.length-1,key);
  }
  public static void search(int[] a,int low,int high,int key){
    if(low>high)
    {
      System.out.println("[ "+high +low+" ]");
      return;
    }
    int mid=Math.floorDiv(low+high, 2);
    if(a[mid]==key){
      System.out.println("[ "+mid +mid+" ]");
      return;
    }
     if(a[mid]>=key)
      search(a, mid+1, high, key);
    else
      search(a, low, mid-1, key);
  }
  public static void main(String[] args) {
    floCel(new int[] {3,5,8,9,15,19}, 9);
  }
  
}
