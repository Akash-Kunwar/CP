   import java.util.*;
   import java.lang.*;
   import java.io.*;

   public class GFG{
      public static void main (String[] args)  throws Exception
   	 {
         FastScanner sc=new FastScanner(System.in);
         PrintWriter out=new PrintWriter(System.out);
            
         int n= sc.nextInt();

         int dp[][]=new int [n+1][3];

         for(int i=1;i<=n;i++){
            int t=sc.nextInt();

            dp[i][0]=Math.max(dp[i-1][0],Math.max(dp[i-1][1],dp[i-1][2]));

            if(t==1 || t==3){
               dp[i][1]=Math.max(dp[i-1][0]+1,dp[i-1][2]+1);

            }  
            if(t==2 || t==3){
               dp[i][2]=Math.max(dp[i-1][0]+1,dp[i-1][1]+1);
               
            }

         }

         int max= Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2]));

         out.println(n-max);



         





         out.close();
         
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