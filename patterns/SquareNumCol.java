package patterns;

import java.util.Scanner;

/*
 * 1234
 * 1234
 * 1234
 * 1234
 */

public class SquareNumCol {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num){
      int col = 1;
      while(col <= num){
        System.out.print(col);
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
