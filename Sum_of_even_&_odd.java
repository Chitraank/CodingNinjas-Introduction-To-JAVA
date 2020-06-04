import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
    int Length=Integer.toString(N).length();    
	int even[]=new int[Length];
    int odd[] =new int[Length];    
	int temp=0;
	int j=0;
	int Esum=0;
	int Osum=0;
	

	while(N!=0)
	{
		temp=N%10;
        if(temp%2==0)
        {
        even[Length-j-1]=temp;
        }
        else
        {
         odd[Length-j-1]=temp;   
        }
        j++;
        N=N/10;
	}
        for(int i=0;i<even.length;i++)
        {
            Esum=Esum+even[i];
        }
        for(int i=0;i<odd.length;i++)
        {
            Osum=Osum+odd[i];
        }
        System.out.println(Esum+" "+Osum);
        
	}
}
