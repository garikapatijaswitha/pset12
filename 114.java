/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double p=Math.pow(a,b);
		double q=p%c;
		System.out.println(q);
	}
}
