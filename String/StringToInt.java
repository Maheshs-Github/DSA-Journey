public class StringToInt {
  // returning a String 
    //   public static String RToI(String str){
    // int IntVal=0;
    // // boolean isNonDigit=true;
    // StringBuilder ans=new StringBuilder();
    // for (int i = 0; i < str.length(); i++) {
    //   System.out.println("isDigit: "+(Character.isDigit(str.charAt(i))));
    //   if(Character.isDigit(str.charAt(i)) || str.charAt(i) =='-' || str.charAt(i)=='+'){
    //     ans.append(str.charAt(i));
    //   }
    //   if(!Character.isDigit(str.charAt(i)) && ans.length()>1)
    //     break;
    // }
    // return ans.toString();
    //   }

    // let's return the Integer, wrong solution 
    //       public static int RToI(String str){
    // int IntVal=0,sign=+1;
    // boolean noOccured=false;

    // for (int i = 0; i < str.length(); i++) {
    //         if(!(Character.isDigit(str.charAt(i))) && noOccured)
    //     break;
    //   if(str.charAt(i) =='-')
    //   {
    //     sign=-1;
    //     continue;
    //   }
    //   if(Character.isDigit(str.charAt(i))){
    //     noOccured=true;
    //     IntVal=(IntVal* 10)+(str.charAt(i)-'0');
    //   }

    // }
    // return IntVal*sign;
    //   }

    // okay see the proper solution 
        //   public static int RToI(String str){
        //     int sign=+1,intVal=0,i=0;
        //     while(i<str.length() && str.charAt(i)==' ')
        //       i++;
        //     if(i<str.length() && (str.charAt(i)=='+'|| str.charAt(i)=='-'))
        //     {
        //       if(str.charAt(i)=='-')
        //         sign=-1;
        //       i++;
        //     }
        //     while(i<str.length() && Character.isDigit(str.charAt(i))){
        //       int digit=str.charAt(i)-'0';
        //        // 4. Check overflow
        // if (intVal > (Integer.MAX_VALUE - digit) / 10) {
        //     return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        // }
        //       intVal=intVal*10+digit;
        //       i++;
        //     }
        //     return intVal*sign;
        //   }
        // public static int SToI(String str){
          // int ans=0,i=0,sign=1;
          // System.out.println("i: "+i);
          // while(i<str.length() && str.charAt(i)==' ' || str.charAt(i)=='+' || str.charAt(i)=='-'){
          //   if(str.charAt(i)=='-')
          //     sign=-1;
          //   i++;
          // }
          // int digit=0;
          // while(i<str.length() && Character.isDigit(str.charAt(i))){
          //   System.out.println("ans: "+ans);
          //   digit=str.charAt(i)-'0';

          //    // 4. Check overflow
          //   if (ans > (Integer.MAX_VALUE - digit) / 10) {
          //       return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
          //   }
          //   ans=(ans*10)+digit;
          //   i++;
          // }
          // return ans*sign;
        // }


        // 
        // 
        // LET"S REVISE IT AGAIN
        public static int SToI(String str){
          int i=0,sign=1,ans=0;
          while(i<str.length() && (str.charAt(i)==' ' || str.charAt(i)=='+' || str.charAt(i)=='-')){
            if(str.charAt(i)=='-')
              sign=-1;
            i++;
          }
          while(i<str.length() && Character.isDigit(str.charAt(i))){
            int digit=str.charAt(i)-'0';
                        System.out.println("digit: "+digit);
            ans=ans*10+digit;
            i++;
          }
          return ans;
        }


        public static void main(String[] args) {
    // int ans=RToI("   -42"); //Ans: 42
    int ans=SToI("1337c0d3"); //Ans: 1337
    // int ans=RToI("0-1"); //Ans: 0
    // int ans=SToI("  -42e34"); //Ans: 42

    System.out.println("Ans: "+ans);
  
}
}









// 
// 
// Notes and Understading 

// Your understanding is mostly correct! You're identifying an important pattern here: processing a string in stages using an index (`i`) and validating each character before moving to the next stage.

// Let's organize what we did into notes, including one important correction in your understanding.

// # String to Integer (atoi) — LeetCode 8

// ## 1. Understanding the problem

// We are given a string and need to extract an integer from it.

// For example:

// ```
// Input:  "   -042abc"
// Output: -42
// ```

// We don't convert the entire string blindly. We process it in stages.

// ## 2. Pattern we used: Sequential String Parsing

// The main idea is to process the string from left to right, validating characters at each stage.

// We use an index `i` to remember our current position.

