package patterns;

import java.util.Scanner;

public class MirrorNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int spaces = 1;
      while(spaces<= num-row){
        System.out.print(" ");
        spaces++;
      }
      int colNum = 1;
      while(colNum <= row){
        System.out.print(colNum);
        colNum++;
      }
      System.out.println();
      row++;
    }
  }
}
