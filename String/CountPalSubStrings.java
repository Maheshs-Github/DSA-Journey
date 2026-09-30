public class CountPalSubStrings {

  public static int expand(String str,int left,int right){
    int total=0;
    while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
      left--;
      right++;
      ++total;
      System.out.println("total: "+total);
    }
    System.out.println("left: "+left+" right: "+right);
    return total;
    // return right-left-1;
  }
  public static void longestSubString(String str){
    int start=0,end=0,startOdd=0,endOdd=0,countTotal=0;
    for (int i = 0; i < str.length(); i++) {
      System.out.println("for i: "+i);
      int even=expand(str,i,i);
      int odd=expand(str,i,i+1);
      countTotal+=even;
      countTotal+=odd;
      // start=i-(even-1)/2;
      // end=i+even/2;
      //       startOdd=i-(odd-1)/2;
      // endOdd=i+odd/2;
      // System.out.println("Start: "+start+" end: "+end);
      // System.out.println(" "+str.substring(start,end+1));
      // System.out.println(" "+str.substring(startOdd,endOdd+1));
      System.out.println("even: "+even+" odd: "+odd);
      System.out.println("countTotal: "+countTotal);

    }
  }
  public static void main(String[] args) {
        longestSubString("babad"); //ans : dbabd
        // longestSubString("abc"); //ans : 3
        // longestSubString("abccb"); //ans : 3
    // System.out.println("Ans: "+ans);
  }
  
}
