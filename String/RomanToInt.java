
public class RomanToInt {
  // public static int RToI(String str){
  //   // if('I') return val=10;
  //   int IntVal=0;
  //   Map<Character,Integer> roman=new HashMap<>();
  //   roman.put('I', 1);
  //   roman.put('V', 5);
  //   roman.put('X', 10);
  //   roman.put('L', 50);
  //   roman.put('C', 100);
  //   roman.put('D', 500);
  //   roman.put('M', 1000);

  //   for (int i = 0; i < str.length(); i++) {
  //     System.out.println("val: "+roman.get(str.charAt(i))+" str.length()-1: "+(str.length()-1)+" i: "+i);
  //     if(i<str.length()-1 && roman.get(str.charAt(i))< roman.get(str.charAt(i+1)))
  //     IntVal-=roman.get(str.charAt(i));
  //   else
  //     IntVal+=roman.get(str.charAt(i));
  //   }
  //   return IntVal;
  // }
//   public static int getRomanInt(char  Roman){
//     int val=0;
//     switch (Roman) {
//     case 'I':
//       val=1;
//       break;

//     case 'V':
//       val=5;
//       break;

//     case 'X':
//       val=10;
//       break;

//     case 'L':
//       val=50;
//       break;

//     case 'C':
//       val=100;
//       break;

//     case 'D':
//       val=500;
//       break;

//     case 'M':
//       val=1000;
//       break;
// }
// return val;
//   }

//   // Let's see more optimal approch
//     public static int RToI(String str){
//     int IntVal=0;

//     for (int i = 0; i < str.length(); i++) {
//             if(i<str.length()-1 && getRomanInt(str.charAt(i))< getRomanInt(str.charAt(i+1)))
//       IntVal-=getRomanInt(str.charAt(i));
//     else
//       IntVal+=getRomanInt(str.charAt(i));
//     }
//     return IntVal;
//   }

// LET"S REVISE IT 
public static int getInt(char roman){
  switch (roman) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
          throw new AssertionError();
  }
}
// IX- 9, XI-11

public static int RToI(String romString){
  int ans=0;

    for(int i=0;i<romString.length();i++){
    int current=getInt(romString.charAt(i));
    // int next=getInt(romString.charAt(i+1));
    if(i<romString.length()-1 && current<getInt(romString.charAt(i+1)))
      ans-=current;
    else
      ans+=current;
    System.out.println("curre: "+current+" ans: "+ans);
  }
  return ans;
}
 
      public static void main(String[] args) {
    // String ans=Parenthesis("(()())"); //Ans: ()()
    // int ans=MaxNestedDepth("(1+(2*3)+((8)/4))+1"); //Ans: 3
    // int ans=RToI("XV"); //Ans: 15
    // int ans=RToI("LVIII"); //Ans: 58
    int ans=RToI("MCMXCIV"); //Ans: 1994
    // int ans=RToI("IX"); //9
    // int ans=RToI("XI"); //11
    System.out.println("Ans: "+ans);
  }

}



// # Roman to Integer — Pattern Notes

// ## 1. Understanding the problem

// We are given a Roman numeral string and need to convert it into an integer.

// First, we map each Roman character to its integer value:

// | Roman | Integer |
// | ----- | ------- |
// | `I`   | 1       |
// | `V`   | 5       |
// | `X`   | 10      |
// | `L`   | 50      |
// | `C`   | 100     |
// | `D`   | 500     |
// | `M`   | 1000    |

// ## 2. The logic we understood

// Your understanding is correct! We generally add the current Roman value to `ans`, but there is one important exception.

// - If the current value is less than the next value, subtract the current value.
// - Otherwise, add the current value.

// Why? Roman numerals use subtraction in cases such as `IV = 4` and `IX = 9`.

// For example, `VI = 6` because `V` comes before a smaller value, so we add both: \\(5+1=6\\).

// ## 3. Dry run: `"MCMXCIV"`

// Expected output: `1994`

// We compare the current Roman value with the next one.

// | Current    | Next              | Action       | `ans` |
// | ---------- | ----------------- | ------------ | ----- |
// | `M` = 1000 | `C` = 100         | Add 1000     | 1000  |
// | `C` = 100  | `M` = 1000        | Subtract 100 | 900   |
// | `M` = 1000 | `X` = 10          | Add 1000     | 1900  |
// | `X` = 10   | `C` = 100         | Subtract 10  | 1890  |
// | `C` = 100  | `I` = 1           | Add 100      | 1990  |
// | `I` = 1    | `V` = 5           | Subtract 1   | 1989  |
// | `V` = 5    | No next character | Add 5        | 1994  |

// Final answer: 1994.

// Notice that when the current value is smaller than the next value, we subtract it. Otherwise, we add it. The last character has no next value, so we simply add it.

// ## 4. Java approach

// ```
// public static int romanToInt(String s) {
//     int ans = 0;

//     for (int i = 0; i < s.length(); i++) {
//         int current = value(s.charAt(i));

//         if (i + 1 < s.length()
//                 && current < value(s.charAt(i + 1))) {
//             ans -= current;
//         } else {
//             ans += current;
//         }
//     }

//     return ans;
// }
// ```

// Here, `value()` represents a helper method that returns the integer value of each Roman character.

// ## 5. Pattern we learned

// Pattern: Compare current with next

// When a problem's result depends on the relationship between adjacent elements, compare the current element with the next one before deciding what action to take.

// - Current smaller than next → subtract.
// - Otherwise → add.
// - Last element → add.

// This is a single-pass, adjacent-comparison approach.

// ### Complexity

// - Time Complexity: \\(O(n)\\) — we traverse the string once.
// - Auxiliary Space Complexity: \\(O(1)\\) — we use a fixed number of variables.