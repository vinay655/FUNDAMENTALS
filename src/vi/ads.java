package vi;

public class ads 
{
	public static void main(String args[])
{
char a='1';
if((a>=65&&a<=90)||(a>=97&&a<=122)) 
{
	System.out.println("ALPHABET");
}
else if(a>=48&&a<=57)
{
	System.out.println("DIGIT");
}
else
{
	System.out.println("SPECIAL CHARACTER");
}
}
}