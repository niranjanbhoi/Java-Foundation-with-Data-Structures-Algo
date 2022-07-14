/* Zeros and Stars Pattern
Send Feedback
Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
*00*00*
0*0*0*0
00***00
Sample Input 2 :
5
Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000 */

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while (i<=n){
			int j=1;
			while (j<=n) {
				if (i==j) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
				j++;
			}
			System.out.print("*");
			int k=n;
			while(k>0) {
				if (k==i) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
				k--;
			}
			System.out.println();
			i++;
		}
	}	


}
