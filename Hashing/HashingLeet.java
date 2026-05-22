import java.util.HashMap;

public class HashingLeet {
  public void solution(int[] a) {
    HashMap<Integer, Integer> h = new HashMap<>();

    for (int i : a) {
      h.put(i, h.getOrDefault(i, 0) + 1);
    }
    System.out.println(h);
    int maxE = 0, maxV = Integer.MIN_VALUE;
    for (int i : h.keySet()) {
      if (maxV < h.get(i)) {
        maxE = i;
        // maxV=h.get(i);
      }
    }
    System.out.println(maxE);
  }

  public static void main(String[] args) {
    HashingLeet h = new HashingLeet();
    int[] a={1,2,4};
    int k=5;
    h.solution(a);
  }

}

// the question is this
// The frequency of an element is the number of times it occurs in an array.

// You are given an integer array nums and an integer k. In one operation, you
// can choose an index of nums and increment the element at that index by 1.

// Return the maximum possible frequency of an element after performing at most
// k operations.

// Example 1:

// Input: nums = [1,2,4], k = 5
// Output: 3
// Explanation: Increment the first element three times and the second element
// two times to make nums = [4,4,4].
// 4 has a frequency of 3.


// WILL SOLVE IT LATER NOT EASY TO OLSVE IT NOW