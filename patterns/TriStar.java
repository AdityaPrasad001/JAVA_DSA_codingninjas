package patterns;
/*
 * Code : Triangular Star Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****
Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******
 */

import java.util.Scanner;

public class TriStar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row <= num){
      int col = 1;
      while(col <= row){
        System.out.print("*");
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
