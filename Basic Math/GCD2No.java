public class GCD2No {

  // public int commonGCD(int no1, int no2) {
  //   int ans = 0;

  //   int termination = no1 < no2 ? no1 : no2;

  //   // Approch 1:
  //   // for(int i=1;i<=termination;i++){
  //   // System.out.println(i);
  //   // if(no1%i==0 && (no2%i==0))
  //   // ans=i;
  //   // }

  //   // Approch 2:
  //   for (int i = termination; i > 0; i--) {
  //     System.out.println(i);
  //     if (no1 % i == 0 && (no2 % i == 0)) {
  //       ans = i;
  //       break;
  //     }

  //   }
  //   return ans;
  // }


  // Actual most optimal is eucidian approch , it subtract the greatest no by smallest till nothing one of them becomes 0 and other non zero is the ans 

  // public int commonGCD(int no1,int no2){
  //   int ans=0;
  //   while(no1>0 && no2>0){
  //     System.out.println("no1: "+no1+" no2: "+no2);
  //     if(no1>=no2){
  //       no1-=no2;
  //     }
  //     else{
  //       no2-=no1;
  //     }
  //     // System.out.println("Aft  no1: "+no1+" no2: "+no2);
  //     if (no1==0)  
  //       ans= no2;
  //      else
  //       ans= no1;
  //   }
  //   return ans;
  // }


  // /Subtraction is kinda lenght we can go with the modulo and better pratices 
    public int commonGCD(int no1,int no2){
    // int ans=0;
    while(no1>0 && no2>0){
      System.out.println("no1: "+no1+" no2: "+no2);
      if(no1>=no2){ 
        no1%=no2;
      }
      else{
        no2%=no1;
      }
    }
          if (no1==0)
        return no2;
       else
        return no1;
  }



  public static void main(String[] ab) {
    GCD2No i = new GCD2No();
    // int no1 = 3, no2 = 9;
    int no1 = 15, no2 = 20;
    int ans = i.commonGCD(no1, no2);
    System.out.println("Ans: " + ans);
  }
}

// IN Approch 1:
// We went from 1 to Min of n1 and n2 , we have to get the greatest common
// divisor then would it not be convinenet to go from the last to 1 , that way
// we can get grester no early , well worst case complexity might be the same i
// g
