import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{       
    static FastScanner sc =new FastScanner(System.in);
    static PrintWriter out =new PrintWriter(System.out); 
    static int nI() throws Exception{
        return sc.nextInt();
    }
    static long nL() throws Exception{
        return sc.nextLong();
    } 
    static int ok(int arr[],int dp[][]){
        int n=arr.length;
        dp[0][0]=arr[0];
        dp[0][1]=(int)1e5;
        if(n==1){
            return Math.min(dp[0][0],dp[0][1]);
        }
        dp[1][0]=arr[0]+arr[1];
        dp[1][1]=arr[0];
        for(int i=2;i<n;i++){
            dp[i][0]=Math.min(arr[i]+dp[i-1][1],dp[i-2][1]+arr[i-1]+arr[i]);
            dp[i][1]=Math.min(dp[i-1][0],dp[i-2][0]);
        }
        return Math.min(dp[n-1][0],dp[n-1][1]);
    }
    
    public static void main(String args[]) throws Exception{
        int t=nI();
        while(t-->0){
            int n=nI();
            int arr[] = new int[n];
            int dp[][] =new int[n][2];
            for(int i=0;i<n;i++) arr[i]=nI();
            out.println(ok(arr,dp));
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