import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
  // public void triangle(int n){
  public List<List<Integer>> triangle(int n){

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
  //   ArrayList<Integer> aP=new ArrayList<>();
  //   aP.add(1);
  //   System.out.println(aP);
  //   for (int i = 1; i <=n; i++) {
  //     ArrayList<Integer> aN=new ArrayList<>();
  //     aN.add(1);
  //     for (int j = 0; j <aP.size()-1; j++) {
  //       aN.add(aP.get(j)+aP.get(j+1));
  //     }
  //     aN.add(1);
  //     // aP.addAll(aN);
  //     System.out.println(""+aN);
  //     aP=aN;
  //   }
  // }


  // 
  // okay let me do the pascale traingle with 2 arrays (revision)
  List<List<Integer>> ans=new ArrayList<>();
  ArrayList<Integer> previous=new ArrayList<>();
  previous.add(1);
    ans.add(previous);
  // System.out.println(previous);
  for (int i = 0; i <n; i++) {
    ArrayList<Integer> current=new ArrayList<>();
    current.add(1);
    for (int j = 0; j < previous.size()-1; j++) {                                                                                                                                                                
      current.add(previous.get(j)+ previous.get(j+1));
    }
    current.add(1);
    // System.out.println(current);
    ans.add(current);
    previous=current;          
    // return ans;
    System.out.println(ans);
  }
  return ans;
}

      public int fact(int no){
      if(no==0)
        return 1;
      return no * fact(no-1);
    }

  public static void main(String[] args) {
    PascalTraingle p=new PascalTraingle();
    p.triangle(5);
  }
}