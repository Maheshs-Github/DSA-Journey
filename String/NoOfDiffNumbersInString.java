import java.util.ArrayList;

public class NoOfDiffNumbersInString {
  public static int NoOfDiffNums(String str){
    // StringBuilder s1=new StringBuilder();
    // i tried withthe no apprach, but they are kind of too long we need the String here and why we were using the integer or double in 1st place 001 - 1 , just for that 
  //   double no=0;
  //   ArrayList<Double> a=new ArrayList<>();
  //   for (int i = 0; i < str.length(); i++) {
  //     System.out.println("for i: "+i+" char: "+str.charAt(i)+" no: "+no+" a: "+a);
  //     if(Character.isDigit(str.charAt(i))){
  //       int digit=str.charAt(i)-'0';
  //       no=no*10+digit;
  //     }
  //     else{

  //     if(i>0 && !(Character.isDigit(str.charAt(i))) && (Character.isDigit(str.charAt(i-1))) && !a.contains(no)){
  //       a.add(no);
  //       no=0;
  //     }
  //     else if(a.contains(no))
  //       no=0;
  //   }
  // }
  //   if(no>0 && !a.contains(no)){
  //       a.add(no);
  //   }
  //   return  a.size();


  // Let's see with the String 
  StringBuilder s1=new StringBuilder();
  ArrayList<String> a1=new ArrayList<>();
  for (int i = 0; i < str.length(); i++) {
      System.out.println("for i: "+i+" char: "+str.charAt(i)+" s1: "+s1+" a1: "+a1);
    if(Character.isDigit(str.charAt(i))){
      if(s1.length()<1 && str.charAt(i)=='0'){
        continue;
      }
      s1.append(str.charAt(i));

    }
    else{
    if(i>0 &&!(Character.isDigit(str.charAt(i))) && Character.isDigit(str.charAt(i-1)) && !(a1.contains(s1.toString()))){
      a1.add(s1.toString());
      s1.setLength(0);
    }
    else if(a1.contains(s1.toString()))
      s1.setLength(0);
  
  }

  }
  if(s1.length()>0 && !(a1.contains(s1.toString()))){
    a1.add(s1.toString());
  }
  return  a1.size();

  }

  public static void main(String[] args) {
    // int ans=NoOfDiffNums("a123bc34d8ef34");//3
    // int ans=NoOfDiffNums("leet1234code234");//2
    int ans=NoOfDiffNums("a1b01c001");//1

    System.out.println("Ans: "+ans);
    
  }
  
}
