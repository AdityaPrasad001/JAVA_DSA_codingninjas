package patterns;

import java.util.Scanner;

/*
 * Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */

public class RevTriAlpha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int row = num;
    while(row>0){
      int col = num;
      char ch = (char)('A'+row-1);
      while(col>=row){
        System.out.print(ch);
        ch++;
        col--;
      }
      System.out.println();
      row--;
    }
  }
}
