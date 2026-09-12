public class KokoEatingBananas {
  // WITH BRUTE FORCE APPROACH
  // public static int getAns(int[] a,int h){
  //   //let's find the max
  //   int Max=Integer.MIN_VALUE;
  //   for (int i = 0; i < a.length; i++) {
  //     if(a[i]>Max)
  //       Max=a[i];
  //   }
  //   for (int i = 1;i<=Max; i++) {
  //     int finalH=0;
  //     for (int j = 0; j <a.length; j++) {
  //       finalH+= Math.ceilDiv(a[j], i);
  //       System.out.println("finalH: "+finalH+" for i: "+i);
  //       if(finalH>h)
  //         break;
  //       }
  //       if(finalH<=h)
  //         return i;
  //     }
  //     return -1;
  // }

  // with BS
  public static int getAns(int[] a,int h){
        //let's find the max
    int Max=Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if(a[i]>Max)
        Max=a[i];
    }
    return kokoAns(a,1,Max,h);
  }
  public static int kokoAns(int[] a,int lb, int ub,int h){
    if(lb>ub)
      return lb;
    int mid=Math.floorDiv(lb+ub,2);
    int finalH=0;
          for (int j = 0; j <a.length; j++) {
        finalH+= Math.ceilDiv(a[j], mid);
        System.out.println("finalH: "+finalH+" for mid: "+mid);
        }
        if(finalH>h)
          return kokoAns(a, mid+1,ub, h);
          else
            return kokoAns(a, lb,mid, h);

  }
  public static void main(String[] args) {
    int Ans=getAns(new int[]{3, 6, 7, 11},8);
    System.out.println("Ans: "+Ans);
  }
  
}
