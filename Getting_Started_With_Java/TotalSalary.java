import java.util.Scanner;
import java.lang.Math; //This import helps in reducing the execution time. 
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int bs=scan.nextInt();
		String str=scan.next();
		char ch=str.charAt(0);
		int allow;
		if(ch==65)
		{
			allow=1700;
		}
		else if(ch==66)
		{
			allow=1500;
		}
		else
		{
			allow=1300;
		}
		double ts=((bs+(0.20*bs)+(0.50*bs)+allow)-(0.11*bs));
		double roundSalary=Math.round(ts);
		int totalSalary=(int)(roundSalary);
		System.out.println(totalSalary);
	}
}
