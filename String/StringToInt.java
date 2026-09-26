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

    // let's return the Integer, wrong solution 
    //       public static int RToI(String str){
    // int IntVal=0,sign=+1;
    // boolean noOccured=false;

    // for (int i = 0; i < str.length(); i++) {
    //         if(!(Character.isDigit(str.charAt(i))) && noOccured)
    //     break;
    //   if(str.charAt(i) =='-')
    //   {
    //     sign=-1;
    //     continue;
    //   }
    //   if(Character.isDigit(str.charAt(i))){
    //     noOccured=true;
    //     IntVal=(IntVal* 10)+(str.charAt(i)-'0');
    //   }

    // }
    // return IntVal*sign;
    //   }

    // okay see the proper solution 
          public static int RToI(String str){
            int sign=+1,intVal=0,i=0;
            while(i<str.length() && str.charAt(i)==' ')
              i++;
            if(i<str.length() && (str.charAt(i)=='+'|| str.charAt(i)=='-'))
            {
              if(str.charAt(i)=='-')
                sign=-1;
              i++;
            }
            while(i<str.length() && Character.isDigit(str.charAt(i))){
              int digit=str.charAt(i)-'0';
               // 4. Check overflow
        if (intVal > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
              intVal=intVal*10+digit;
              i++;
            }
            return intVal*sign;
          }
        public static void main(String[] args) {
    int ans=RToI("   -42"); //Ans: 42
    // int ans=RToI("1337c0d3"); //Ans: 1337
    // int ans=RToI("0-1"); //Ans: 0

    System.out.println("Ans: "+ans);
  
}
}