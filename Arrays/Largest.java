import java.util.Scanner;
import java.util.Arrays;
public class Largest{
  int[] arr;
  int LargestNumber=Integer.MIN_VALUE;
  Largest(int[] arr){
    this.arr=arr;
  }
  public int findLargest(){
    System.out.println("miN: "+LargestNumber);
    for(int i=0;i<arr.length;i++){
      if(LargestNumber<arr[i]){
        LargestNumber=arr[i];
      }
    }
    return LargestNumber;
  }
  public static void main(String[] ab){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many Elemenst u like to have: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the Elements one by one: ");
    for (int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }

    Largest l=new Largest(arr);
    System.out.println("Largest Elmenst of the Array "+Arrays.toString(arr)+" is: "+ l.findLargest());
  }
}