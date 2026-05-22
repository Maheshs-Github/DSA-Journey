public class Print1ToN {
  public void print(int n){
    // if(n==0) return;
    // print(n-1);
    // System.out.println(n);

    // to print the n to 1
            if(n==0) return;
        System.out.println(n);
        print(n-1);
  }

  public static void main(String[] args) {
    Print1ToN p=new Print1ToN();
    p.print(5);
  }
}