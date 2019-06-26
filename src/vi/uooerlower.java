package vi;

public class uooerlower {
	public static void main(String args[])
	{
		char a='Z';
		int  b;
		if(a>=97&&a<=122)
		{
			b=a-32;
			char c=(char)b;
			System.out.println(c);
		}
		else if(a>=65&&a<=90)
		{
			b=a+32;
			char c=(char)b;
			System.out.println(c);
		}
	}
}
