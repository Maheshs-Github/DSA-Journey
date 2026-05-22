import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest{
  int[] arr;
  SecondLargest(int[] arr){
    this.arr=arr;
    
  }
  public int findSecondLatgest(){
    int largest=Integer.MIN_VALUE;
    int secLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        secLargest=largest;
        largest=arr[i];
      }
      else if(arr[i]!=largest && secLargest<largest){
        secLargest=arr[i];
      }
    }
    return secLargest;
  }
  public static void main(String[] ab){
    Scanner sc=new Scanner(System.in);
    System.out.println("How Many nO u like to Have: ");
    int n=sc.nextInt();
    System.out.println("Enter the Elmensts one by one: ");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    SecondLargest s=new SecondLargest(arr);
    System.out.println("Second Largest ELement in the Array "+Arrays.toString(arr)+" is: "+s.findSecondLatgest());
  }
}