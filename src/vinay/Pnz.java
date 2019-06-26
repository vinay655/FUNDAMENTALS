package vinay;
import java.util.*;
public class Pnz {
	public static void main(String args[])
	{
		Scanner b=new Scanner(System.in);
		System.out.println("enter n value");
	
		int n=b.nextInt();
		if(n > 0)
		{
			System.out.println("positive");
		}
		else if(n < 0)
		{
			System.out.println("Negative");
	}
		else 
		{
			System.out.println("Zero");	
		}
}
}