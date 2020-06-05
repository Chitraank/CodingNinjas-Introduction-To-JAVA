import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int E=sc.nextInt();
        int W=sc.nextInt();
        int C=0;
        int i=S;
        while(i<E)
        {
         C=((i-32)*5)/9;
         System.out.println(i+" "+C);
        i+=W;
        }
        

		
	}

}
