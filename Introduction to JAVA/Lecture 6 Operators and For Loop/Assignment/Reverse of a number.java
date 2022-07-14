/* Reverse of a number
Send Feedback
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891 */

import java.util.Scanner;
public class Main {
	
	static int revers(int n) 
    { 
        int rn = 0; 
        while(n > 0) 
        { 
            rn = rn * 10 + n% 10; 
            n = n/ 10; 
        } 
        return rn; 
    } 
      
    public static void main (String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(revers(n)); 
    } 
}
