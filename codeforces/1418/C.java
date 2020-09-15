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
    static int ok(int arr[],int start,int chance,int dp[][]){
        if(start>=arr.length) return 0;
        if(dp[start][chance]!=-1) return dp[start][chance];
        int op1=Integer.MAX_VALUE,op2=Integer.MAX_VALUE;
        if(chance%2==0){
            op1=arr[start]+ok(arr,start+1,1,dp);
            if(start+1<arr.length){
                op2=arr[start]+arr[start+1]+ok(arr,start+2,1,dp);
            }
        }   
        else{
            op1=ok(arr,start+1,0,dp);
            op2=ok(arr,start+2,0,dp);
        }
        return dp[start][chance]=Math.min(op1,op2);
    }
    
    public static void main(String args[]) throws Exception{
        int t=nI();
        while(t-->0){
            int n=nI();
            int arr[] = new int[n];
            int dp[][] =new int[n+1][2];
            for(int i=0;i<n+1;i++){
                Arrays.fill(dp[i],-1);
            }
            for(int i=0;i<n;i++) arr[i]=nI();
            out.println(ok(arr,0,0,dp));
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