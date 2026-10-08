

public class MinRemoveParenthesisValid {

  public static String valPara(String str){
    int depth=0;
    StringBuilder s=new StringBuilder();
    for (char ch : str.toCharArray()) {
      if(ch=='('){
        depth++;
        s.append(ch);
        continue;
      }
      if(ch==')')
      {
        if(depth>0){
          depth--;
          s.append(ch);
          continue;
        }
        else{
          continue;
        }

      }
      s.append(ch);

    }
    for(int i=s.length()-1;i>=0&&depth>0;i--,depth--){
      if(s.charAt(i)=='(')
        s.deleteCharAt(i);
    }
    return  s.toString();
  }

    public static void main(String[] args) {
    // int ans= valPara("())");
    // int ans= valPara("(((");
    // String ans= valPara("lee(t(c)o)de)"); //lee(t(c)o)de
    // String ans= valPara("a)b(c)d");  //ab(c)d
    String ans= valPara("))((");  //ab(c)d

    System.out.println("Ans: "+ans);
  }
  
}
