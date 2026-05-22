import java.util.Arrays;
public class SelectionSort{
  int[] a;
  public SelectionSort(int[] a){
    this.a=a;
  }
  public int[] sort(){
    for(int i=0;i<a.length-1;i++){
      System.out.println("For i: "+i);
      int smallest=a[i];
      System.out.println("at 1st a[i] i.e smallest: "+smallest);

      int pos=i;
      for(int j=i+1;j<a.length;j++){
        System.out.println("For j: "+j);
        // if(a[j]<smallest){
        if(a[j]<a[pos]){
          smallest=a[j];
          System.out.println("Smallest: "+smallest);
          pos=j;
        }
      }
      int temp=a[i];
      a[i]=a[pos];
      a[pos]=temp;
      // a[i]=smallest;
      // smallest=temp;
      System.out.println("smallest: "+smallest+" a[i]: "+a[i]);
    }
    return a;
  }

  public static void main(String[] ab){
    int[] a={23,78,45,8,32,56};
    SelectionSort s=new SelectionSort(a);
    System.out.println("Ans: "+Arrays.toString(s.sort()));
  }
}