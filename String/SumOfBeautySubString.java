import java.util.HashMap;
import java.util.Map;

public class SumOfBeautySubString {
  public static int beauty(String str,int index){
    Map<Character,Integer> freq=new HashMap<>();
    int minFreq=Integer.MAX_VALUE,maxFreq=Integer.MIN_VALUE,beautyAns=0;
    char minChar=' ',maxChar=' ';
    while(index<str.length()){
      char ch=str.charAt(index);
        freq.put(ch,freq.getOrDefault(ch, 0)+1);

        // if(minFreq>freq.get(ch)){
        //   minFreq=freq.get(ch);
        //   minChar=freq.get(minFreq);
        // }
        // if(maxFreq<freq.get(ch)){
        //   maxFreq=freq.get(ch);
        //   maxChar=ch;
        // }

for (int value : freq.values()) {
    maxFreq = Math.max(maxFreq, value);
    minFreq = Math.min(minFreq, value);
}
        // int minAns=freq.
      if(maxFreq-minFreq>=1)
        beautyAns++;
      System.out.println("ch: "+ch);
      System.out.println("minFreq: "+minFreq+" maxFreq: "+maxFreq);
      index++;
    }
    return beautyAns;
  }
  public static int beautyString(String str){
    int finalANs=0;
    for (int i = 0; i < str.length(); i++) {
      System.out.println("For i: "+i);
      int ans=beauty(str, i);
      System.out.println("ans: "+ans);
      finalANs+=ans;
    }
    return finalANs;

  }
    public static void main(String[] args) {
    int ans=beautyString("aabcb"); //Ans: ()()
    System.out.println("Ans: "+ans);
  }
}