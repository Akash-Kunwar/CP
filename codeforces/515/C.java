   import java.util.*;
   import java.lang.*;
   import java.io.*;

   public class GFG{
      public static void main (String[] args)  throws Exception
   	 {
         FastScanner sc=new FastScanner(System.in);
         String str[]={"","","2","3","322","5","53","7","7222","7332"};

         int n=sc.nextInt();
         char s[]=sc.nextLine().toCharArray();
         String ans="";

         for(int i=0;i<s.length;i++){
            int curr=s[i]-'0';

            ans+=str[curr];
         }

         char a[]=ans.toCharArray();
         Arrays.sort(a);
         for(int i=a.length-1;i>-1;i--){
            System.out.print(a[i]);
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