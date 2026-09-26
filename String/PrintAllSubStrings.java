public class PrintAllSubStrings {
  // to print all substring of teh String 
    public static void SString(String str){
      for (int i = 0; i < str.length(); i++) {
        // StringBuilder s1=new StringBuilder();
        for (int j = i; j < str.length(); j++) {
          // s1.append(str.charAt(j));
          // str.substring(i, j+1);
          System.out.println(" "+str.substring(i, j+1));
          
        }
      }
    }
        public static void main(String[] args) {
    SString("abc"); 
  }
}
