/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;



public class GFG {

   public static void main (String[] args)  throws Exception
	{
      Parserdoubt77771112225 sc=new Parserdoubt77771112225(System.in);

      int t=sc.nextInt();
      while(t-->0){

         int n=sc.nextInt();
         int x=sc.nextInt();
         int o_c=0,e_c=0;
         for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp%2==0)
               e_c++;
            else
               o_c++;
         }
         int flag=0;
         for(int i=1;i<=x  && i<=o_c;i+=2){

            if(e_c>=x-i){
               flag=1;
               break;
            }

         }
         if(flag==0)
            System.out.println("NO");
         else
            System.out.println("YES");


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