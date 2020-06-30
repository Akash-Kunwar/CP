   import java.util.*;
   import java.lang.*;
   import java.io.*;

   public class GFG{
      public static void main (String[] args)  throws Exception
   	 {
         FastScanner sc=new FastScanner(System.in);
         PrintWriter out=new PrintWriter(System.out);
         

         String  str1 =sc.nextLine();
         String  str2 =sc.nextLine();

         int arr[]=new int [26];

         for(int i=0;i<str1.length();i++){
          arr[(int)str1.charAt(i)-97]+=1;
         }

         
         for(int i=0;i<str2.length();i++){
          arr[(int)str2.charAt(i)-97]-=1;
         } 


         // out.println(Arrays.toString(arr));
         String ans="";


         int flag=0;
         for(int i=0;i<26;i++){
          if(arr[i]<0){
            ans="need tree";
            flag=-1;  
          }
         }
         if(flag!=-1){
          if(str2.length()==str1.length()){
            ans="array";
          }
          else{
            int j=0,i=0;
            while(i<str1.length() && j<str2.length()){
              if(str1.charAt(i)==str2.charAt(j)){
                i+=1;
                j+=1;
              }
              else{
                i+=1;
              }

            }
            if(j==str2.length()){
              ans="automaton";
            }
            else{
              ans="both";
            }
          }
         }



         out.println(ans);




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
      public double nextDouble() throws Exception 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
        private static int binarySearchPM(int[] arr, int key){
           int n = arr.length;
           int mid = -1;
           int begin = 0,end=n;
           while(begin <= end){
               mid = (begin+end) / 2;
               if(mid == n){
                   return n;
               }
               if(key < arr[mid]){
                   end = mid-1;
               } else if(key > arr[mid]){
                   begin = mid+1;
               } else {
                   return mid;
               }
           }
           //System.out.println(begin+" "+end);
           return -begin; //expected Index
      }
      // function to find last index <= y 
      static int upperIndex(int arr[], int n, int y) { 
           int l = 0, h = n - 1; 
           while (l <= h)  
           { 
               int mid = (l + h) / 2; 
               if (arr[mid] <= y) 
                   l = mid + 1; 
               else
                   h = mid - 1; 
           } 
           return h; 
       }
      static int lowerIndex(int arr[], int n, int x) { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] >= x) 
                h = mid - 1; 
            else
                l = mid + 1; 
        } 
        return l; 
      } 
   } 