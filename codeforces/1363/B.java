/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;



public class GFG {
   public static int Q2(String str ,int n){
      int t_0=0,t_1=0;

      for(int i=0;i<n;i++){
         if(str.charAt(i)=='0')
            t_0++;
         else
            t_1++;
      }

      int c_0=0,c_1=0;
      int ans=Math.min(t_0,t_1);
      for(int i=0;i<n;i++){
         if(str.charAt(i)=='0')
            c_0++;
         else  
            c_1++;

         ans=Math.min(ans,c_1+t_0-c_0);
         ans=Math.min(ans,c_0+t_1-c_1);
      }

      return ans;

   }
   public static void main (String[] args)  throws Exception
	{
      Parserdoubt77771112225 sc=new Parserdoubt77771112225(System.in);

      int t=sc.nextInt();
      while(t-->0){

         String s=sc.nextLine();
         System.out.println(Q2(s,s.length()));


      }
      
	}
}	


class Parserdoubt77771112225
{
   final private int BUFFER_SIZE = 1 << 17;
 
   private DataInputStream din;
   private byte[] buffer;
   private int bufferPointer, bytesRead;
 
   public Parserdoubt77771112225(InputStream in)
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