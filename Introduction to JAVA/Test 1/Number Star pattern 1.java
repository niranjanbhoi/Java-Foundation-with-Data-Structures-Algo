/* Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321 */

import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1;
		while (i<=num) {
			int j=num;
			while(j>0) {
				if (j==i) {
					System.out.print("*");
				}else {
					System.out.print(j);
				}
				j--;
			}
			
			System.out.println();
			i++;
		}
	}
}
