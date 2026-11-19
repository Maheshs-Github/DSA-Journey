public class DetectCapital {
  public static boolean isValcapital(String str){
    if(Character.isUpperCase(str.charAt(0))){
      if(str.length()>1 && Character.isUpperCase(str.charAt(1))){
        for(int i=2;i<str.length();i++){
          if(!Character.isUpperCase(str.charAt(i)))
            return false;
        }
      }
      else
      {
        for(int i=2;i<str.length();i++){
          if(!Character.isLowerCase(str.charAt(i)))
            return false;
        }
      }
    }
    else{
              for(int i=1;i<str.length();i++){
          if(!Character.isLowerCase(str.charAt(i)))
            return false;
        }
    }
    return true;
  }
  public static void main(String[] args) {
    boolean ans=isValcapital("INDIA");//true
    // boolean ans=isValcapital("FlaG");//false
    // boolean ans=isValcapital("Leetcode");//true
    // boolean ans=isValcapital("L");//true

    System.out.println("Ans: "+ans);
  }
}




// 
// 
// Notes 
// # **Detect Capital – LeetCode**

// ## **1. Understanding the problem**

// We are given a string and need to check whether the capitalisation is correct.

// There are only **3 valid patterns**:

// 1. All characters are uppercase.
//    - `INDIA`
// 2. All characters are lowercase.
//    - `leetcode`
// 3. Only the first character is uppercase.
//    - `Google`

// If the string follows any of these patterns, return `true`; otherwise, return `false`.

// ## **2. Approach – Using Conditions**

// The main idea is to check the first character and then use the second character to decide which pattern we need to follow.

// **Step 1: Check the first character (index 0).**

// - If it is uppercase, we need to check the second character.
// - If it is lowercase, all remaining characters must also be lowercase.

// **Step 2: If the first character is uppercase:**

// Check whether the string has more than one character:

// ```
// str.length() > 1 && Character.isUpperCase(str.charAt(1))
// ```

// Why do we use this condition?

// - `str.length() > 1` ensures that index `1` exists.
// - `Character.isUpperCase(str.charAt(1))` checks the second character.

// Based on the second character:

// - If uppercase → all remaining characters must be uppercase.
// - If lowercase → all remaining characters must be lowercase.

// **Step 3: Validate the remaining characters using loops.**

// Return `false` immediately if any character violates the selected pattern.

// ## **3. Code**

// ```

// public class DetectCapital {

//   public static boolean isValcapital(String str){

//     if(Character.isUpperCase(str.charAt(0))){

//       if(str.length()>1 && Character.isUpperCase(str.charAt(1))){

//         // All characters should be uppercase
//         for(int i=2;i<str.length();i++){
//           if(!Character.isUpperCase(str.charAt(i)))
//             return false;
//         }
//       }
//       else
//       {
//         // Remaining characters should be lowercase
//         for(int i=2;i<str.length();i++){
//           if(!Character.isLowerCase(str.charAt(i)))
//             return false;
//         }
//       }
//     }
//     else{
//       // All characters should be lowercase
//       for(int i=1;i<str.length();i++){
//         if(!Character.isLowerCase(str.charAt(i)))
//           return false;
//       }
//     }

//     return true;
//   }
// }

// ```

// ## **4. Dry Run**

// Input: `Google`

// | Index | Character | Check     |
// | ----- | --------- | --------- |
// | 0     | G         | Uppercase |
// | 1     | o         | Lowercase |
// | 2     | o         | Lowercase |
// | 3     | g         | Lowercase |
// | 4     | l         | Lowercase |
// | 5     | e         | Lowercase |

// - First character is uppercase.
// - Second character is lowercase.
// - Therefore, remaining characters must be lowercase.
// - All conditions pass.

// Output: true

// ## **5. Complexity Analysis**

// **Time Complexity: O(n)**

// - Checking the first character takes O(1).
// - Checking the second character takes O(1).
// - The loop may traverse the remaining string once, taking O(n).
// - We don't traverse the string multiple times.

// **Space Complexity: O(1)**

// - We only use a few variables and conditions.
// - No additional array, string, or data structure is created.

// ## **6. Important Learning – Pattern**

// The interesting part of this problem is how we use the first two characters to decide the behaviour of the remaining string.

// - `str.charAt(0)` → identifies the initial case.
// - `str.length() > 1` → ensures the second character exists.
// - `str.charAt(1)` → helps identify which pattern to follow.
// - Loops → validate the remaining characters.

// **One small observation:** Your code is correct for non-empty English alphabet strings, as guaranteed by the problem. For an empty string, `charAt(0)` would throw an exception, but that isn't part of the problem constraints.

// The key takeaway: Sometimes, checking just the first one or two elements helps us decide how to process the entire remaining input.