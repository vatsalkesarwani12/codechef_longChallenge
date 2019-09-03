/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 1024);
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(;t!=0;t--)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    int f=0;
		    for(int i=0;i<n-1;i++)
		    {
		        if(Math.abs(a[i]-a[i+1])<=1)
		        {
		            f++;
		        }
		    }
		    if(f==n-1)
		    out.write("YES"+"\n");
		    else out.write("NO"+"\n");
		}
		out.flush();
	}
}
