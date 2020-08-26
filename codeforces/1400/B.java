import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() throws Exception{
        long p=sc.nextInt();
        long f=sc.nextInt();
        long cnts=sc.nextLong();
        long cntw=sc.nextLong();
        long s=sc.nextLong();
        long w=sc.nextLong();


        if(s>w){
            long t=s;
            s=w;
            w=t;
            t=cnts;
            cnts=cntw;
            cntw=t;
        }

        long res=0;
        for(int i=0;i<cnts+1;i++){
            long my_cap=p,f_cap=f,count=0,counts=cnts,countw=cntw;

            if(s*i<=my_cap){
                count=i;
                counts-=i;
                my_cap-=s*i;
            }

            long j=Math.min(my_cap/w,countw);
            count+=j;
            countw-=j;

            j=Math.min(f_cap/s,counts);
            f_cap-=j*s;
            count+=j;

            j=Math.min(f_cap/w,countw);
            count+=j;
            countw-=j;

            res=Math.max(res,count);




        }

        out.println(res);


    }
    public static void main(String args[]) throws Exception{
        
        int t=sc.nextInt();
        while(t-->0) solve();
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


