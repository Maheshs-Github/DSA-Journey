public class SquareRoot {
  public static int getRoot(int no) {
    // directly with the Math.sqrt
    // return (int) (Math.sqrt(no));

    // Let's see how we can do with brute force approach
    // for (int i = 0; i < no; i++) {
    // if(i*i==no)
    // return i;
    // if((i-1)*(i-1)<no && (i*i)>no)
    // return i-1;
    // }
    // return -1;

    // let's see with teh BS
    return resAns(1, no, no);
  }

  public static int resAns(int lb, int ub, int no) {
    System.out.println("Before: lb: " + lb + " ub: " + ub);
    if (lb >= ub)
      return lb - 1;
    int mid = Math.floorDiv(lb + ub, 2);
    System.out.println("lb: " + lb + " ub: " + ub + " mid: " + mid);
    if ((mid * mid) > no)
      // return resAns(lb, mid, no);
      return resAns(lb, mid, no);
    else
      return resAns(mid + 1, ub, no);
  }

  public static void main(String[] args) {
    // int ans=getRoot(36); //6
    int ans = getRoot(28); // 6
    System.out.println("Ans: " + ans);
  }
}
