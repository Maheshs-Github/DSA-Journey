import java.util.HashMap;
import java.util.Map;

public class SumOfBeautySubString {
  public static int beauty(String str,int index){
    Map<Character,Integer> freq=new HashMap<>();
    int minFreq=Integer.MAX_VALUE,maxFreq=Integer.MIN_VALUE,beautyAns=0;
    // char minChar=' ',maxChar=' ';
    while(index<str.length()){
      char ch=str.charAt(index);
        freq.put(ch,freq.getOrDefault(ch, 0)+1);

        // if(minFreq>freq.get(ch)){
        //   minFreq=freq.get(ch);
        //   minChar=ch;
        // }
        // if(maxFreq<freq.get(ch)){
        //   maxFreq=freq.get(ch);
        //   maxChar=ch;
        // }
    minFreq=Integer.MAX_VALUE;
    maxFreq=Integer.MIN_VALUE;

for (int value : freq.values()) {
    maxFreq = Math.max(maxFreq, value);
    minFreq = Math.min(minFreq, value);
  }
  beautyAns+=maxFreq-minFreq;
        // int minAns=freq.
      // if(maxFreq-minFreq>=1)
      //   beautyAns++;
      System.out.println("ch: "+ch+" beautyAns: "+beautyAns);
      System.out.println("minFreq: "+minFreq+" maxFreq: "+maxFreq);
      index++;
    }
    return beautyAns;
  }
  public static int beautyString(String str){
    int finalANs=0;
    for (int i = 0; i < str.length(); i++) {
      System.out.println("For i: "+i);
      int ans=beauty(str, i);
      System.out.println("ans: "+ans);
      finalANs+=ans;
    }
    return finalANs;

  }
    public static void main(String[] args) {
    // int ans=beautyString("aabcb"); //Ans: 5
    int ans=beautyString("aabcbaa"); //Ans: 
    System.out.println("Ans: "+ans);
  }
}



// 
// 
// Patterns and Understading from the Problem 
// Yes. This problem gives us a **very useful String/HashMap pattern**.

// ## Pattern 1: Maintain frequency while building substrings

// When you're generating substrings starting from some `i`:

// ```java
// Map<Character, Integer> freq = new HashMap<>();

// for (int j = i; j < str.length(); j++) {
//     char ch = str.charAt(j);
//     freq.put(ch, freq.getOrDefault(ch, 0) + 1);
// }
// ```

// The important idea is:

// > **Don't recount the whole substring every time. Update the frequency of only the newly added character.**

// So:

// ```text
// add character
//      ↓
// freq[ch]++
// ```

// This pattern appears **a lot** in String problems.

// ---

// ## Pattern 2: Find min/max from frequencies

// Once you have:

// ```text
// a → 3
// b → 2
// c → 1
// ```

// you can find min/max by iterating over the **frequency values**:

// ```java
// int min = Integer.MAX_VALUE;
// int max = Integer.MIN_VALUE;

// for (int value : freq.values()) {
//     min = Math.min(min, value);
//     max = Math.max(max, value);
// }
// ```

// Notice something important:

// You're **not looking at the characters** here.

// You're looking at:

// ```text
// 3, 2, 1
// ```

// and finding:

// ```text
// min = 1
// max = 3
// ```

// ---

// ## Pattern 3: Reset derived information

// This is something you just learned from this problem.

// `freq` belongs to the **current growing substring**, so you keep updating it.

// But:

// ```java
// minFreq
// maxFreq
// ```

// describe the **current state of the frequency map**, so you recalculate them whenever the substring changes.

// ```text
// new substring
//      ↓
// freq updated
//      ↓
// reset min/max
//      ↓
// scan freq
//      ↓
// current min/max
// ```

// ---

// ## The bigger DSA pattern

// You can remember this as:

// > **Frequency Map + Running/Incremental Update + Aggregate over Frequencies**

// You'll see variations of this in problems involving:

// - Most frequent character
// - Least frequent character
// - Anagrams
// - Character counts
// - Permutations
// - Substrings with frequency conditions
// - Sliding window problems
// - "At most K distinct characters"
// - "Exactly K distinct characters"

// And the key mental model is:

