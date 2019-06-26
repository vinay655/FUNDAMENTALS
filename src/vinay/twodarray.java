package vinay;

import java.util.Scanner;

public class twodarray 
{
	private static Scanner inp;

	public static void main(String args[])
	{
		int k=0;
		inp = new Scanner(System.in);
		int a=inp.nextInt();
		int b=inp.nextInt();
        int twod[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
        	for(int j=0;j<b;j++)
        	{
        		twod[i][j]=k;
        		k=k++;
        	}
        	for(int n=0;n<a;n++)
            {
            	for(int h=0;h<b;h++)
            	{
            		System.out.println(twod[n][h]);
            	}
        }
     }
}
}