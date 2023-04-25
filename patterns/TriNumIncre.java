package patterns;

import java.util.Scanner;

/*
 * 1
 * 23
 * 456
 * 78910
 */

public class TriNumIncre {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    int print = 1;
    while(row <= num){
      int col = 1;
      while(col <= row){
        System.out.print(print);
        print++;
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
