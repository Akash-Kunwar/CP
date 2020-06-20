import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{
  
  

   public static void main (String[] args)  throws Exception
	{
      FastScanner sc=new FastScanner(System.in);
      
      long  t=sc.nextLong();

      while(t-->0){
         int n=sc.nextInt();
         ArrayList<Integer> arr=new ArrayList<Integer>();
         ArrayList<Integer> brr=new ArrayList<Integer>();
         for(int i=0;i<2*n;i++){
            long x=sc.nextLong();

            if(x%2==0){
               arr.add(i+1);
            }
            else{
               brr.add(i+1);
            }
         }

         ArrayList<ArrayList<Integer>> ans =new ArrayList<ArrayList<Integer>>();
         for(int i=0;i<arr.size()-1;i+=2){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            temp.add(arr.get(i));
            temp.add(arr.get(i+1));
            ans.add(temp);
         }
         for(int i=0;i<brr.size()-1;i+=2){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            temp.add(brr.get(i));
            temp.add(brr.get(i+1));
            ans.add(temp);
         }         

         for(int i=0;i<n-1;i++){
            System.out.println(ans.get(i).get(0)+" "+ans.get(i).get(1));
         }

      }




     
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