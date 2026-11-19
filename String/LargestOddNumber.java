public class LargestOddNumber {

  public static String largestOddNoString(String str){

    // this Apprach is not working for the overflow ,let's try something elss
    // int largestNo=Integer.MIN_VALUE;
    // int no=0;
    // for (int i = 0; i < str.length(); i++) {
    //   int digit=str.charAt(i)-'0';
    //   no=no*10+digit;
    //   if(no%2!=0 && largestNo<no){
    //     largestNo=no;
    //   }
    //   System.out.println("no: "+no+" largest: "+largestNo+" digit: "+digit);
      
    // }
    // return largestNo==Integer.MIN_VALUE? "": String.valueOf(largestNo);


    // 
    // let's see with the another apprach to traverse from end 
    for (int i = str.length()-1; i >=0; i--) {
      int digit=str.charAt(i)-'0';
      if(digit%2!=0)
        return str.substring(0, i+1);
    }
    return "";
  }
  
    public static void main(String[] args) {
    String ans=largestOddNoString("4206")  ;//""
    // String ans=largestOddNoString("52")  ;//"5"
    // String ans=largestOddNoString("35427")  ;//"35427"
    // String ans=largestOddNoString("7542351161")  ;//"7542351161"
    System.out.println("Ans: "+ans);
  }
}
