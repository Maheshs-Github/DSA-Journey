import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort{
  int[] arr;
  public BubbleSort(int[] arr){
    this.arr=arr;
    // we are taking the n=7
    // System.out.println(arr.length);

  }
  public void sort(){
        for (int i=0;i<arr.length;i++){
      boolean isSorted=false;
      
      for(int j=1;j<arr.length-i;j++){
        // isSorted=false;
        if(arr[j-1]>arr[j]){
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
          isSorted=true;
        }
    System.out.println("for i: "+i+" j: "+j+" Arr is: "+Arrays.toString(arr));
      }
      if(!isSorted)
      break;
    }
  }
  public void printArray(){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main (String[] ab){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the No of Element: ");
    int n=sc.nextInt();

    int[] arr=new int[n];
    System.out.println("Enter the Elements: ");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();

    //   System.out.println("Elmensts are :");
    // for(int i=0;i<n;i++){
    //   System.out.println(arr[i]);
    // }
    // System.out.println(arr.length);

    BubbleSort b=new BubbleSort(arr);
    b.sort();
    b.printArray();

  }
}