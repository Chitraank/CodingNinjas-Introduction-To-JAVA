/*
                                                                  Sum Pattern
                                         Write a program to print triangle of user defined integers sum.
					 
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/


import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++ )
            {
          		System.out.print(" ");   
            }
            for(int k=1;k<=i;k++)
        	{
            	System.out.print(k);
            }
        	System.out.println();
        }
	}
}
