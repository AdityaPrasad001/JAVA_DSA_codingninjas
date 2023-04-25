package patterns;
/*
 * Code : Character Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
 */

import java.util.Scanner;

public class AlphaTriIncRow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = 1;
    while(row<=num){
      int col = 1;
      char ch = (char)('A' + row-1);
      while(col<=row){
        System.out.print(ch);
        ch++;
        col++;
      }
      System.out.println();
      row++;
    }
  }
}
