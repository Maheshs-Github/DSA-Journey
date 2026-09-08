
public class NthRoot {
  public static int getRoot(int power,int no) {
    // with Brute force
    // for (int i = 1; i < no; i++) {
    //   int Ans=(int) Math.pow(i, power);
    //   System.out.println("Ans: "+Ans+" No: "+no);
    //   if(Ans==no)
    //     return i;
    //   if(Ans>no)
    //     break;
    // }
    //   return -1;

    //with the BS
    return nRoot(power,1,no,no);
  }
  public static int nRoot(int power,int lb,int ub,int no){
    if(lb>=ub)
      return -1;
    int mid=Math.floorDiv(lb+ub, 2);
    int Ans=(int)(Math.pow(mid, power));
    if(Ans==no)
      return mid;
    if(Ans>no)
      return nRoot(power, lb, mid, no);
    else
      return nRoot(power, mid+1, ub, no);
  }
    public static void main(String[] args) {
    // int ans=getRoot(2,36); //6 i.e 6^2=36
    // int ans = getRoot(3,27); // 3 i.e 3^3=27
    int ans = getRoot(4,69); // -1
    System.out.println("Ans: " + ans);
  }
}