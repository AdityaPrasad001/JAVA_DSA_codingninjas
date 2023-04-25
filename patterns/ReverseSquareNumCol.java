package patterns;
/*
 * 4321
 * 4321
 * 4321
 * 4321
 */

import java.util.Scanner;

public class ReverseSquareNumCol {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num){
      int col = num;
      while(col > 0){
        System.out.print(col);
        col--;
      }
      System.out.println();
      row++;
    }
  }
}
