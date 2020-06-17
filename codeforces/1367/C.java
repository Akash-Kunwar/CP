import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{
   static int in_between(int p1,int p2,int k){
      int lft=p1+1,rgt=p2-k-1;
      
      return (rgt-lft+1)/(k+1);
   }
   public static void main (String[] args)  throws Exception
	{
      FastScanner sc=new FastScanner(System.in);
      int test=sc.nextInt();
      while(test-->0){
         int n=sc.nextInt();
         int x=sc.nextInt();
         char arr[]=sc.nextLine().toCharArray();
         
         ArrayList<Integer> al =new ArrayList<Integer>();
         for(int i=0;i<n;i++){
            if(arr[i]=='1'){
               al.add(i);
            }
         }
         // System.out.println(al);
         if(al.size()==0){
            int a=1+(n-1)/(x+1);
            System.out.println(a);
         }
         else{
            int ans=(al.get(0))/(x+1);
            
            int l=al.get(al.size()-1);
            
            ans+=(n-l-1)/(x+1);
            
            for(int i=0;i<al.size()-1;i++){
               ans+=in_between(al.get(i),al.get(i+1),x);
            }
            System.out.println(ans);

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