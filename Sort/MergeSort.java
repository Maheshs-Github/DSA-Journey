import java.util.Arrays;
public class MergeSort{
  // int[] a;
  // // int lb;
  // // int ub;

  // public MergeSort(int[] a){
  //   this.a=a;
  //   // this.lb=lb;
  //   // this.ub=ub;


  // }

  public void MergeS(int[] a,int lb,int ub){
    if(lb<ub)
    {
      int mid=(lb+ub)/2;
      MergeS(a,lb,mid);
      MergeS(a,mid+1,ub);
      Merge(a,lb,mid,ub);
    }
  }
  public void Merge(int[] a,int lb, int mid,int ub){
    int i=lb;
    int j=mid+1;
    int[] b = new int[20];
    int k=0;

    while(i<=mid && j<=ub){
      if(a[i]<a[j]){
        b[k++]=a[i++];
      }
      else{
        b[k++]=a[j++];
      }
    }
    while(i<=mid){
      b[k++]=a[i++];
    }
    while(j<=ub)
    {
      b[k++]=a[j++];
    }
    for(i=lb,k=0;i<=ub;k++,i++)
    {
    a[i]=b[k];
    }
  }

  public static void main(String[] ab){
    int[] a={15,5,24,8,1,3,16,10,20};
    MergeSort m=new MergeSort();

    m.MergeS(a,0,a.length-1);

        System.out.println(Arrays.toString(a));

  }
}