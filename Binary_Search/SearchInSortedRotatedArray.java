public class SearchInSortedRotatedArray {
  public static int sortedRotated(int[] a,int key){
    return rotatedAns(a,0,a.length-1,key);
  }
  // public static int rotatedAns(int[] a,int lb,int ub,int key){
  //   if(lb>ub)
  //     return -1;
  //   int mid=Math.floorDiv(lb+ub, 2);
  //   System.out.println("a[lb]: "+a[lb]+" a[ub]: "+a[ub]+" a[mid]: "+a[mid]);
  //   if(a[mid]==key) return mid;
  //   if(a[lb]<=a[mid] )
  //   {
  //     if(key<a[mid] && key>=a[lb])
  //     return rotatedAns(a,lb,mid-1,key);
  //   else
  //     return rotatedAns(a,mid+1,ub,key);
  //   }
  //   else{
  //     if(key>a[mid] && key<a[lb])
  //     return rotatedAns(a,mid+1,ub,key);
  //     else
  //     return rotatedAns(a,lb,mid-1,key);
  //   }
  //   }
  
  public static int rotatedAns(int[] a,int lb,int ub,int key){
    if(lb>ub)
      return -1;
    int mid=Math.floorDiv(lb+ub,2);
    System.out.println("a[lb]: "+a[lb]+" a[ub]: "+a[ub]+" a[mid]: "+a[mid]);
    if(a[mid]==key) return mid;
    if(a[lb]<=a[mid]){
      if(a[mid]>key && a[lb]<=key)
       return rotatedAns(a, lb, mid, key);
      else
       return rotatedAns(a, mid+1, ub, key);
    }
    else{
      if(key>a[mid] && key<=a[ub])
       return rotatedAns(a, mid+1, ub, key);
      else
       return rotatedAns(a, lb, mid, key);
    }
  }

//   a[lb]: 4 a[ub]: 2 a[mid]: 7
// a[lb]: 0 a[ub]: 2 a[mid]: 1
// a[lb]: 2 a[ub]: 2 a[mid]: 2
// a[lb]: 2 a[ub]: 2 a[mid]: 2
  

  public static void main(String[] args) {
    // int ans=sortedRotated(new int[] {4 ,5 ,6 ,7 ,0 ,1 ,2}, 0); //4
    int ans=sortedRotated(new int[] {4 ,5 ,6 ,7 ,0 ,1 ,2}, 3); //4
    // int ans=sortedRotated(new int[] {5,1,3}, 5); //0
    System.out.println("ans: "+ans);
  }
  
}
