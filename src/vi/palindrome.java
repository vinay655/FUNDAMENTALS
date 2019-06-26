package vi;
import java.util.*;
public class palindrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner b=new Scanner(System.in);
int n=b.nextInt();
int x=n;
int c,rev=0;
while(n!=0)
{
c=n%10;
rev=rev*10+c;
 n=n/10;
{
	System.out.print(c);
}
}
if(rev==x)
{
System.out.println("it is palindrome");
}
else
	{
	System.out.println("it is not palindrome");
	}
	}
}
