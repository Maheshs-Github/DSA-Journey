public class ParenthesisProblem {
  public static String Parenthesis(String str){
    StringBuilder s1=new StringBuilder();
    int depth=0;
    for (int i = 0; i <str.length()-1; i++) {
      // System.out.println(str.charAt(i)==str.charAt(i+1));
      if(str.charAt(i)=='('){
        if(depth>0)
      s1.append(str.charAt(i));
          depth++;
      }
      else{
        depth--;
        if(depth>0)
      s1.append(str.charAt(i));
      }
      // System.out.println("s[i]: "+str.charAt(i));
    }
    return s1.toString();
  }
  public static void main(String[] args) {
    // String ans=Parenthesis("(()())"); //Ans: ()()
    String ans=Parenthesis("()(()())(())"); //Ans: ()()
    System.out.println("Ans: "+ans);
  }
}