public class IsPalindrome{

  public boolean palindrome(int No){
     int No1=No;
        int ans=0;
        if(No<0)
        return false;
        while(No>0){
            int rem=No%10;
            ans=10*ans+rem;
            No/=10;
        }
        if(No1==ans)
        return true;
        return false;
  }
  public static void main(String[] ab){
    IsPalindrome i=new IsPalindrome();
    int no=-1211;
    boolean ans= i.palindrome(no);
    System.out.println("Ans: "+ans);
  }
}