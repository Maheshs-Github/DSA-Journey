public class SumNNo {
  public int sum(int no){
    if(no==0) return 0;
    int ans=sum(no-1);
    return ans+no;

  }
  public static void main(String[] args) {
    SumNNo s=new SumNNo();
    int ans=s.sum(5);
    System.out.println("Ans: "+ans);
  }
  
}
