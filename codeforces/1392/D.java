import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main (String[] args) throws Exception {

        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            char[] str=sc.nextLine().toCharArray();
            ArrayList<Integer> count = new ArrayList<Integer>();
            boolean same=true;
            for(int i=0;i<n;i++){
                if(str[i]!=str[0]){
                    same=false;
                    break;
                }
            }

            if(same){
                out.println((n+2)/3);
            }else{
                char last=str[0];
                int cnt=1;
                long ans=0;
                for(int i=1;i<n;i++){
                    if(last==str[i]) cnt++;
                    else{
                        count.add(cnt);
                        cnt=1;
                        last=str[i];
                    }
                }
                if(str[n-1] == str[0]){
                    count.set(0, count.get(0)+cnt);
                }else{
                    count.add(cnt);
                }
                int sum = 0;
                for(int i: count) sum+=(i/3);
                out.println(sum);
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


