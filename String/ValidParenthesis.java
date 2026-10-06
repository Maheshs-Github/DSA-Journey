import java.util.Stack;

public class ValidParenthesis {
  
  public static boolean  ValParenthesis(String str){

    // this works but can't track the order with  this , so incomplete solution 
    // int cDepth=0,curDepth=0,sqrDepth=0;
    // for (char ch : str.toCharArray()) {
    //   if(ch=='(')
    //     cDepth++;
    //   if(ch==')')
    //     cDepth--;
    //   if(ch=='{')
    //     curDepth++;
    //   if(ch=='}')
    //     curDepth--;
    //   if(ch=='[')
    //     sqrDepth++;
    //   if(ch==']')
    //     sqrDepth--;
    // }
    // if(cDepth==0 && curDepth==0 && sqrDepth==0)
    //   return true;

    // return false;


    // 
    // With the Stack
    Stack<Character> s=new Stack<>();
    for (char ch : str.toCharArray()) {
      if(ch=='(' || ch=='{' || ch=='[')
        s.push(ch);
      else{

        if(s.isEmpty())
          return false;
        char top=s.pop();
        if((ch==')' && top!='(') ||
        (ch=='}' && top!='{') ||
        (ch==']' && top!='['))
        return false;
      }
      
    }
    return s.isEmpty();
  }
      public static void main(String[] args) {
    boolean ans=ValParenthesis("()[]"); //Ans: true
    // boolean ans=ValParenthesis("(]"); //Ans: false
    System.out.println("Ans: "+ans);
  }
}


// 
// 
// Valid Parentheses — Stack Pattern
// Yes — **you understood the pattern correctly.** Your code is also correct. ✅

// I'd put it in your notes like this:

// ### Valid Parentheses — Stack Pattern

// **Problem:** Check whether brackets are correctly **matched and ordered**.

// Example:

// ```text
// ()[]{}   → true
// ({)}     → false
// ```

// ### Why counter fails

// Counters can check:

// ```text
// ( count == ) count
// { count == } count
// [ count == ] count
// ```

// but **cannot track order**.

// `({)}` has matching counts, but `)` is trying to close `(` while `{` is still open.

// ### Stack pattern

// ```text
// Opening bracket → PUSH

// Closing bracket:
//     1. Stack empty? → false
//     2. Check top matches closing bracket
//     3. If match → POP
//     4. Otherwise → false

// End:
//     stack empty → true
//     stack not empty → false
// ```

// 1. Valid: ({[]})
// We process left → right.
// ch     stack
// ----------------
// (      (
// {      ( {
// [      ( { [
// ]      ( {       ← [ matched, pop
// }      (         ← { matched, pop
// )      empty     ← ( matched, pop

// At the end:
// stack.isEmpty() → true

// So valid.
// 2. Wrong order: ({)}
// This is the important one.
// ch     stack
// ----------------
// (      (
// {      ( {
// )      ( {      ← ')' should match '('

// But the top is {.
// ')'  ↔  '('   ❌

// So immediately:
// return false;

// This is exactly what counters cannot detect.

// Your core code:

// ```java
// if (ch == '(' || ch == '{' || ch == '[')
//     s.push(ch);
// else {
//     if (s.isEmpty())
//         return false;

//     char top = s.pop();

//     if ((ch == ')' && top != '(') ||
//         (ch == '}' && top != '{') ||
//         (ch == ']' && top != '['))
//         return false;
// }

// return s.isEmpty();
// ```

// ### The bigger pattern 🧠

// > **When order matters and you need to match the current element with the most recent unmatched element → think STACK.**

// That's the important DSA pattern you should remember, more than this particular parentheses problem.