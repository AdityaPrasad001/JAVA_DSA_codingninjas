package basics;

import java.util.Scanner;

public class SumOfN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sumUptoN = (n*(n+1)/2);
    System.out.println(sumUptoN);
  }
}
