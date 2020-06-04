import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=2;i--)
        {
            if(n%i==0)
            {
                System.out.print(n/i+" ");
            }
        }
        
    }
}
