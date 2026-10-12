public class ScoreOfParenthesis {
  public static int scorePara(String str){
    // int depth=0,ans=0,maxDepth=Integer.MIN_VALUE;
    // for (char ch : str.toCharArray()) {
    //   if(ch=='('){
    //     depth++;
    //     if(depth>maxDepth)
    //       maxDepth=depth;
    //   }
    //   else if(ch==')'){
    //     if(depth>1)
    //       ans+=2;
    //     else{
    //       if(maxDepth>1)
    //         continue;
    //       ans++;
    //     }

    //     depth--;
    //   }
    //   System.out.println("depth: "+depth+" ans: "+ans+" ch: "+ch);
    // }
    // return ans;

    int depth=0,ans=0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i)=='(')
        depth++;
      else{
        depth--;
        if(str.charAt(i-1)=='(')
          ans+=(int) Math.pow(2,depth);
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    // int ans=scorePara("()()"); //2
    // int ans=scorePara("(())"); //2
    // int ans=scorePara("()(())"); //3
    // int ans=scorePara("(()())"); //4
    int ans=scorePara("(()(()))"); //6
    // int ans=scorePara("(()(()))"); //4
    System.out.println("ans: "+ans);
  }
  
}



// 
// 
// Pattern amd Understanding (Little confused tho)
// Yes! You're very close. Let's turn what we learned into a reusable pattern for your DSA notes.

// ## 1. What pattern did we learn?

// Problem: Score of Parentheses

// The main idea is to recognize how a nested structure contributes to a final result.

// - `()` → score `1`
// - `(A)` → score `2 × score(A)`
// - `AB` → score `score(A) + score(B)`

// We used depth + a single traversal to calculate the score without using a Stack.

// The key observation was:

// > Whenever `()` appears as an immediate pair, its contribution is \\(2^{depth}\\), where `depth` is the number of enclosing pairs after closing that `()`.

// So, for `"(()(()))"`:

// - The first immediate `()` contributes \\(2^1=2\\).
// - The second immediate `()` contributes \\(2^2=4\\).
// - Total = \\(2+4=6\\).

// ## 2. What reusable pattern should you remember?

// ## Pattern: Nested Structure + Depth

// Use this as a clue for future problems, not as a rule for every nested problem.

// Step 1 — Identify nesting

// Look for structures inside other structures, such as parentheses, brackets, or nested expressions.

// Step 2 — Track the depth

// Increase depth when entering a structure and decrease it when leaving.

// Step 3 — Find the important event

// Ask when a structure contributes to the answer. Here, it's when we encounter an immediate `()` pair.

// Step 4 — Use depth to calculate the contribution

// Here, the contribution is a power of two. Other problems may use depth differently.

// Step 5 — Combine contributions

// Add the independent contributions to get the final score.

// ## 3. How can you recognize this pattern in future problems?

// When you see a new problem, ask yourself:

// | Question                                   | What you're looking for                       |
// | ------------------------------------------ | --------------------------------------------- |
// | Is the input nested?                       | Parentheses, brackets, recursive structures   |
// | Does nesting change the result?            | Multiplication, depth-based values, or levels |
// | Can I track the current level?             | A counter like `depth`                        |
// | Can I process the input once?              | A possible single-pass solution               |
// | Do I need to remember previous structures? | If yes, a Stack may be needed                 |

// Remember, using `depth` is a technique, not the entire pattern. The reusable skill is recognizing that nesting matters, identifying when a contribution is complete, and deriving how depth affects that contribution.

// ## 4. The most important lesson from this problem

// You initially tried to modify `ans` whenever you encountered a parenthesis. The breakthrough was realizing that you should first identify which part of the string contributes a score, and then calculate its contribution based on its nesting depth.

// That reasoning process is more valuable than memorizing `Math.pow(2, depth)`.

// For your next String problem, we'll practise the same process: understand the rules, manually solve an unfamiliar example, identify the pattern, and only then write Java code.





// 
// 
// 
// Correct! ✅ Your analysis is right.

// For our Score of Parentheses solution:

// ### Time Complexity (TC): \\(O(n)\\)

// ```
// for (int i = 0; i < str.length(); i++) {
//     char ch = str.charAt(i);
//     // constant-time operations
// }
// ```

// - The loop visits each of the \\(n\\) characters once → \\(O(n)\\).
// - `charAt(i)` takes \\(O(1)\\).
// - The depth updates, comparison, and addition are \\(O(1)\\) per iteration.
// - `Math.pow(2, depth)` is treated as \\(O(1)\\) here.

// Therefore, TC = \\(O(n)\\).

// ### Space Complexity (SC): \\(O(1)\\)

// We use only a fixed number of variables:

// - `depth` → current nesting depth.
// - `ans` → accumulated score.
// - `i` and `ch` → loop variables.

// No additional array, Stack, or collection is created.

// Therefore, auxiliary SC = \\(O(1)\\).

// One small Java detail: `str.charAt(i)` does not create a new string or array, unlike `str.toCharArray()`, which allocates an additional character array of size \\(n\\).

// ### Your notes

// | Complexity   | Result     | Reason                    |
// | ------------ | ---------- | ------------------------- |
// | TC           | \\(O(n)\\) | One traversal             |
// | Auxiliary SC | \\(O(1)\\) | Fixed number of variables |

// One caveat: This is the auxiliary-space analysis assuming the score fits in an `int`. For the actual LeetCode constraints, the score can grow exponentially with nesting, so the implementation's numeric type and overflow behavior also matter.