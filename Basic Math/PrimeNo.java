public class PrimeNo {
  public boolean isprime(int no) {
    if (no < 2)
      return false;
    for (int i = 2; i <= (int) Math.sqrt(no); i++) {
      System.out.println("i: "+i);
      if(no%i==0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    PrimeNo i = new PrimeNo();
    int no = 8;
    // int[] ans = new int[no];
    boolean ans = i.isprime(no);
    System.out.println("Ans: " + ans);
  }
}
