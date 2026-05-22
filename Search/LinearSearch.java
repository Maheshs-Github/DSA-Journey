import java.util.Scanner;
public class LinearSearch{
  // int[] Arr=[]
  // public int Search(int val, int[] Arr){
  public String Search(int val, int[] Arr){
    for (int i=0;i<Arr.length;i++){
      if(Arr[i]==val)
        {
          return "Key is Found";
        // return i;
        }
    }
    // return -1;
    return "Value is not Found";
  }

public static void main(String[] ab ){
  // System.out.println("Hello There");
  int[] Arr={42,13,65,21,10,13,32,56};
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Key: ");
  int input =sc.nextInt();
  LinearSearch LS1=new LinearSearch();
  // int result= LS1.Search(input,Arr);
  String result= LS1.Search(input,Arr);

  System.out.println(result);
  // if(result==-1)
  // System.out.println("Value is not Found");
  // else
  // System.out.println("Key is Found");

}

}