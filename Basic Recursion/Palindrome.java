public class Palindrome {
  public boolean isPalindrome(String s2){

    // String s=s2.trim();
    // int p1=0,p2=s.length()-1;
    // if(s=="")
    //   return true;
    // while (p1!=p2 && !(p1>p2)) {
    //   while(!Character.isLetterOrDigit(s.charAt(p1))){
    //     p1++;
    //   }
    //     while(!Character.isLetterOrDigit(s.charAt(p2))){
    //       p2--;
    //   }
    //   // System.out.println("s1: "+s.charAt(p1)+" s2: "+s.charAt(p2));
    //   if((Character.toLowerCase(s.charAt(p1)))!= Character.toLowerCase(s.charAt(p2)))
    //     return false ;
    //   p1++;
    //   p2--;
    // }
    // return true;

    String s=s2.trim();
    int p1=0,p2=s.length()-1;
    if(s.isEmpty())
      return true;
    while (p1<p2) {
      while(p1<p2 && !Character.isLetterOrDigit(s.charAt(p1))){
        p1++;
      }
        while(p1<p2 && !Character.isLetterOrDigit(s.charAt(p2))){
          p2--;
      }
      // System.out.println("s1: "+s.charAt(p1)+" s2: "+s.charAt(p2));
      if((Character.toLowerCase(s.charAt(p1)))!= Character.toLowerCase(s.charAt(p2)))
        return false ;
      p1++;
      p2--;
    }
    return true;
  }
  public static void main(String[] args) {
    Palindrome p=new Palindrome();
    // boolean ans= p.isPalindrome("abcdfabfdcba");
    // boolean ans= p.isPalindrome( " Ma:1hH1a m");
    boolean ans= p.isPalindrome( "A man, a plan, a canal: Panama");

    System.out.println("Ans: "+ans);
  }
}
