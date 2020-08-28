import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static boolean check(long mid,long n,long k){
        if(k%(mid+1)==0){
            if(k/(mid+1)+mid<=n) return true;
            
        }
        else{
            if(k/(mid+1)+mid+1<=n) return true;
        }
        return false;
    }
    public static String ok() throws Exception{
        long n =sc.nextLong();
        long k =sc.nextLong();
        if(n>=k) return "YES";
        long low = 1 , high = n-1;

        while(low<=high){
            long mid=(low+high)/2;
            if(check(mid,n,k)){
                // out.println(mid);
                return "YES";
            }
            else{
                low=mid+1;
            }
        }
        return "NO";
    }
    
    public static void main(String args[]) throws Exception
    {
        
        int t=sc.nextInt();
        while(t-->0) out.println(ok());
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


