import java.util.Stack;

public class MinRemoveParenthesisValid {

  // Let's see with depth apprcah
  // public static String valPara(String str){
  //   int depth=0;
  //   StringBuilder s=new StringBuilder();
  //   for (char ch : str.toCharArray()) {
  //     if(ch=='('){
  //       depth++;
  //       s.append(ch);
  //       continue;
  //     }
  //     if(ch==')')
  //     {
  //       if(depth>0){
  //         depth--;
  //         s.append(ch);
  //         continue;
  //       }
  //       else{
  //         continue;
  //       }
  //     }
  //     s.append(ch);
  //     System.out.println("s: "+s);
  //   }
  //     System.out.println("s: "+s);
  //   System.out.println("s: "+s.length());
  //   for(int i=s.length()-1;i>=0 && depth>0;i--){
  //     if(s.charAt(i)=='('){
  //       s.deleteCharAt(i);
  //       depth--;
  //     }
  //   }
  //   return  s.toString();
  // }

  // Let's see with Stack Approach 
    public static String valPara(String str){
    Stack<Integer> s=new Stack<>();
    StringBuilder s1=new StringBuilder();
    for (Character ch : str.toCharArray()) {
      if(ch=='('){
        // s.push(ch);
        s.push(s1.length());
        s1.append(ch);
          continue;
      }
      if(ch==')'){
        if(s.isEmpty())
          continue;
        // char top=s.pop();
        // if(!s.pop())
          // continue;
        else{
          s1.append(ch);
          s.pop();
          continue;
        }
      }
      s1.append(ch);
    }
    System.out.println("s1: "+s1);
        System.out.println("Ans: "+s.size());
    // for(int i=s1.length()-1;i>=0 && !s.isEmpty();i--){
    //   if(s1.charAt(i)=='('){
    //     s1.deleteCharAt(i);
    //     s.pop();
    //   }
    // System.out.println("s1: "+s1);
    // System.out.println("s: "+s);
    // }
        while(!s.isEmpty())
          s1.deleteCharAt(s.pop());
    System.out.println("s1: "+s1);
    return s1.toString();

  }


    public static void main(String[] args) {
    String ans= valPara("lee(t(c)o)de)"); //lee(t(c)o)de
    // String ans= valPara("a)b(c)d");  //ab(c)d
    // String ans= valPara("))((");  //
    // String ans= valPara("(a(b(c)d)");  //ab(c)d

    System.out.println("Ans: "+ans);
  }
  
}


// 
// 
// depth  Approach and Patterns
// Your understanding is correct. Let's turn it into clean notes so you can revise the pattern quickly before interviews.

// # Minimum Remove to Make Parentheses Valid

// Problem: Given a string, remove the minimum number of parentheses so the remaining string is valid. Keep all other characters unchanged.

// Example:

// ```
// Input:  "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// ```

// ## 1. First pass — use `depth` to handle `)`

// We build the result using `StringBuilder`.

// ```
// int depth = 0;
// StringBuilder sb = new StringBuilder();

// for (char ch : str.toCharArray()) {
//     if (ch == '(') {
//         depth++;
//         sb.append(ch);
//     } 
//     else if (ch == ')') {
//         if (depth > 0) {
//             depth--;
//             sb.append(ch);
//         }
//         // Otherwise, skip the unmatched ')'
//     } 
//     else {
//         sb.append(ch);
//     }
// }
// ```

// ### Why does this work?

// - `(` — append it and increase `depth`. We don't yet know whether it will have a matching `)`.
// - `)` — if `depth > 0`, an opening bracket is available to match it. Decrease `depth` and append `)`. Otherwise, skip it.
// - Other characters — always append them because they aren't parentheses and must be preserved.

// For example, `"lee(t(c)o)de)"` has an extra `)` at the end. When it arrives, `depth == 0`, so we skip it.

// ## 2. Second pass — handle unmatched `(`

// After the first pass, `depth` tells us how many opening parentheses remain unmatched.

// For example:

// ```
// Input:  "a((b)c"
// After first pass: "a((b)c"
// depth = 1
// ```

// The unmatched `(` might be anywhere, so we scan from right to left.

// ```
// for (int i = sb.length() - 1; i >= 0 && depth > 0; i--) {
//     if (sb.charAt(i) == '(') {
//         sb.deleteCharAt(i);
//         depth--;
//     }
// }
// ```

// We decrease `depth` only when we actually find and remove an `(`. Other characters are left untouched.

// The result is `"a(b)c"`.

// ## 3. Complete pattern to remember

// Pass 1: Left to right

// Use `depth` to skip unmatched `)`. Append valid parentheses and all other characters.

// Pass 2: Right to left

// Remove unmatched `(` until `depth == 0`.

// Return the result

// Use `sb.toString()` to convert the `StringBuilder` into a `String`.

// ## 4. What patterns did we learn?

// - Depth/count: Track currently unmatched opening parentheses.
// - Greedy matching: Match each `)` with an available earlier `(`; otherwise skip it.
// - Reverse traversal: Remove the remaining unmatched `(` from the right.
// - StringBuilder: Efficiently build and modify a string.
// - Character traversal: Use `for (char ch : str.toCharArray())` when you don't need an index; use an indexed loop when you do.

