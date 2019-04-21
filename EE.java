import java.util.*;
import java.io.*;

class EE
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int q=0,r1=0,r2=0;
		System.out.println("q=" + q);
		System.out.println("Enter two integers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		r1=((a>b)?a:b);
		r2=((a<b)?a:b);
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
		
		int r=0;
		while(r2!=0)
		{
			q=r1/r2;
			r=r1-(q*r2);
			r1=r2;
			r2=r;
	
		}
		
		System.out.println("gcd="+r1);
		
	}	
	
	
	
	
	

}