package patterns;

import java.util.Scanner;

public class IsoscelesTriNumIncDec {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int spaces = 1;
      while(spaces <= num - row){
        System.out.print(" ");
        spaces++;
      }
      int col1 = 1;
      int numInc = row;
      while(col1 <= row){
        System.out.print(numInc);
        numInc++;
        col1++;
      }
      int col2 = 1;
      int numDec = (row-1)*2;
      while(col2 <= row-1){
        System.out.print(numDec);
        numDec--;
        col2++;
      }
      System.out.println();
      row++;
    }
  }
}
