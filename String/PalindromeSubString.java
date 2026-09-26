public class PalindromeSubString {
  // brute force solution 
  public static String longestSubString(String str)
  {
    String palAns="";
    int maxPalLen=Integer.MIN_VALUE;
          for (int i = 0; i < str.length(); i++) {
        // StringBuilder s1=new StringBuilder();
        for (int j = i; j < str.length(); j++) {
          // s1.append(str.charAt(j));
         String subStr= str.substring(i, j+1);
          if(isPalindrome(subStr))
          {
            if(maxPalLen<subStr.length()){
              maxPalLen=subStr.length();
              palAns=subStr;
            }
          }
          
        }
      }
      return palAns;
  }
  public static boolean isPalindrome(String str)
  {
    return str.equals(new StringBuilder(str).reverse().toString());
  }
          public static void main(String[] args) {
    String ans=longestSubString("babad"); //ans : bab
    System.out.println("Ans: "+ans);
  }
}
