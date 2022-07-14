/* Code : Interesting Alphabets
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
ABCDEFG */

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan =new Scanner(System.in);
		int N = scan.nextInt();
		
		if (N >= 0 && N <= 26) {
			int i=1;
			while (i <= N){
				int j=1;
				char ch = (char) ('A' + i - 1); 
				while(j <= i) {
					System.out.print(ch);
					j=j+1;
					ch = (char)(ch + 1);
				}
				System.out.println();
				i=i+1;
			}
		}
		
	}

}
