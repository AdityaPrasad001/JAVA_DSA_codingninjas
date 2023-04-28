package patterns;

import java.util.Scanner;

public class InvertedTriStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num) {
      int col = 1;
      while(col <= num+1-row){
        System.out.print("*");
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