// ```text
// String
//   ↓
// Characters
//   ↓
// Frequency table
//   ↓
// Analyze frequencies
//   ↓
// min / max / count / condition
// ```

// That's a **very important String pattern** to keep from this problem.




// 
// 
// 
// 
// Solving Pattern of the Example 

// Yes. Let's summarize the **problem pattern + our approach** from start to finish.

// ## 1. What was the problem?

// We were given a string and had to find the **sum of beauty of every substring**.

// For one substring:

// > **Beauty = difference between the frequency of the most frequent character and the least frequent character.**

// The important part: **least frequent means among characters that actually exist in the substring.**

// ---

// ## 2. What did we need to generate?

// We needed **every substring**.

// For:

// ```text
// "aabc"
// ```

// Starting from index `0`:

// ```text
// a
// aa
// aab
// aabc
// ```

// Then start from index `1`:

// ```text
// a
// ab
// abc
// ```

// And so on.

// This gives the usual substring pattern:

// ```text
// for (int i = 0; i < n; i++) {
//     for (int j = i; j < n; j++) {
//         // current substring: i → j
//     }
// }
// ```

// ---

// ## 3. Instead of creating every substring, we maintained frequency

// This was the important optimization.

// Suppose we're starting from `i = 0`:

// ```text
// aabc
// ```

// Initially:

// ```text
// freq = {}
// ```

// Add `a`:

// ```text
// "a"

// a → 1
// ```

// Add next `a`:

// ```text
// "aa"

// a → 2
// ```

// Add `b`:

// ```text
// "aab"

// a → 2
// b → 1
// ```

// Add `c`:

// ```text
// "aabc"

// a → 2
// b → 1
// c → 1
// ```

// So instead of recounting the entire substring every time, we simply update:

// ```java
// freq.put(ch, freq.getOrDefault(ch, 0) + 1);
// ```

// ---

// ## 4. For every substring, find current min and max

// For `"aab"`:

// ```text
// a → 2
// b → 1
// ```

// We scan the frequencies:

// ```text
// 2, 1
// ```

// So:

// ```text
// max = 2
// min = 1
// ```

// Beauty:

// ```text
// 2 - 1 = 1
// ```

// For `"aa"`:

// ```text
// a → 2
// ```

// Only one character exists, so:

// ```text
// max = 2
// min = 2
// beauty = 0
// ```

// This is why we **reset min/max for every new substring**.

// ---

// ## 5. Add the beauty to the answer

// This was another thing we initially misunderstood.

// We don't ask:

// ```text
// "Does this substring have beauty?"
// ```

// We ask:

// ```text
// "What is this substring's beauty?"
// ```

// So:

// ```java
// beautyAns += maxFreq - minFreq;
// ```

// ---

// ## Complete pattern

// ```text
// Start position i
//       ↓
// Create frequency map
//       ↓
// Extend substring one character at a time
//       ↓
// Update frequency of new character
//       ↓
// Reset min/max
//       ↓
// Scan current frequencies
//       ↓
// Find min + max
//       ↓
// Calculate current beauty
//       ↓
// Add to total answer
//       ↓
// Extend substring again
// ```

// ### Example: `"aabc"`

// ```text
// substring     frequencies       beauty
// ------------------------------------------------
// "a"            a:1                0
// "aa"           a:2                0
// "aab"          a:2,b:1            1
// "aabc"         a:2,b:1,c:1        1
// ```

// So for this starting position:

// ```text
// 0 + 0 + 1 + 1 = 2
// ```

// Then we repeat the same process starting from index `1`, `2`, etc.

// ---

// ### The main DSA patterns we learned

// **1. Generate substrings:**  
// `i` = starting point, `j` = extending point.

// **2. Frequency tracking:**  
// Use `HashMap` or `int[26]`.

// **3. Incremental update:**  
// Only update the newly added character.

// **4. Aggregate frequency information:**  
// From frequencies, find min/max.

// **5. Reset derived values:**  
// Min/max must represent the **current substring**, so recalculate them.

// **6. Accumulate the result:**  
// Add each substring's actual beauty to the final answer.

// That combination is the real pattern worth remembering—not the specific `"aabcbaa"` example.