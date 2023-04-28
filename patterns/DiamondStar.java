package patterns;

import java.util.Scanner;

public class DiamondStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num1 = num/2 + 1;
    int row1 = 1;
    while(row1 <= num1){
      int space1 = 1;
      while(space1 <= (num1 - row1)){
        System.out.print(" ");
        space1++;
      }
      int star1 = 1;
      while(star1 <= (row1+(row1-1))){
        System.out.print("*");
        star1++;
      }
      System.out.println();
      row1++;
    }
    int num2 = num - num1;
    int row2 = 1;
    while(row2 <= num2){
      int space2 = 1;
      while(space2<=row2){
        System.out.print(" ");
        space2++;
      }
      int star2 = 1;
      while(star2<=((num2+1-row2)+(num2-row2))){
        System.out.print("*");
        star2++;
      }
      System.out.println();
      row2++;
    }
  }
}
