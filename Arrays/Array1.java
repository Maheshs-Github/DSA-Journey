public class Array1
{
  public static void main(String[] ab)
  {
    // System.out.println("Hello There");
    // int Arr[]=new int[5];
    // Arr[]={3,2,4,1,0};
    // int Arr[]={3,5,3,8,2};
    int Arr[]={3000,5,-3,800,2};
    int Largest=0;
    for(int i=0;i<Arr.length;i++ )
    {
      // System.out.println(Arr[i]);
      if(Arr[i]>Largest)
      Largest=Arr[i];
    }
    System.out.println("Largest in the Array: "+Largest);
  }
}