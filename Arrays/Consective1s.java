public class Consective1s {
  public void consective(int[] a){
    int max1sCount=0,count=0;
    for (int i = 0; i < a.length; i++) {
      if(a[i]==1){
        count++;
        if(max1sCount<count){
          max1sCount=count;
        }
      }
      if(a[i]==0)
        count=0;
    }
    System.out.println(max1sCount);
  }
  public static void main(String[] args) {
    Consective1s c=new Consective1s();
    int[] a={1,0,0,0,1,1,0,1,1,1,0,1};
    c.consective(a);
  }
}
