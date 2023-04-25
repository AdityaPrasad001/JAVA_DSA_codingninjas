package patterns;
/*
 * ABCD
 * BCDE
 * CDEF
 * DEFG
 */

import java.util.Scanner;

public class AlphaIncRow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int col = 1;
      char ch = (char)('A' + row-1);
      while(col<=num){
        System.out.print(ch);
        ch++;
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
