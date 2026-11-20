public class LargestOddNumber {

  public static String largestOddNoString(String str){

    // this Apprach is not working for the overflow ,let's try something else, we can try double , still to big string too much hassle 
    // int largestNo=Integer.MIN_VALUE;
    // int no=0;
    // for (int i = 0; i < str.length(); i++) {
    //   int digit=str.charAt(i)-'0';
    //   no=no*10+digit;
    //   if(no%2!=0 && largestNo<no){
    //     largestNo=no;
    //   }
    //   System.out.println("no: "+no+" largest: "+largestNo+" digit: "+digit);
      
    // }
    // return largestNo==Integer.MIN_VALUE? "": String.valueOf(largestNo);


    // 
    // let's see with the another apprach to traverse from end 
    for (int i = str.length()-1; i >=0; i--) {
      int digit=str.charAt(i)-'0';
      if(digit%2!=0)
        return str.substring(0, i+1);
    }
    return "";
  }
  
    public static void main(String[] args) {
    String ans=largestOddNoString("4206")  ;//""
    // String ans=largestOddNoString("52")  ;//"5"
    // String ans=largestOddNoString("35427")  ;//"35427"
    // String ans=largestOddNoString("7542351161")  ;//"7542351161"
    System.out.println("Ans: "+ans);
  }
}




// 
// 
// 
// Largest Odd Number in a String – Notes
// 1. Understanding the Problem
// We are given a numeric string and need to find the largest odd number that can be formed from a non-empty prefix of the string.

// A number is odd if its last digit is odd (1, 3, 5, 7, 9).

// Examples:
// Input	Output	Explanation
// "4206"	""	No odd digit exists
// "52"	"5"	5 is odd
// "35427"	"35427"	Last digit is odd
// "7542351161"	"7542351161"	Last digit is odd

// 2. Approach 1 – Building the Number (Initial Approach)
// Our initial thinking was to traverse the string from left to right and construct the number digit by digit.

// Logic:
// 1. Convert each character into an integer using ASCII difference.
// 2. Build the number with each iteration.
// 3. Check whether the current number is odd.
// 4. If it is odd and greater than the previously stored odd number, update the answer.
// 5. Finally, return the largest odd number found.
// Code:
// int largestNo = Integer.MIN_VALUE;
// int no = 0;

// for (int i = 0; i < str.length(); i++) {

//     int digit = str.charAt(i) - '0';
//     no = no * 10 + digit;

//     if (no % 2 != 0 && largestNo < no) {
//         largestNo = no;
//     }
// }

// return largestNo == Integer.MIN_VALUE
//        ? ""
//        : String.valueOf(largestNo);


// Example: "35427"
// Iteration	Current number	Odd?	Largest odd
// 1	3	Yes	3
// 2	35	Yes	35
// 3	354	No	35
// 4	3542	No	35
// 5	35427	Yes	35427

// Why did we move away from this approach?

// The logic is correct for smaller numbers, but we are converting the entire string into an integer.
// - int has a limited range.
// - long also has a limited range.
// - Even using double is unnecessary and can lose integer precision.
// Since the input can be very large, constructing the actual number is not a suitable approach.
// 3. Approach 2 – Traversing from Right to Left
// Final approach
// Instead of constructing the number, we can use the property of odd numbers.

// Important observation:

// The last digit determines whether a number is odd or even.
// - If the last digit is odd, the number is odd.
// - If the last digit is even, the number is even.
// Since we need the largest odd prefix, we can start checking from the end of the string.

// Logic:
// 1. Start traversing from the last index.
// 2. Convert the current character into an integer.
// 3. Check whether the digit is odd.
// 4. If it is odd, return the substring from index 0 to i + 1.
// 5. If no odd digit is found, return an empty string.
// Why i + 1?

// Because the substring() method's ending index is exclusive.

// For example:
// str = "35427";
// i = 4;


// str.substring(0, i + 1);


// Result: "35427"
// 4. Final Code
// public class LargestOddNumber {

//     public static String largestOddNoString(String str) {

//         for (int i = str.length()-1; i >= 0; i--) {

//             int digit = str.charAt(i) - '0';

//             if (digit % 2 != 0)
//                 return str.substring(0, i+1);
//         }

//         return "";
//     }

//     public static void main(String[] args) {

//         String ans = largestOddNoString("4206");
//         // String ans = largestOddNoString("52");
//         // String ans = largestOddNoString("35427");
//         // String ans = largestOddNoString("7542351161");

//         System.out.println("Ans: " + ans);
//     }
// }


// 5. Dry Run
// Input: "7542351161"

// We traverse from right to left.
// Index	Character	Odd/Even
// 9	1	Odd

// As soon as we find the first odd digit, we return:
// str.substring(0, 9+1);


// Output: "7542351161"

// We don't need to check the remaining characters because we have already found the rightmost odd digit.
// 6. Complexity Analysis
// Time Complexity: O(n)
// - We traverse the string from right to left.
// - In the worst case, all digits are even, so we check all n characters.
// - substring() creates the returned string, taking O(k), where k is the returned prefix length.
// Overall: O(n).

// Auxiliary Space Complexity: O(1)
// - We only use the loop variable i and integer variable digit.
// - No additional data structure is used.
// - The returned substring requires O(k) space in Java.
// 7. Patterns & Learnings
// Concept	What we learned
// Character to Integer	str.charAt(i) - '0'
// Number property	Last digit determines odd/even
// Reverse Traversal	Start from str.length()-1
// Substring	substring(0, i+1) to get the required prefix
// Early Return	Once the rightmost odd digit is found, return immediately

// Most important takeaway:

// Sometimes we don't need to construct or calculate the actual number. Understanding a mathematical property of the number can help us solve the problem directly using the original string.

// Here, instead of building the number digit by digit, we simply find the rightmost odd digit and return everything before and including it.