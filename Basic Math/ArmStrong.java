public class ArmStrong {
  public boolean isArmStrong(int no){
    int digits=((int) Math.log10(no))+1;
    System.out.println("Digit: "+ String.valueOf(no).length());
    int ans=0;
    int no1=no;
    while(no>0){
      int rem=no%10;
      ans+=(int)Math.pow(rem, digits);
      no/=10;
    }
    if(no1==ans)
      return true;
    else
      return false;
  }
  public static void main(String[] args) {
    ArmStrong i = new ArmStrong();
    // int no1 = 3, no2 = 9;
    // int no = 153;
    // int no=371;
    int no=12;
    boolean ans = i.isArmStrong(no);
    System.out.println("Ans: " + ans);
  }
}
