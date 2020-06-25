import java.util.*;
import java.lang.*;
import java.io.*;
 
public class GFG{
   public static void main (String[] args)  throws Exception
	 {
      FastScanner sc=new FastScanner(System.in);
 
      int n=sc.nextInt();
      int k=sc.nextInt();
      
 
      ArrayList<Integer> max=new ArrayList<Integer>();
      ArrayList<Integer> min=new ArrayList<Integer>();
 
      if(n*9<k){
        System.out.println("-1 -1");
      }

      else if(k==0){
        if(n==1){
          System.out.println("0 0");
        }
        else{
          System.out.println("-1 -1");
        }
      }
      else{
        for(int i=0;i<n;i++){
          max.add(Math.min(k,9));
          k-=Math.min(k,9);
        }
        for(int i=n-1;i>=0;i--){
          min.add(max.get(i));
        }
        int j=0;
 
        while(j<n && min.get(j)==0){
          j+=1;
        }
 
        if(j!=0){
          min.set(0,1);
          min.set(j,min.get(j)-1);
        }
 
        String ans1="";
        String ans2="";
        for(int i=0;i<n;i++){
          ans1+=max.get(i).toString();
          ans2+=min.get(i).toString();
        }
 
        System.out.println(ans2+ " "+ ans1);
 
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