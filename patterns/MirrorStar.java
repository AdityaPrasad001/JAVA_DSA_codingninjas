package patterns;

import java.util.Scanner;

public class MirrorStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num){
      int spaces = 1;
      while(spaces <= num-row){
        System.out.print(" ");
        spaces++;
      }
      int stars = 1;
      while(stars <= row){
        System.out.print("*");
        stars++;
      }
      System.out.println();
      row++;
    }
  }
}
