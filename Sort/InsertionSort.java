import java.util.Arrays;
public class InsertionSort{
  int[] arr;
  public InsertionSort(int[] arr)
  {
    this.arr=arr;
  }
  public int[] sort(){
    for(int i=1;i<arr.length;i++){
      int temp=arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>temp){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=temp;
    }
    return arr;
    
  }   
  public static void main(String[] ab){
    int[] arr={5,4,10,1,6,2};
    InsertionSort i=new InsertionSort(arr);
    System.out.println(Arrays.toString(i.sort()));
    
  }
}