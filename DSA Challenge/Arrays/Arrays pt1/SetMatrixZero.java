import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

  // brute force apprach with it we are checking the positions of the 0's and
  // acoordingly we are calculating the where to put the zros (not in place)

  // public void mZero(int[][] a) {
  // int[] zeroPos = new int[2];
  // // ArrayList<Integer> ai = new ArrayList<>();
  // // ArrayList<Integer> aj = new ArrayList<>();
  // boolean[] row=new boolean[a.length];
  // boolean[] col=new boolean[a[0].length];
  // for (int i = 0; i < a.length; i++) {
  // for (int j = 0; j < a[i].length; j++) {

  // // System.out.println("i: "+i+" j: "+j+" a[i][j]: "+a[i][j]);
  // // if (a[i][j] == 0) {
  // // ai.add(i);
  // // aj.add(j);
  // // }
  // if(a[i][j]==0){
  // row[i]=true;
  // col[j]=true;
  // }
  // }
  // }
  // // System.out.println(ai);
  // // System.out.println(aj);

  // for (int i = 0; i < a.length; i++) {
  // for (int j = 0; j < a[i].length; j++) {
  // // if (ai.contains(i)) {
  // // a[i][j] = 0;
  // // }
  // // if(aj.contains(j))
  // // a[i][j]=0;

  // // if(ai.contains(i) || aj.contains(j))
  // // a[i][j]=0;

  // if(row[i]==true || col[j]==true)
  // a[i][j]=0;

  // }
  // }

  // for (boolean a2 : row) {
  // System.out.print(" " + a2);

  // }
  // System.out.println();
  // for (boolean a2 : col) {
  // System.out.print(" " + a2);

  // }
  // System.out.println();

  // System.out.println("Ans: ");
  // for (int[] a2 : a) {
  // System.out.print(" " + Arrays.toString(a2));
  // }
  // }

  // with the in place , we are usingthe 1st row amd col to store the markers
  // where should be the 0's to be placed

  // public void mZero(int[][] a) {
  // boolean isFirstRowZero = false;
  // boolean isFirstColZero = false;
  // for (int i = 0; i < a[0].length; i++) {
  // if (a[0][i] == 0) {
  // isFirstRowZero = true;
  // break;
  // }
  // }
  // for (int i = 0; i < a.length; i++) {
  // if (a[i][0] == 0) {
  // isFirstColZero = true;
  // break;
  // }
  // }
  // System.out.println("Is col: " + isFirstColZero);

  // for (int i = 1; i < a.length; i++) {
  // for (int j = 1; j < a[0].length; j++) {
  // if (a[i][j] == 0) {
  // a[i][0] = 0;
  // a[0][j] = 0;
  // }
  // }
  // }

  // for (int i = 1; i < a.length; i++) {
  // for (int j = 1; j < a[0].length; j++) {
  // if (a[i][0] == 0 || a[0][j] == 0) {
  // a[i][j] = 0;
  // }

  // }

  // }

  // if (isFirstRowZero) {
  // for (int i = 0; i < a[0].length; i++) {
  // a[0][i] = 0;
  // }
  // }
  // if (isFirstColZero) {
  // for (int i = 0; i < a.length; i++) {
  // a[i][0] = 0;
  // }
  // }

  // System.out.println(Arrays.deepToString(a));

  // // for (int[] a2 : a) {
  // // System.out.print(" [" + Arrays.toString(a2)+"]");
  // // }

  // // for (int[] is : a) {
  // // for (int is2 : is) {
  // // System.out.println(" "+is2);
  // // }
  // // }

  // }

  // let me re write the code for in place approach
  public void mZero(int[][] a) {
  //   boolean isFirstRowZero = false;
  //   boolean isFirstColZero = false;
  //   // let's see if there is any 0 in row
  //   for (int i = 0; i < a[0].length; i++) {
  //     if (a[0][i] == 0) {
  //       isFirstRowZero = true;
  //       break;
  //     }

  //   }
  //   // now same for the to check if the 1st col is having any 0
  //   for (int i = 0; i < a.length; i++) {
  //     if (a[i][0] == 0) {
  //       isFirstColZero = true;
  //       break;
  //     }
  //   }

  //   // Let's see athe 0's in remiang array other 1st row and col
  //   for (int i = 1; i < a.length; i++) {
  //     for (int j = 1; j < a[0].length; j++) {
  //       if (a[i][j] == 0) {
  //         a[0][i] = 0;
  //         a[j][0] = 0;
  //       }
  //     }
  //   }

  //   // Let's add those 0's in respective row and col
  //   for (int i = 1; i < a.length; i++) {
  //     for (int j = 1; j < a[0].length; j++) {
  //       if (a[0][i] == 0 || a[j][0] == 0) {
  //         a[i][j] = 0;
  //       }
  //     }
  //   }

  //   // check the 0's in 1st row and col
  //   if (isFirstRowZero) {
  //     for (int i = 0; i < a[0].length; i++) {
  //       a[0][i] = 0;

  //     }
  //   }
  //   if (isFirstColZero) {
  //     for (int i = 0; i < a.length; i++) {
  //       a[i][0] = 0;

  //     }
  //   }

  boolean isFirstColZero=false,isFirstRowZero=false;
  // let's see the 1st row for any zeros
  for (int i = 0; i < a[0].length; i++) {
      if(a[0][i]==0){
        isFirstRowZero=true;
        break;
      }
  }
  for (int i = 0; i < a.length; i++) {
    if(a[i][0]==0){
      isFirstColZero=true;
      break;
    }
  }
  for (int i = 1; i < a.length; i++) {
    for (int j = 1; j < a[0].length; j++) {
      if(a[i][j]==0){
        a[i][0]=0;
        a[0][j]=0;
      }
    }
  }

  for (int i = 1; i < a.length; i++) {
    for (int j = 1; j < a[0].length; j++) {
      if(a[i][0]==0 || a[0][j]==0){
        a[i][j]=0;
      }
    }
  }
  if(isFirstRowZero){
    for (int i = 0; i < a[0].length; i++) {
      a[0][i]=0;
    }
  }
  if(isFirstColZero){
    for (int i = 0; i < a.length; i++) {
      a[i][0]=0;
    }
  }



    System.out.println(Arrays.deepToString(a));

  }

  public static void main(String[] args) {
    // int[][] a =new int[3][3];
    // int[][] a = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    int[][] a = { {0,1,2,0},{3,4,5,2},{1,3,1,5} };
    // int[][] a = {
    // { 1, 1, 1, 1 },
    // { 1, 1, 1, 1 },
    // { 1, 1, 1, 0 },
    // { 1, 1, 1, 1 }
    // };
    // int[][] a = {{1,0,3}};

    for (int[] is : a) {
      for (int is2 : is) {
        System.out.print(" " + is2);
      }
      // System.out.print(Arrays.toString(is));
    }
    SetMatrixZero s = new SetMatrixZero();
    s.mZero(a);
  }
}
