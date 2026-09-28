public class PalindromeSubString {
  // brute force solution 
  // public static String longestSubString(String str)
  // {
  //   String palAns="";
  //   int maxPalLen=Integer.MIN_VALUE;
  //         for (int i = 0; i < str.length(); i++) {
  //       // StringBuilder s1=new StringBuilder();
  //       for (int j = i; j < str.length(); j++) {  
  //         // s1.append(str.charAt(j));
  //        String subStr= str.substring(i, j+1);
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

  // /let's see the optimal approach
  public static int expand(String str,int left,int right){
    while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
      left --;
      right++;
    }
      return right-left-1;
  }
  public static int longestSubString(String str)
{
  int longestLen=0;
  for (int i = 0; i < str.length(); i++){
    int odd=expand(str,i-1,i+1);
    int even = expand(str, i, i + 1);
    if(odd>longestLen)
      longestLen=odd;
        if(even>longestLen)
      longestLen=even;
    

  }
  return longestLen;
}
          public static void main(String[] args) {
    int ans=longestSubString("dbabd"); //ans : bab
    System.out.println("Ans: "+ans);
  }
}
