public class LinearSearch {
  public int lSearch(int[] a,int key){
    for (int i = 0; i < a.length; i++) {
      if(a[i]==key)
        return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    LinearSearch l=new LinearSearch();
    int[] a={1,2,3,4,55,6,7};
    int ans=l.lSearch(a,5);
    System.out.println("Ans: "+ans);

  }
  
}