// One-line memory trick:

// > Remove invalid closing parentheses while moving forward, then remove unmatched opening parentheses while moving backward.

// This is the key pattern from the depth-based solution. Your Stack solution follows a similar two-stage idea, except the Stack remembers the unmatched opening brackets explicitly instead of tracking only their count.




// 
// 
// Stack Approach and Patterns
// # Minimum Remove to Make Parentheses Valid — Stack Approach

// Problem: Remove the minimum number of parentheses so the remaining string is valid, while preserving all other characters.

// Example:

// ```
// Input:  "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// ```

// ## 1. First pass — use a Stack to track unmatched `(`

// The Stack remembers which opening parentheses haven't been matched yet.

// ```
// Stack<Integer> stack = new Stack<>();
// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < str.length(); i++) {
//     char ch = str.charAt(i);

//     if (ch == '(') {
//         stack.push(sb.length());
//         sb.append(ch);
//     }
//     else if (ch == ')') {
//         if (!stack.isEmpty()) {
//             stack.pop();
//             sb.append(ch);
//         }
//         // Otherwise, skip unmatched ')'
//     }
//     else {
//         sb.append(ch);
//     }
// }
// ```

// Why store an index?

// We store the position of each `(` in the `StringBuilder`, so we can identify exactly which opening parentheses remain unmatched.

// For example, with `"a((b)c"`:

// ```
// Stack = [1, 2]
// sb    = "a((b)c"
// ```

// Both opening parentheses are still unmatched.

// ## 2. Second pass — remove unmatched `(`

// At the end of the first pass, the Stack contains the positions of unmatched opening parentheses.

// ```
// while (!stack.isEmpty()) {
//     sb.deleteCharAt(stack.pop());
// }
// ```

// This removes the unmatched `(` from the result.

// For `"a((b)c"`, the final result is:

// ```
// "a(b)c"
// ```


// ## 4. The pattern for your notes

// Pass 1 — Traverse left to right

// - `(` → store its position in the Stack and append it.
// - `)` → if the Stack is non-empty, pop one opening position and append `)`. Otherwise, skip it.
// - Other characters → always append.

// Pass 2 — Remove unmatched openings

// - Pop the remaining positions.
// - Delete `(` at each stored position.
// - Return `sb.toString()`.

// ### How does this differ from the depth approach?

// | Depth approach                       | Stack approach                      |
// | ------------------------------------ | ----------------------------------- |
// | Tracks the number of unmatched `(`   | Tracks their exact positions        |
// | Uses `depth`                         | Uses `Stack<Integer>`               |
// | Scans backward to find unmatched `(` | Deletes them using stored positions |

// Remember: Use `depth` when you only need the count. Use a Stack when you need to remember the actual positions or elements that are still unmatched.





// 
// 
//  Time Complexity and Space Complexity 
// For the depth approach, let \\(n\\) = length of the input string.

// ### Time Complexity (TC)

// | Operation                     | Complexity                         |
// | ----------------------------- | ---------------------------------- |
// | `str.toCharArray()`           | \\(O(n)\\)                         |
// | First loop                    | \\(O(n)\\)                         |
// | `sb.append(ch)`               | \\(O(1)\\) amortized per character |
// | Second loop                   | \\(O(n)\\)                         |
// | `sb.deleteCharAt(i)` backward | \\(O(1)\\) per deletion            |
// | `sb.toString()`               | \\(O(n)\\)                         |

// Total: \\(O(n+n+n+n)=\boxed{O(n)}\\)

// ### Space Complexity (SC)

// | Operation           | Space      |
// | ------------------- | ---------- |
// | `toCharArray()`     | \\(O(n)\\) |
// | `StringBuilder`     | \\(O(n)\\) |
// | `toString()` result | \\(O(n)\\) |
// | `depth`, `i`        | \\(O(1)\\) |

// Total peak auxiliary space: \\(\boxed{O(n)}\\).

// Remember: Even though we add multiple \\(O(n)\\) terms, we simplify them to \\(O(n)\\), not \\(O(3n)\\).



// Yes, correct! For the Stack approach:

// ### Time Complexity (TC)

// | Operation                      | Complexity       |
// | ------------------------------ | ---------------- |
// | `str.toCharArray()`            | \\(O(n)\\)       |
// | First loop + `sb.append()`     | \\(O(n)\\)       |
// | `stack.push()` / `stack.pop()` | \\(O(1)\\) each  |
// | Removing unmatched `(`         | \\(O(n)\\) total |
// | `sb.toString()`                | \\(O(n)\\)       |

// Total: \\(\boxed{O(n)}\\)

// ### Space Complexity (SC)

// | Operation           | Space                 |
// | ------------------- | --------------------- |
// | `toCharArray()`     | \\(O(n)\\)            |
// | `StringBuilder`     | \\(O(n)\\)            |
// | Stack               | \\(O(n)\\) worst case |
// | `toString()` result | \\(O(n)\\)            |

// Total: \\(\boxed{O(n)}\\)

// Key difference: Both depth and stack approaches have \\(O(n)\\) time and \\(O(n)\\) space. The stack approach uses extra memory for the stack, while the depth approach uses only an integer counter.