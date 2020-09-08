import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{   
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String args[]) throws Exception
    {
        int x=sc.nextInt();
        while(x-->0){
            int n=sc.nextInt();
            int arr[] = new int[n];
            int max=Integer.MIN_VALUE;
            int t=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(max<arr[i]){
                    max=arr[i];
                    t=i;
                }
            }
            List<Integer> res=new ArrayList<>();
            res.add(max);
            arr[t]=-1;
            int mgcd=max;
            while(res.size()<n){
                max=0;t=-1;
                for(int j=0;j<n;j++){
                    if(arr[j]!=-1){
                        if(gcd(arr[j],mgcd)>max){
                            max=gcd(arr[j],mgcd);
                            t=j;
                        }
                    }
                }
                mgcd=gcd(arr[t],mgcd);
                res.add(arr[t]);
                arr[t]=-1;
            }   
            for(int i:res) out.print(i+" ");
            out.println();

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