
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BasicHashing {
  public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // System.out.println("How many no u like to have: ");
    // int n=sc.nextInt();

    // int[] a=new int[n];
    // for(int i=0;i<n;i++){
    //   a[i]=sc.nextInt();
    // }
    // int[] hash=new int[n];
    // System.out.println(Arrays.toString(hash));
    // sc.close();

    int[] a={1, 5, 2, 1, 7, 5, 9};
    HashMap<Integer,Integer> map=new HashMap<>();
    // for(int i=0;i<a.length;i++){
    //   if(map.containsKey(a[i])){
    //     map.put(a[i], (map.get(a[i]))+1);
    //   }
    //   else{
    //     map.put(a[i],1);
    //   }
    // }
    // for(Integer key:map.keySet()){
    //   System.out.println("Key: "+key+" Value: "+map.get(key));
    // }
    // System.out.println("MAP: "+map);



    // Let's see wit teh for of loop and directly getting the value or setting it  a line 

    // for(int no:a){
    //   map.put(no,map.getOrDefault(no,0)+1);
    // }
    // System.out.println("MAP: "+map);


    // Let's see how we can do the char mapping 
    // with Array
    String s="mahesh";
    int sa[]=new int[26];
    for (int i=0;i<s.length();i++){
      // System.out.println(s.charAt(i)-'a');
      sa[s.charAt(i)-'a']++;
    }
    System.out.println("Array: "+Arrays.toString(sa));
    for(int i=0;i<sa.length;i++){
      char ch=(char)(i+'a');
      System.out.println("ch: "+ch+" values is a: "+sa[i]);
    }
  }
}
