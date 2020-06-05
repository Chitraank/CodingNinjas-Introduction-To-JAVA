import java.util.*;
public class Solution {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    	int k=n;
		for(int i=1;i<=n;i++)
        {
            char ch=(char)('A'+i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch=(char)(ch+1);  
            }
         System.out.println();
        
        }
	}
}
