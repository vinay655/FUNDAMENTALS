package vi;

public class gender {

	public static void main(String[] args) {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		//System.out.println("gender="+args[0]+""+args[1]);
		if((gender.equals("female")) && ((age>=1)&&(age<=58)))
		{
			System.out.println("percentage of interest is 8.2%");
		}
		else if((gender.equals("female"))&&(age>=59&&age<=100))
		{
			System.out.println("percentage of interest is 9.2%");
		}
		else if((gender.equals("male"))&&(age>=1&&age<=58))
		{
			System.out.println("percentage of interest is 8.4%");
		}
		else if((gender.equals("female"))&&(age>=59&&age<=100))
		{
			System.out.println("percentage of interest is 10.5%");
		}
}
}
