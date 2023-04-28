package patterns;

import java.util.Scanner;

public class IsocelesTriStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int spaces = 1;
      while(spaces <= num-row){
        System.out.print(" ");
        spaces++;
      }
      int starInc = 1;
      while(starInc <= (row + (row-1))){
        System.out.print("*");
        starInc++;
      }
      System.out.println();
      row++;
    }
  }
}
