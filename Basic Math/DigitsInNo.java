public class DigitsInNo{

  // Approch 1:
  // public int getDigits(int No){
  //   int digits=0;
  //   if (No==0)
  //   return 1;
  //   while(No>0){
  //     // No%10;
  //     digits+=1;
  //     No/=10;
  //   }
  //   return digits;


  // Approch 2:
    public int getDigits(int No){
    if (No==0)
    return 1;  
    return ((int)Math.log10(No))+1;

  }

  // }
  public static void main(String[] ab){
    DigitsInNo d=new DigitsInNo();
    int no=446546;
    int ans=d.getDigits(no);
    System.out.println("No of Digits in the No: "+no+" are: "+ans);
  }
}



// Understanding 
// Approch 1:
// Her simply we have just the divide the till it is zero and use the counter the count the digits and if it is 0 retrun the 1

// approch 2:
// log10 (n) method// If the digit is 11, log10 (n) gives how much power of 10 has to be increase to get the n
// 11 -> 10^1 to 10^2 ,(so all 2 digit comes in this range 10^1=10 to 10^2-1=99)
// here we will gwt 1.32 something so we add +1 to get actual digits cout


// Counting Digits Complexity:

// 1. Division Method:
// - Repeatedly divide number by 10 until it becomes 0
// - Number of steps = number of digits
// - Number of digits ≈ log10(n)
// - Time Complexity: O(log10 n)

// 2. Logarithmic Method:
// - digits = floor(log10(n)) + 1
// - Uses built-in Math.log10()
// - No loop involved
// - Time Complexity: O(1)

// Key Idea:
// log10(n) gives the order (range) of the number based on powers of 10,
// which directly relates to the number of digits.