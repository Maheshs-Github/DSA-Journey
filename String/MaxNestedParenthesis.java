public class MaxNestedParenthesis {
  public static int MaxNestedDepth(String str){
    int depth=0,maxDepth=0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i)=='(')
        depth++;
      else if(str.charAt(i)==')')
        depth--;
      if(depth>maxDepth)
        maxDepth=depth;
      System.out.println("depath: "+depth+" maxDepth: "+maxDepth);
    }
    return maxDepth;
  }
    public static void main(String[] args) {
    // String ans=Parenthesis("(()())"); //Ans: ()()
    // int ans=MaxNestedDepth("(1+(2*3)+((8)/4))+1"); //Ans: 3
    int ans=MaxNestedDepth("(1)+((2))+(((3)))"); //Ans: 3
    System.out.println("Ans: "+ans);
  }
}
