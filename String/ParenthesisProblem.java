public class ParenthesisProblem {
  public static String Parenthesis(String str){
    // StringBuilder s1=new StringBuilder();
    // int depth=0;
    // for (int i = 0; i <str.length()-1; i++) {
    //   // System.out.println(str.charAt(i)==str.charAt(i+1));
    //   if(str.charAt(i)=='('){
    //     if(depth>0)
    //   s1.append(str.charAt(i));
    //       depth++;
    //   }
    //   else{
    //     depth--;
    //     if(depth>0)
    //   s1.append(str.charAt(i));
    //   }
    //   // System.out.println("s[i]: "+str.charAt(i));
    // }
    // return s1.toString();


    // Let's revise it 
    StringBuilder s1=new StringBuilder();
    int depth=0;
    for (int i = 0; i < str.length(); i++) {
      // System.out.println("i: "+i+" cha[i]: "+str.charAt(i)+" depth: "+depth);
      if(str.charAt(i)=='('){
        if(depth>0){
          s1.append(str.charAt(i));
        }
          depth++;
      }
      else{
        depth--;
        if(depth>0)
          s1.append(str.charAt(i));
      }
    }
    return s1.toString();

  }
  public static void main(String[] args) {
    // String ans=Parenthesis("(()())"); //Ans: ()()
    String ans=Parenthesis("()(()())(())"); //Ans: ()()
    System.out.println("Ans: "+ans);
  }
}



// 
// 
// Understanding and Patterns of the Problem 
// Yes — for notes, I would make it **very code-oriented** so you can look at it later and immediately remember.

// ### Remove Outermost Parentheses

// **Problem:** Remove the outermost pair of every primitive parentheses group.

// ```text
// Input:  (()())
// Output: ()()
// ```

// ### Pattern: `depth`

// ```java
// int depth = 0;
// StringBuilder sb = new StringBuilder();

// for (char ch : str.toCharArray()) {

//     if (ch == '(') {
//         if (depth > 0) sb.append(ch); // not outer
//         depth++;
//     } 
//     else {
//         depth--;
//         if (depth > 0) sb.append(ch); // not outer
//     }
// }

// return sb.toString();
// ```

// ### Remember this

// ```text
// '(' → check BEFORE depth++
// ')' → check AFTER depth--
// ```

// Why?

// ```text
// (       → depth 0 → OUTER → don't add
// (       → depth 1 → INNER → add
// )       → depth becomes 1 → INNER → add
// )       → depth becomes 0 → OUTER → don't add
// ```

// So the **one-line memory trick**:

// > **Opening:** `if depth > 0 → add`, then `depth++`  
// > **Closing:** `depth--`, then `if depth > 0 → add`

// And:

// ```java
// StringBuilder → String
// sb.toString()
// ```

// To iterate over char from the String will use str.toCharArray()

// That's enough for your notes.