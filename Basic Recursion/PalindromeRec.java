public class PalindromeRec {
  public boolean isPalindrome(String s,int p1,int p2){
    if(p1>p2) return true;
    System.out.println("p1: "+p1+" p2: "+p2);
    while (p1<p2 && !Character.isLetterOrDigit(p1)) {
      p1++;
    }
    while (p1<p2 && !Character.isLetterOrDigit(p2)) {
      p2--;
    }
    if(Character.toLowerCase(s.charAt(p1))!=Character.toLowerCase(s.charAt(p2)))
      return false;

    return isPalindrome(s, p1+1, p2-1);
    

  }
  public static void main(String[] args) {
    PalindromeRec f=new PalindromeRec();
    String s1=" ";
    boolean ans= f.isPalindrome(s1,0,s1.length()-1);
    System.out.println("Ans: "+ans);
  }
  
}
