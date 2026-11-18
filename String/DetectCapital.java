public class DetectCapital {
  public static boolean isValcapital(String str){
    if(Character.isUpperCase(str.charAt(0))){
      if(str.length()>1 && Character.isUpperCase(str.charAt(1))){
        for(int i=1;i<str.length();i++){
          if(!Character.isUpperCase(str.charAt(i)))
            return false;
        }
      }
      else
      {
        for(int i=1;i<str.length();i++){
          if(!Character.isLowerCase(str.charAt(i)))
            return false;
        }
      }
    }
    else{
              for(int i=1;i<str.length();i++){
          if(!Character.isLowerCase(str.charAt(i)))
            return false;
        }
    }
    return true;
  }
  public static void main(String[] args) {
    // boolean ans=isValcapital("INDIA");//true
    // boolean ans=isValcapital("FlaG");//false
    boolean ans=isValcapital("Leetcode");//false

    System.out.println("Ans: "+ans);
  }
}
