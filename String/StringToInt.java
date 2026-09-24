public class StringToInt {
  // returning a String 
    //   public static String RToI(String str){
    // int IntVal=0;
    // // boolean isNonDigit=true;
    // StringBuilder ans=new StringBuilder();
    // for (int i = 0; i < str.length(); i++) {
    //   System.out.println("isDigit: "+(Character.isDigit(str.charAt(i))));
    //   if(Character.isDigit(str.charAt(i)) || str.charAt(i) =='-' || str.charAt(i)=='+'){
    //     ans.append(str.charAt(i));
    //   }
    //   if(!Character.isDigit(str.charAt(i)) && ans.length()>1)
    //     break;
    // }
    // return ans.toString();
    //   }

    // let's return the Integer
          public static int RToI(String str){
    int IntVal=0;

    for (int i = 0; i < str.length(); i++) {
      if(Character.isDigit(str.charAt(i)) || str.charAt(i) =='-' || str.charAt(i)=='+'){
        System.out.println("val of str: "+(str.charAt(i)-'0')+" i: "+i+" IntVal: "+IntVal);
        IntVal=(IntVal* 10)+('0'-str.charAt(i));
      }
      if(!(Character.isDigit(str.charAt(i)) || str.charAt(i) =='-' || str.charAt(i)=='+') && IntVal>1)
        break;
    }
    return IntVal;
      }
        public static void main(String[] args) {
    int ans=RToI("   -42"); //Ans: 42
    // int ans=RToI("1337c0d3"); //Ans: 1337

    System.out.println("Ans: "+ans);
  
}
}