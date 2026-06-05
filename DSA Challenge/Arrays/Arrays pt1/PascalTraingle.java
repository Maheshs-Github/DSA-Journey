import java.util.ArrayList;

public class PascalTraingle {
  public void triangle(int n){

    // wrong approch
    // int n1=0,n2=n-1;
    // int n1Val=1,n2Val=1;
    // int ans[]=new int[n];
    // while(n1<n2){
    //   ans[n1]=n1Val;
    //   ans[n2]=n2Val;
    // }

    // let's see with the ncr  apprch (factorial )

    // for (int i = 0; i <=n; i++) {
    //   for (int j = 0; j <= i; j++) {
    //     int ans= fact(i)/(fact(j)*(fact(i-j)));
    //     System.out.print(ans+" ");
    //   }
    //   System.out.println();
      
    // }
    // System.out.println("Ans: "+fact(5));


    // let's see with the apprach where we use the prevoius value to get new and add 1, 1 at both end 
    ArrayList<Integer> aP=new ArrayList<>();
    ArrayList<Integer> aN=new ArrayList<>();
    for (int i = 0; i <=n; i++) {
      // int[] prevA=new int[]
      if(i==0)
      {
        aP.add(1);
        continue;
      }
      aN.addFirst(1);
      for (int j = 0; j <i+1; j++) {
        aN.add(j+1, aP.get(j)+aP.get(j+1));
      }
      aN.addLast(1);
      aP.addAll(aN);
      System.out.print(" "+aP);
    }
  }
    //   public int fact(int no){
    //   if(no==0)
    //     return 1;
    //   return no * fact(no-1);
    // }

  public static void main(String[] args) {
    PascalTraingle p=new PascalTraingle();
    p.triangle(5);
  }
}