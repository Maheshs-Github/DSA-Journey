public class MinInsertDoubleClosing {
  public static int insertBalance(String str){
    int need=0,ans=0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i)=='('){
        need+=2;
       if (need % 2 != 0) {
                    ans++;
                    need--;
                }
              }
      else
      {
        need--;
        if(need<0)
        {
          ans++;
          need=1;
        }
      }
    }
    return ans+need;
  }

  // 
  // 
  // // with Stack Approach
  // Stack<Character> s=new  Stack<>();
  // int ans=0;
  // for (int i = 0; i < str.length(); i++) {
  //   System.out.println("Ans: "+ans+" Stack: "+s+" i: "+i);

  //   if(str.charAt(i)=='(')
  //     s.push(str.charAt(i));
  //   else{
  //     // if(!s.isEmpty())
  //     if(i+1 <str.length() && str.charAt(i)==')' && str.charAt(i+1)==')' && !s.isEmpty()){
  //       i++;
  //       s.pop();
  //       continue;
  //   } 
  //   if(i+1 <str.length() && str.charAt(i)==')' && str.charAt(i+1)==')' && s.isEmpty()){
  //     ans+=2;
  //     i++;
  //       continue;
  //   }
  //   if(i+1 <str.length() && str.charAt(i)==')' && str.charAt(i+1)!=')' && !s.isEmpty()){
  //     ans++;
  //     s.pop();
  //       continue;
  //   }
  //         if(i+1 <str.length() && str.charAt(i)==')' && str.charAt(i+1)!=')' && s.isEmpty()){
  //       ans+=3;
  //       continue;
  //     }
  //     if(i+1 >str.length() && str.charAt(i)==')' && !s.isEmpty()){
  //       ans++;
  //       s.pop();
  //       continue;
  //     }
  //           if(i+1 >str.length() && str.charAt(i)==')' && s.isEmpty()){
  //       ans+=3;
  //     }

  //   }
    
  // }
  // while(!s.isEmpty()){
  //   s.pop();
  //   ans+=2;
  // }
  // return  ans;
  // }
  public static void main(String[] args) {
    // int ans= insertBalance("())))()"); //2
    // int ans= insertBalance("))())("); //3
    // int ans= insertBalance("(())))"); //0
    // int ans= insertBalance(")))))"); //4
    // int ans= insertBalance("())(("); //4
    int ans= insertBalance("(()))(()))()())))"); //4

    System.out.println("Ans: "+ans);
  }
  
}



// 
// 
// Pattern and problem Understanding 
// Let's make simple notes for what we learned from Minimum Insertions to Balance a Parentheses String.

// ## Pattern: Greedy + Need Counter

// Main idea: Process the string from left to right and track how many closing parentheses are still required.

// ### 1. What we used

// - `need` → number of closing `)` still required.
// - `ans` → number of insertions made.

// ### 2. The rules

// | Character / condition   | Action                                    |
// | ----------------------- | ----------------------------------------- |
// | Encounter `(`           | `need += 2`                               |
// | `need` is odd after `(` | Insert one `)`, so `ans++` and `need--`   |
// | Encounter `)`           | `need--`                                  |
// | `need < 0`              | Insert `(`, so `ans++` and set `need = 1` |
// | End of string           | Add remaining `need` to `ans`             |

// ### 3. What should we recognize in future problems?

// When a problem asks for the minimum number of insertions or corrections, ask:

// 1. Can I process the input from left to right?
// 2. Can a counter represent what is still needed?
// 3. Can I fix an invalid situation immediately with a greedy decision?
// 4. Do I need to account for anything left incomplete at the end?

// If these ideas fit the problem, a greedy counter approach might work.

// Remember: We didn't just use a counter. We defined exactly what `need` means and how each character changes it. That is the important part of deriving the logic.



// 
// 
// 
// # Minimum Insertions to Balance a Parentheses String — Notes

// ## 1. What is the problem asking?

// Every opening parenthesis `(` must be followed by two consecutive closing parentheses `))`.

// We need to find the minimum number of parentheses to insert to make the string valid.

// Examples:

// - `"())"` → `0` insertions
// - `"()"` → `1` insertion
// - `"((("` → `6` insertions

// ## 2. Pattern we used: Greedy + Need Counter

// We process the string from left to right and track two variables:

// - `need` → how many closing `)` are still required.
// - `ans` → how many insertions we have made.

// ## 3. Java solution

// ```

// public static int insertBalance(String str) {
//     int need = 0;
//     int ans = 0;

//     for (int i = 0; i < str.length(); i++) {
//         char ch = str.charAt(i);

//         if (ch == '(') {
//             need += 2;

//             if (need % 2 != 0) {
//                 ans++;
//                 need--;
//             }
//         } else {
//             need--;

//             if (need < 0) {
//                 ans++;
//                 need = 1;
//             }
//         }
//     }

//     return ans + need;
// }

// ```

// ## 4. Dry run with example `"(()))"`

// Initial values: `need = 0`, `ans = 0`.

// | Character | `need` | `ans` | Explanation                    |
// | --------- | ------ | ----- | ------------------------------ |
// | `(`       | 2      | 0     | Need two closing parentheses   |
// | `(`       | 4      | 0     | Another opening needs two more |
// | `)`       | 3      | 0     | One closing supplied           |
// | `)`       | 2      | 0     | Another closing supplied       |
// | `)`       | 1      | 0     | One more closing supplied      |
// | End       | 1      | 1     | Insert one missing `)`         |

// Output: `1`.

// ### Why do we check odd `need`?

// When we encounter `(`, we add two to `need`. If `need` is odd, the closing parentheses required so far cannot be grouped correctly into pairs. We insert one `)` and decrease `need` to make it even.

// ### Why do we check `need < 0`?

// If `need` becomes negative, we encountered a `)` when no closing parenthesis was required. We insert a missing `(`, and the current `)` satisfies one of its two closing requirements. Therefore, `need = 1`.

// ## 5. Time and space complexity

// Your understanding is correct!

// - Time Complexity: \\(O(n)\\) — one loop processes each character once. Each operation inside the loop takes constant time.
// - Auxiliary Space Complexity: \\(O(1)\\) — only `need`, `ans`, `i`, and `ch` are used. No extra array or Stack is created.

// ## 6. Reusable pattern for future problems

// When solving a minimum-insertions problem, ask:

// 1. Can I scan from left to right?
// 2. Can I track what's still required with a counter?
// 3. Can I fix invalid situations immediately?
// 4. What remains incomplete at the end?

// The key skill is defining what your counter means before writing conditions. Here, `need` always represents the number of closing parentheses still required.