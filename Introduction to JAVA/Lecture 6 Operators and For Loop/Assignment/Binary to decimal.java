/* Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7 */
import java.util.Scanner;
public class Main {
	
	static int BToD(int N) {
		
		int temp=N;
		int rem=0;
		int result = 0;
		int degree = 1;
		while (temp != 0) {		
			rem = temp%10;
			if (rem == 1) {
				result = result + degree;			
			}
			temp = temp/10;
			degree = degree*2;
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(BToD(num));

	}
}
