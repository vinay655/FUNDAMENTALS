package vi;
import java.util.*;
public class sumdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int sum=1,n,c,i;
		n=b.nextInt();
		
		for(i=0;i<=n;i++)
		
		{
			c=n%10;
			sum+=c;
			n=n/10;
			
		}
System.out.println(sum);
	
	}
}
