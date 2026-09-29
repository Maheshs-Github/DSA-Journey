public class PalindromeSubString {
  // brute force solution 
  // public static String longestSubString(String str)
  // {
  //   String palAns="";
  //   int maxPalLen=Integer.MIN_VALUE;
  //         for (int i = 0; i < str.length(); i++) {
  //       // StringBuilder s1=new StringBuilder();
  //       for (int j = i+1; j < str.length(); j++) {  
  //         // s1.append(str.charAt(j));
  //        String subStr= str.substring(i, j+1);
  //        System.out.println("i: "+i+" j: "+j+" palAns: "+palAns+" subStr: "+subStr);
  //         if(isPalindrome(subStr))
  //         {
  //           if(maxPalLen<subStr.length()){
  //             maxPalLen=subStr.length();
  //             palAns=subStr;
  //           }
  //         }
  //       }
  //     }
  //     return palAns;
  // }

  //   public static boolean isPalindrome(String str)
  // {
  //   return str.equals(new StringBuilder(str).reverse().toString());
  // }

  // /let's see the optimal approach
  public static int expand(String str,int left,int right){
    while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
      left --;
      right++;
      System.out.println("left: "+left+" right: "+right);
    }
    System.out.println("right-left-1: "+(right-left-1));
      return right-left-1;
  }
  public static String longestSubString(String str)
{
  int longestLen=0,start=0,end=0;
  for (int i = 0; i < str.length(); i++){
    System.out.println("for i: "+i);
    int odd=expand(str,i,i);
    int even = expand(str, i, i + 1);
    if(odd>longestLen)
      longestLen=odd;
    if(even>longestLen)
      longestLen=even;
    if(longestLen>end - start + 1){
      start = i - (longestLen - 1) / 2;
      end = i + longestLen / 2;
    }
    System.out.println("longestLen: "+longestLen+" start: "+start+" end: "+end);

  }
  return str.substring(start, end + 1);
}
          public static void main(String[] args) {
    // String ans=longestSubString("dbabd"); //ans : dbabd
    String ans=longestSubString("babad"); //ans : dbabd
    System.out.println("Ans: "+ans);
  }
}

// Let's see that sub  String question , from taht pattern or string let's solve similar question , practice it 