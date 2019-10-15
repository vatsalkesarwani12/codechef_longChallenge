/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    /* static class MyScanner{
		BufferedReader br;
		StringTokenizer st;
		
		MyScanner(FileReader fileReader){
			br = new BufferedReader(fileReader);
		}
		
		MyScanner(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String nn(){
			while(st == null || !st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		char nc(){
			return nn().charAt(0);
		}
		
		int ni(){
			return Integer.parseInt(nn());
		}
		
		long nl(){
			return Long.parseLong(nn());
		}
		
		double nd(){
			return Double.parseDouble(nn());
		}
		
		int[] niArr0(int n){
			int[] ar = new int[n];
			for(int i = 0; i < n; i++) ar[i] = ni();
			return ar;
		}
		
		int[] niArr1(int n){
			int[] ar = new int[n + 1];
			for(int i = 1; i <= n; i++) ar[i] = ni();
			return ar;
		}
		
		long[] nlArr0(int n){
			long[] ar = new long[n];
			for(int i = 0; i < n; i++) ar[i] = nl();
			return ar;
		}
		
		long[] nlArr1(int n){
			long[] ar = new long[n + 1];
			for(int i = 1; i <= n; i++) ar[i] = nl();
			return ar;
		}
	}
	
	public static <T> void mprintln(T ... ar){
		for(T i: ar) out.print(i + " ");
		out.println();
	}
	
	private static PrintWriter out;*/
	
    static class Reader     //fasest way to take input
	{                        //refer geeksforgeeks for more info
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 

		public Reader() 
		{ 
			din = new DataInputStream(System.in); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 

		public Reader(String file_name) throws IOException 
		{ 
			din = new DataInputStream(new FileInputStream(file_name)); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 

		public String readLine() throws IOException 
		{ 
			byte[] buf = new byte[(int)(Math.pow(10,5)+1)]; // line length 
			int cnt = 0, c; 
			while ((c = read()) != -1) 
			{ 
				if (c == '\n') 
					break; 
				buf[cnt++] = (byte) c; 
			} 
			return new String(buf, 0, cnt); 
		} 

		public int nextInt() throws IOException 
		{ 
			int ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do
			{ 
				ret = ret * 10 + c - '0'; 
			} while ((c = read()) >= '0' && c <= '9'); 

			if (neg) 
				return -ret; 
			return ret; 
		} 

		public long nextLong() throws IOException 
		{ 
			long ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 
			if (neg) 
				return -ret; 
			return ret; 
		} 

		public double nextDouble() throws IOException 
		{ 
			double ret = 0, div = 1; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 

			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 

			if (c == '.') 
			{ 
				while ((c = read()) >= '0' && c <= '9') 
				{ 
					ret += (c - '0') / (div *= 10); 
				} 
			} 

			if (neg) 
				return -ret; 
			return ret; 
		} 

		private void fillBuffer() throws IOException 
		{ 
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
			if (bytesRead == -1) 
				buffer[0] = -1; 
		} 

		private byte read() throws IOException 
		{ 
			if (bufferPointer == bytesRead) 
				fillBuffer(); 
			return buffer[bufferPointer++]; 
		} 

		public void close() throws IOException 
		{ 
			if (din == null) 
				return; 
			din.close(); 
		} 
	} 
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 1024);
		Reader sc=new Reader();
		//MyScanner sc = new MyScanner();
		//out = new PrintWriter(new BufferedOutputStream(System.out));
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int c=1;
		    int f=0;
		    for(int i=1;i<n;i++)
		    {
		        int b=i-5;
		        if(b<0)
		        b=0;
		        for(;b<i;b++)
		        {
		            if(a[b]<=a[i])
		            {
		                f=1;
		                break;
		            }
		        }
		        if(f==1)
		        {
		            f=0;
		            continue;
		        }
		        else if(f==0)
		        {
		            c++;
		            f=0;
		            continue;
		        }
		    }
		    out.write(c+"\n");
		}
		out.flush();
		//out.close();
	}
}
