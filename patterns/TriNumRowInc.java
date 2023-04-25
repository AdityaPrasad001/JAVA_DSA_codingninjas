package patterns;
/*
 * 1
 * 23
 * 345
 * 4567
 */

import java.util.Scanner;

public class TriNumRowInc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num){
      int col = 1;
      int print = row;
      while(col <= row){
        System.out.print(print);
        print++; col++;
      }
      System.out.println();
      row++;
    }
  }
}
