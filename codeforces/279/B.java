import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{
   public static void main (String[] args)  throws Exception
	 {
      FastScanner sc=new FastScanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int arr[]=new int [n];

      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }

      int count=0;
      int i=0,j=0;
      int sum=0;
      while(i<n){

         while(j<n && sum+arr[j]<=m){
            sum+=arr[j];
            j++;
         }
         count=Math.max(count,j-i);
         sum-=arr[i];
         i++;
      }
      System.out.println(count);
      
   }
}	

class FastScanner
{
   
   final private int BUFFER_SIZE = 1 << 17;
   private DataInputStream din;
   private byte[] buffer;
   private int bufferPointer, bytesRead;
 
   public FastScanner(InputStream in)
   {
      din = new DataInputStream(in);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
   }
   public String nextLine() throws Exception
   {
	   StringBuffer sb=new StringBuffer("");
	   byte c = read();
	   while (c <= ' ') c = read();
	   do
	   {
		   sb.append((char)c);
		   c=read();
	   }while(c>' ');
	   return sb.toString();
   }

   public char nextChar() throws Exception
   {
	   byte c=read();
	   while(c<=' ') c= read();
	   return (char)c;
   }

   public int nextInt() throws Exception
   {
      int ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = c == '-';
      if (neg) c = read();
      do
      {
    	  ret = ret * 10 + c - '0';
         c = read();
      } while (c > ' ');
      if (neg) return -ret;
      return ret;
   }

   public long nextLong() throws Exception
   {
      long ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = c == '-';
      if (neg) c = read();
      do
      {
    	   ret = ret * 10 + c - '0';
         c = read();
      } while (c > ' ');
      if (neg) return -ret;
      return ret;
   }

   private void fillBuffer() throws Exception
   {
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      if (bytesRead == -1) buffer[0] = -1;
   }
 
   private byte read() throws Exception
   {
      if (bufferPointer == bytesRead) fillBuffer();
      return buffer[bufferPointer++];
   }
} 