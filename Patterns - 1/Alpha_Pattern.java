import java.util.*;
public class Solution {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		for(char i=65;i<65+n;i++)
        {
            for(char j=65;j<=i;j++)
            {
                System.out.print(i);
            }
         System.out.println();
        }
	}
}
