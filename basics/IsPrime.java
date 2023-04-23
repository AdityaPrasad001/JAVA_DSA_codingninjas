package basics;

import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int div = 2;
    boolean isPrime = true;
    while(div < num){
      if(num % div == 0){
        isPrime = false;
      }
      div++;
    }
    if(isPrime){
      System.out.println(num + " is Prime");
    }else{
      System.out.println(num + " is not prime");
    }
  }
}
