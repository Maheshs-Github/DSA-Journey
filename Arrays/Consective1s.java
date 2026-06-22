public class Consective1s {
  // public void consective(int[] a){
  //   int max1sCount=0,count=0;
  //   for (int i = 0; i < a.length; i++) {
  //     if(a[i]==1){
  //       count++;
  //       if(max1sCount<count){
  //         max1sCount=count;
  //       }
  //     }
  //     if(a[i]==0)
  //       count=0;
  //   }
  //   System.out.println(max1sCount);
  // }

  // 
  // REVISION
  // so problem is to get the consective max no of 1's of array
  // doimg REVISON here 
  public void consective(int [] a){
    int count=0, maxCount=0;
    for (int i = 0; i < a.length; i++) {
      if(a[i]==1){
        count+=1;
        if(maxCount<count)
        maxCount=count;
      }
      else if(a[i]==0)
        count=0;
      
    }
    System.out.println("Max Consective 1's are: "+maxCount);
  }
  public static void main(String[] args) {
    Consective1s c=new Consective1s();
    int[] a={1,1,1,0,0,0,1,1,0,1,1,1,1,0,1,0,1};
    c.consective(a);
  }
}
