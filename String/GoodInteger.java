public class GoodInteger {

  public static String goodInt(String str){
    int ans=Integer.MIN_VALUE;
    StringBuilder finalAns=new StringBuilder("");
    for (int i = 1; i < str.length()-1; i++) {
      if(str.length()>=3 && str.charAt(i)==str.charAt(i-1) && str.charAt(i)==str.charAt(i+1)){
        int digit= str.charAt(i)-'0';
        if(digit>ans){
          ans=digit;
          finalAns.setLength(0);
          for (int j = 0; j < 3; j++) {
            finalAns.append(digit);
          }
        }
      }
    
    }
    return finalAns.toString();
    
  }
  public static void main(String[] args) {
    String ans=goodInt("6777133339")  ;//777
    // String ans=goodInt("2300019");//000
    System.out.println("Ans: "+ans);
  }

  
}




// 
// 
// 
// # **Largest Good Integer – Notes**

// ## **1. Understanding the Problem**

// We are given a numeric string. We need to find the **largest good integer**.

// A good integer is a number consisting of exactly **3 consecutive identical digits**.

// For example:

// - `"777"` → Good integer.
// - `"333"` → Good integer.
// - `"77"` → Not a good integer.
// - `"778"` → Not a good integer.

// If multiple good integers exist, return the largest one. If none exists, return an empty string `""`.

// Example:

// `"6777133339"` → `"777"`

// ## **2. Approach – Sliding Window of Size 3**

// Our idea is simple: check every group of 3 consecutive characters.

// We start the loop from index `1` because we need:

// - Previous character → `i-1`
// - Current character → `i`
// - Next character → `i+1`

// ```
// for (int i = 1; i < str.length()-1; i++)
// ```

// **Step 1: Check consecutive characters**

// ```
// str.charAt(i) == str.charAt(i-1) &&
// str.charAt(i) == str.charAt(i+1)
// ```

// If all three characters are equal, we found a good integer.

// **Step 2: Convert character into integer**

// ```
// int digit = str.charAt(i) - '0';
// ```

// We use ASCII values to convert a numeric character into its integer value.

// For example:

// `'7' - '0' = 55 - 48 = 7`

// **Step 3: Find the largest digit**

// Compare the current digit with the previously stored `ans`.

// ```
// if(digit > ans)
// ```

// If it is larger, update the answer.

// **Step 4: Build the result using StringBuilder**

// First, clear the previous answer:

// ```
// finalAns.setLength(0);
// ```

// Then append the digit 3 times:

// ```
// for(int j = 0; j < 3; j++){
//     finalAns.append(digit);
// }
// ```

// ## **3. Code**

// ```
// public static String goodInt(String str) {
//     int ans = Integer.MIN_VALUE;
//     StringBuilder finalAns = new StringBuilder("");

//     for (int i = 1; i < str.length()-1; i++) {

//         if (str.charAt(i) == str.charAt(i-1) &&
//             str.charAt(i) == str.charAt(i+1)) {

//             int digit = str.charAt(i) - '0';

//             if (digit > ans) {
//                 ans = digit;

//                 finalAns.setLength(0);

//                 for (int j = 0; j < 3; j++) {
//                     finalAns.append(digit);
//                 }
//             }
//         }
//     }

//     return finalAns.toString();
// }
// ```

// ## **4. Complexity Analysis**

// **Time Complexity: O(n)**

// - Loop traverses the string once → O(n).
// - Character comparisons → O(1).
// - Character-to-integer conversion → O(1).
// - `setLength(0)` → O(1).
// - Appending 3 digits → O(1).

// Overall: **O(n)**.

// **Space Complexity: O(1)**

// - `StringBuilder` stores at most 3 characters.
// - `ans` and `digit` are integer variables.
// - No additional data structure is used.

// ## **5. Important Patterns Learned**

// 1. **Sliding Window (Size 3):** Checking three consecutive characters using `i-1`, `i`, and `i+1`.
// 2. **Character to Integer:** Using ASCII difference `str.charAt(i) - '0'`.
// 3. **StringBuilder:** Using `setLength(0)` to clear the previous result and `append()` to construct a new result.

// **Key takeaway:** Whenever a problem asks you to check consecutive elements of a fixed size, think about using a sliding window.

// For this problem, our window size is 3.