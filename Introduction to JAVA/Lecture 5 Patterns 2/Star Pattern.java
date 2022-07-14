/* Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 ******* */

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan =new Scanner(System.in);
		int N = scan.nextInt();
		if (N >= 0 && N <= 50) {
				
			int i = 1;
			while(i<=N) {
				int space = 1;
				while(space<=N-i){
					System.out.print(" ");
					space++;
					
				}
				int j= 1;
				while(j<=i*2-1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
			
		}
		
	}

}
