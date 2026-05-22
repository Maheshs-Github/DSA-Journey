public class FactorialN {
  public int fact(int no){
    if(no==0) return 1;
    int ans=fact(no-1);
    return ans*no;
  }
  public static void main(String[] args) {
    FactorialN f=new FactorialN();
    int ans=f.fact(5);
    System.out.println("ans: "+ans);
  }
  
}
