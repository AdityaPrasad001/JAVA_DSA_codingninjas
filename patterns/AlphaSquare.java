package patterns;

import java.util.Scanner;

public class AlphaSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int col = 1;
      while(col<=num){
        System.out.print((char)('A'+(col-1)));
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
