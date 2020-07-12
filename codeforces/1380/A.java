import java.util.*;
import java.lang.*;
import java.io.*;


public class GFG
{       
    public static void main (String[] args)  throws Exception
    {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int  t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int dp[]= new int[n];
            int sp[]= new int [n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=1;i<n;i++){
                if(arr[i]>arr[i-1]){
                    dp[i]=1;
                }
                else{
                    dp[i]=0;
                }
            }
            for(int i=n-2;i>=0;i--){
                if(arr[i]>arr[i+1]){
                    sp[i]=1;
                }
                else{
                    sp[i]=0;
                }
            }
            // out.println(Arrays.toString(dp));
            // out.println(Arrays.toString(sp));
            int flag=-1;
            for(int i=1;i<n-1;i++){
                if(dp[i]==1 && dp[i]==sp[i]){
                    flag=0;
                    out.println("YES");
                    out.println((i)+" "+(i+1)+" "+(i+2));
                    break;
                }
            }
            if(flag==-1){
                out.println("No");
            }

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
        StringBuffer sb = new StringBuffer("");
        byte c = read();
        while (c <= ' ') c = read();
        do
        {
            sb.append((char)c);
            c = read();
        }
        while(c > ' ');
        return sb.toString();
    }

    public char nextChar() throws Exception
    {
        byte c = read();
        while(c <= ' ') c = read();
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
        }
        while (c > ' ');
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
        }
        while (c > ' ');
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

        do
        {
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

    
}



