
public class RomanToInt {
  // public static int RToI(String str){
  //   // if('I') return val=10;
  //   int IntVal=0;
  //   Map<Character,Integer> roman=new HashMap<>();
  //   roman.put('I', 1);
  //   roman.put('V', 5);
  //   roman.put('X', 10);
  //   roman.put('L', 50);
  //   roman.put('C', 100);
  //   roman.put('D', 500);
  //   roman.put('M', 1000);

  //   for (int i = 0; i < str.length(); i++) {
  //     System.out.println("val: "+roman.get(str.charAt(i))+" str.length()-1: "+(str.length()-1)+" i: "+i);
  //     if(i<str.length()-1 && roman.get(str.charAt(i))< roman.get(str.charAt(i+1)))
  //     IntVal-=roman.get(str.charAt(i));
  //   else
  //     IntVal+=roman.get(str.charAt(i));
  //   }
  //   return IntVal;
  // }
//   public static int getRomanInt(char  Roman){
//     int val=0;
//     switch (Roman) {
//     case 'I':
//       val=1;
//       break;

//     case 'V':
//       val=5;
//       break;

//     case 'X':
//       val=10;
//       break;

//     case 'L':
//       val=50;
//       break;

//     case 'C':
//       val=100;
//       break;

//     case 'D':
//       val=500;
//       break;

//     case 'M':
//       val=1000;
//       break;
// }
// return val;
//   }

//   // Let's see more optimal approch
//     public static int RToI(String str){
//     int IntVal=0;

//     for (int i = 0; i < str.length(); i++) {
//             if(i<str.length()-1 && getRomanInt(str.charAt(i))< getRomanInt(str.charAt(i+1)))
//       IntVal-=getRomanInt(str.charAt(i));
//     else
//       IntVal+=getRomanInt(str.charAt(i));
//     }
//     return IntVal;
//   }

// LET"S REVISE IT 
public static int getInt(char roman){
  switch (roman) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
          throw new AssertionError();
  }
}
// IX- 9, XI-11

public static int RToI(String romString){
  int ans=0;
  // for(int i=0;i<romString.length();i++){
  //   int current=getInt(romString.charAt(i));
  //   // int prev=getInt(romString.charAt(i-1));
  //   if(i>1 && getInt(romString.charAt(i-1))<current)
  //     ans-=current;
  //   else
  //     ans+=current;
  //   System.out.println("curre: "+current+" ans: "+ans);
  // }

    for(int i=0;i<romString.length();i++){
    int current=getInt(romString.charAt(i));
    // int next=getInt(romString.charAt(i+1));
    if(i<romString.length()-1 && current<getInt(romString.charAt(i+1)))
      ans-=current;
    else
      ans+=current;
    System.out.println("curre: "+current+" ans: "+ans);
  }
  return ans;
}
 
      public static void main(String[] args) {
    // String ans=Parenthesis("(()())"); //Ans: ()()
    // int ans=MaxNestedDepth("(1+(2*3)+((8)/4))+1"); //Ans: 3
    // int ans=RToI("XV"); //Ans: 15
    // int ans=RToI("LVIII"); //Ans: 58
    int ans=RToI("MCMXCIV"); //Ans: 1994
    // int ans=RToI("IX"); //9
    // int ans=RToI("XI"); //11
    System.out.println("Ans: "+ans);
  }

}
