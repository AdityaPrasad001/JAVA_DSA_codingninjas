package patterns;

import java.util.Scanner;

/*
 * 1111
 * 2222
 * 3333
 * 4444
 */

public class SquareNumRow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    while(row<=n){
      int col = 1;
      while(col <= n){
        System.out.print(row);
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
