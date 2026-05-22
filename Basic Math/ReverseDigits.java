public class ReverseDigits {

  public int revNo(int No) {
    int ans = 0;

    System.out.println("No: " + No);

    int bits = (int) (Math.log(Math.abs(No)) / Math.log(2)) + 1;
    System.out.println("bits: " + bits);
    // if(No>=0)
    // {
    // while (No >0){
    // int remainder=No%10;
    // ans=10*ans+remainder;
    // No/=10;
    // }
    // }

    // while (No <0){
    // int remainder=No%10;
    // System.out.println("rema: "+remainder);
    // ans=10*ans+remainder;
    // No/=10;
    // }
    System.out.println("Integer.MAX_VALUE: "+Integer.MAX_VALUE);

    while (No != 0) {
      int remainder = No % 10;
      if (ans > Integer.MAX_VALUE / 10 ||
          (ans == Integer.MAX_VALUE / 10 && remainder > 7))
        return 0;

      if (ans < Integer.MIN_VALUE / 10 ||
          (ans == Integer.MIN_VALUE / 10 && remainder < -8))
        return 0;
      // System.out.println("rema: " + remainder);
      ans = 10 * ans + remainder;
      // System.out.println("ans: " + ans);
      No /= 10;
    }
    return ans;
  }

  public static void main(String[] ab) {
    ReverseDigits d = new ReverseDigits();
    int no = 214748364;
    int ans = d.revNo(no);
    System.out.println("Revsre of  the No: " + no + " is: " + ans);
  }
}

// the simple question was iot to reverse the no
// but leetcode problem needs to be work on -ve no, alos only on 32 bit no