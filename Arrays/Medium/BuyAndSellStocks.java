package Medium;

public class BuyAndSellStocks {
  public static void Buysell(int[] a){
    // int minBuy=Integer.MAX_VALUE, maxSell=Integer.MIN_VALUE,buyInd=0,sellInd=0;
    // for (int i = 0; i < a.length; i++) {
    //   if(a[i]<minBuy){
    //     buyInd=i;
    //     minBuy=a[i];
    //     System.out.println("buyInd: "+buyInd);
    //     if(minBuy-a[i]>maxSell && buyInd<=sellInd)
    //       sellInd=i;
    //       maxSell=a[i];
    //   }
    // System.out.println("minBuy: "+minBuy+" maxSell: "+maxSell+" profit: "+(maxSell-minBuy));
    int maxProfit=0,minBuy=Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if(minBuy>a[i])
        minBuy=a[i];
      if(maxProfit<a[i]-minBuy)
        maxProfit=a[i]-minBuy;
    }
    System.out.println("Profilt: "+maxProfit);

    // }
    // System.out.println("minBuy: "+" maxSell: "+maxSell);
  }
  
  public static void main(String[] args) {
    // int[] a={7,1,5,3,6,4};
    int[] a={3,2,6,5,0,3};
    // minBuy: 1 maxSell: 7 profit: 6
    Buysell(a);
  }
  
}
