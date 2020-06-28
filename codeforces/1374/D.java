   import java.util.*;
   import java.lang.*;
   import java.io.*;

   public class GFG{
      public static void main (String[] args)  throws Exception
   	 {
         FastScanner sc=new FastScanner(System.in);
         PrintWriter out=new PrintWriter(System.out);
         


         
         int t = sc.nextInt();

         while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            HashMap<Long,Long> hm =new HashMap<Long,Long>();

            for(int i=0;i<n;i++){
               long temp=sc.nextLong();
               temp=temp%k;
               if(temp!=0){
                  if(hm.containsKey(k-temp)){
                     hm.put(k-temp,hm.get(k-temp)+(long)1);
                  }
                  else{
                     hm.put(k-temp,(long)1);
                  }
               }
            }

            
            long ans=0;
            for(long i : hm.keySet()){
               long x=hm.get(i);
               ans=Math.max(ans,i+k*(x-1));
            }
            if(ans!=0){
               ans+=1;
            }
            out.println(ans);

         }

      




         

         



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