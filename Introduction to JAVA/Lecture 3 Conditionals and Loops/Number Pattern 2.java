/* Number Pattern 2
Send Feedback
Print the following pattern
Pattern for N = 4


The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input :
5
Sample Output :


The dots represent spaces.

 */

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner scan =new Scanner(System.in);
		int N = scan.nextInt();
		int i=1;
		while(i<=N) {
			int k=1;
			while (k<=N-i) {
				System.out.print(" ");
				k = k+1;
			}
			int j=i;
			while (j<=(2*i-1)) {
				System.out.print(j);
				j++;
			}
			System.out.println("");
			i++;
		}
		
	}

}
