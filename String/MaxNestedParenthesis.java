public class MaxNestedParenthesis {
  public static int MaxNestedDepth(String str){
    // int depth=0,maxDepth=0;
    // for (int i = 0; i < str.length(); i++) {
    //   if(str.charAt(i)=='(')
    //     depth++;
    //   else if(str.charAt(i)==')')
    //     depth--;
    //   if(depth>maxDepth)
    //     maxDepth=depth;
    //   System.out.println("depath: "+depth+" maxDepth: "+maxDepth);
    // }
    // return maxDepth;


    // Let's revise max Nested 
    int depth=0,maxDepth=0;
    for (char ch : str.toCharArray()) {
      if(ch=='(')
        depth++;
      if(ch==')')
        depth--;
      if(depth>maxDepth)
        maxDepth=depth;
    }
    return  maxDepth;
  }
    public static void main(String[] args) {
    // String ans=Parenthesis("(()())"); //Ans: ()()
    // int ans=MaxNestedDepth("(1+(2*3)+((8)/4))+1"); //Ans: 3
    int ans=MaxNestedDepth("(1)+((2))+(((3)))"); //Ans: 3
    System.out.println("Ans: "+ans);
  }
}


// 
// 
// 
// Understading the Pattern and solution 
// Exactly. **Same `depth` pattern**, just a different goal.

// ### Maximum Depth of Parentheses

// **Input:**
// ```text
// ()(())
// ```

// **Output:**
// ```text
// 2
// ```

// ### Pattern

// We don't remove anything. We simply track the current nesting depth:

// ```java
// int depth = 0;
// int maxDepth = 0;

// for (char ch : str.toCharArray()) {
//     if (ch == '(') {
//         depth++;
//         maxDepth = Math.max(maxDepth, depth);
//     } else {
//         depth--;
//     }
// }

// return maxDepth;
// ```

// ### Why `()(())` → `2`

// Think of `depth` as **how many `(` are currently open**:

// ```text
// (  → depth = 1
// )  → depth = 0

// (  → depth = 1
// (  → depth = 2  ← maximum
// )  → depth = 1
// )  → depth = 0
// ```

// So:

// ```text
// maxDepth = 2
// ```

// ### Pattern to add to your notes

// > **Parentheses nesting → use `depth`.**
// >
// > `(` → `depth++`  
// > `)` → `depth--`  
// > Need maximum nesting → update `maxDepth` after `depth++`.

// And yes, `()` contributes `+1` then `-1`; it doesn't mean the answer becomes 1 permanently. **Depth represents the current nesting**, while `maxDepth` remembers the highest depth reached.




// 
// 
// About traversal 
// Yes, exactly. Add this small Java syntax note:

// ### String traversal

// **Using index `i`:**
// ```java
// for (int i = 0; i < str.length(); i++) {
//     char ch = str.charAt(i);
// }
// ```

// **Using for-each:**
// ```java
// for (char ch : str.toCharArray()) {
//     // use ch directly
// }
// ```

// So remember:

// > **Need index → normal `for` + `charAt(i)`**  
// > **Only need characters → for-each + `toCharArray()`**