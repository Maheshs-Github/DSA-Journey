
public class PrintNTimes {
  // public void printNTimesMethod(String s,int n){
  public String printNTimesMethod(String s,int n){
      // System.out.println("s: "+s+" n: "+n);

    if(n==0) return "";
      // System.out.println("s: "+s+" n: "+n);
      String ans=printNTimesMethod(s, n-1);
      // System.out.println("String: "+s+" n: "+n);
      return ans+"\n s: "+s+" n: "+n;
    // }
  }
  public static void main(String[] args) {
    PrintNTimes p=new PrintNTimes();
    String s="Rimaru Tempest";
    // String ans=p.printNTimesMethod(s,10);
    // p.printNTimesMethod(s,5);
    String ans= p.printNTimesMethod(s,5);

    System.out.println("Ans: "+ans);
  }
}


// Let's see what will happen if print before calling well values will be printed first then fun call so sequesnce will be from 5,4,3,2,1

// let's return it 