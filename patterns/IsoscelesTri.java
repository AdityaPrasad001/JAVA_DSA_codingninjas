package patterns;

import java.util.Scanner;
public class IsoscelesTri {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int spaces = 1;
      while(spaces <= num - row){
        System.out.print(" ");
        spaces++;
      }
      int incNum = 1;
      while(incNum <= row){
        System.out.print(incNum);
        incNum++;
      }
      int decNum = row - 1;
      while(decNum >= 1){
        System.out.print(decNum);
        decNum--;
      }

      System.out.println();
      row++;
    }
  }
}
