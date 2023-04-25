package patterns;
/*
 * 1
 * 12
 * 123
 * 1234
 */

import java.util.Scanner;

public class TriNumCol {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num){
      int col = 1;
      while(col <= row){
        System.out.print(col);
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
