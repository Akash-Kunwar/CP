import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{
   static int arr[]=new int [200001];
   static int k,n;
   public static boolean isEven(int val){
      int sum=0;
      for(int i=0;i<n;i++){
         if(sum%2==0) sum++;
         else
            if(arr[i]<=val) sum++;
      }
      return sum>=k;
   }
   public static boolean isOdd(int val){
      int sum=0;
      for(int i=0;i<n;i++){
         if(sum%2!=0) sum++;
         else
            if(arr[i]<=val) sum++;
      }
      return sum>=k;
   }   
   public static void main (String[] args)  throws Exception
	{
      FastScanner sc=new FastScanner(System.in);
      n=sc.nextInt();
      k=sc.nextInt();
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();   
      }
      int L=0;
      int H=Integer.MAX_VALUE;

      int ans=H;
      while(L<=H){
         int mid=(L+H)/2;
         if(isOdd(mid) || isEven(mid)){
            ans=mid;
            H=mid-1;
         }   
         else{
            L=mid+1; 
         }
      }

      System.out.println(ans);
         
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