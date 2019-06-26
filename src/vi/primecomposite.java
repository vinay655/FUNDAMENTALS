package vi;
import java.util.*;
public class primecomposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int n=b.nextInt();
            int i,c=0;
            for(i=1;i<=n;i++)
            {
            	if(n%i==0)
            	c++;
            	}
            if(c==2)
            {
            	System.out.println("it is prime number:" +n);
            }
            else
            {
            	System.out.println("it is composite number:"+n);
            }
            }

	}


