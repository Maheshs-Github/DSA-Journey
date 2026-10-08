public class MinAddParenthesisValid {
 
  public static int valPara(String str){
    int depth=0,extra=0;
    for (char ch: str.toCharArray()) {
      // if(depth<0){
      //   depth--;
      //   continue;
      // }
      if(ch=='(')
        depth++;
      if (ch==')'){
        if(depth>0)
        depth--;
      else
        extra++;
      }
      System.out.println("depth: "+depth);
    }
    return  extra+depth;
  }
  public static void main(String[] args) {
    // int ans= valPara("())");
    // int ans= valPara("(((");
    int ans= valPara("()))((");
    System.out.println("Ans: "+ans);
  }
}



// Yes — **now you've got the actual pattern.** Your code is correct. ✅

// The key insight is that **one `depth` is not enough** because there are two different kinds of unmatched brackets.

// ### Pattern: Minimum Add to Make Parentheses Valid

// We maintain:

// ```java
// int depth = 0;
// int extra = 0;
// ```

// Think:

// - `depth` = how many `(` are currently waiting for a `)`
// - `extra` = how many `)` appeared when there was **no `(` available**

// ### Rules

// ```text
// '(' → depth++

// ')' → if depth > 0 → depth--
//       else          → extra++
// ```

// At the end:

// ```text
// answer = extra + depth
// ```

// Why?

// - Every `extra` needs one `(` before it.
// - Every remaining `depth` needs one `)` after it.

// ---

// ### Example: `()))((`

// Trace:

// ```text
// ( → depth = 1
// ) → depth = 0
// ) → extra = 1
// ) → extra = 2
// ( → depth = 1
// ( → depth = 2
// ```

// End:

// ```text
// extra = 2
// depth = 2
// ```

// Therefore:

// ```text
// answer = 2 + 2 = 4
// ```

// ---

// ### Compare with `()(())`

// ```text
// ( → depth 1
// ) → depth 0
// ( → depth 1
// ( → depth 2
// ) → depth 1
// ) → depth 0
// ```

// End:

// ```text
// extra = 0
// depth = 0
// answer = 0
// ```

// ### The important pattern for your notes

// > **For parentheses validity, `depth` tracks unmatched opening brackets.**
// >
// > If a closing bracket arrives when `depth == 0`, it cannot be matched → track it separately with `extra`.
// >
// > Final answer = **unmatched `)` + unmatched `(`**.

// And yes, the basic parenthesis rule stays the same:

// ```text
// ( → +1
// ) → -1
// ```

// The difference here is that **we don't allow depth to go negative**. Instead, a negative situation is recorded as `extra`.