// There are three main stages.

// ### Stage 1: Skip leading spaces

// ```
// while (i < str.length() && str.charAt(i) == ' ') {
//     i++;
// }
// ```

// - Check whether the current character is a space.
// - If yes, move to the next character using `i++`.
// - Continue until we find a non-space character or reach the end.

// ### Stage 2: Identify the sign

// ```
// if (i < str.length() && str.charAt(i) == '-') {
//     sign = -1;
//     i++;
// } else if (i < str.length() && str.charAt(i) == '+') {
//     sign = 1;
//     i++;
// }
// ```

// - If we find `-`, set `sign = -1`.
// - If we find `+`, set `sign = 1`.
// - If neither exists, the default sign is `1`.

// Important correction: Your original first `while` combines spaces and signs. This can incorrectly accept multiple signs or spaces after a sign.

// For example, `"--42"` should not be treated as `42`.

// We should skip spaces first, then check at most one sign.

// ### Stage 3: Convert digits into an integer

// ```
// while (i < str.length() && Character.isDigit(str.charAt(i))) {
//     int digit = str.charAt(i) - '0';

//     ans = ans * 10 + digit;

//     i++;
// }
// ```

// This is the most important part.

// Why `char - '0'`?

// Characters have numeric character codes. Subtracting `'0'` gives us the actual digit value.

// For example:

// ```
// '5' - '0' = 5
// ```

// Why `ans * 10 + digit`?

// Because every new digit needs to be added at the end of the existing number.

// For example, converting `"425"`:

// | Digit | Calculation   | ans |
// | ----- | ------------- | --- |
// | 4     | `0 * 10 + 4`  | 4   |
// | 2     | `4 * 10 + 2`  | 42  |
// | 5     | `42 * 10 + 5` | 425 |

// Finally:

// ```
// return ans * sign;
// ```

// If the sign is negative, the result becomes negative.

// ## 3. Complete dry run

// Input:

// ```
// str = "   -042abc"
// ```

// Stage 1 — Spaces

// We skip the first three spaces.

// Now `i = 3`, pointing to `-`.

// Stage 2 — Sign

// We find `-`.

// ```
// sign = -1;
// i++;
// ```

// Now `i = 4`.

// Stage 3 — Digits

// | Character | Digit | Calculation  | ans |
// | --------- | ----- | ------------ | --- |
// | `0`       | 0     | `0 * 10 + 0` | 0   |
// | `4`       | 4     | `0 * 10 + 4` | 4   |
// | `2`       | 2     | `4 * 10 + 2` | 42  |

// Next character is `a`.

// `Character.isDigit('a')` returns `false`, so the loop stops.

// Finally:

// ```
// return 42 * -1;
// ```

// Output: -42

// ## 4. What pattern should we remember?

// Pattern: Sequential String Parsing

// When a string contains different types of information, process it in stages instead of trying to handle everything in one condition.

// 1. Skip unwanted leading characters.
// 2. Identify optional information (such as sign).
// 3. Process valid characters until the condition fails.
// 4. Convert characters into their required data type.
// 5. Return the final result.

// ### When can we use this pattern?

// Look for problems involving:

// - String to Integer conversion.
// - Parsing numbers from strings.
// - Processing signs and digits.
// - Extracting information until an invalid character appears.
// - Validating input character by character.

// ## 5. Time and Space Complexity

// Time Complexity: O(n)

// - First loop: traverses leading spaces.
// - Sign check: O(1).
// - Second loop: traverses digits.
// - Each character is processed at most once.

// Even though we have multiple stages, we don't traverse the entire string multiple times. The index keeps moving forward.

// Auxiliary Space Complexity: O(1)

// We use a fixed number of variables:

// - `i`
// - `sign`
// - `ans`
// - `digit`

// No additional array, Stack, or collection is created.

// ## 6. One important thing about your current code

// Your original code:

// ```
// while(i < str.length() &&
//       (str.charAt(i) == ' ' ||
//        str.charAt(i) == '+' ||
//        str.charAt(i) == '-'))
// ```

// This is not correct for the actual atoi rules because it allows multiple spaces and signs to be skipped together.

// The correct sequence is:

// `Leading spaces → Optional sign (once) → Digits → Stop`

// Also, your current `int ans` implementation does not handle 32-bit overflow. That is the rounding/clamping part we should understand separately.

// The biggest takeaway: You are learning to identify not just a DSA data structure or algorithm, but also a problem-solving pattern. Here, that pattern is controlled, sequential parsing using an index and validation conditions.