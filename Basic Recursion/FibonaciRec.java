public class FibonaciRec {
  public int fibo(int n){
    if(n<=1)
      return n;
    return fibo(n-2)+fibo(n-1);

  }
  public static void main(String[] args) {
    FibonaciRec f=new FibonaciRec();
    int no=7;
   int ans= f.fibo(no);
   System.out.println("Ans: "+ans);
  }
  
}


// we only want the last elment of the fibonaci series 