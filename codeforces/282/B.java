import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG
{


    public static void main (String[] args)  throws Exception
    {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n=sc.nextInt();
        long a=0,g=0;

        StringBuilder str =new StringBuilder();

        for(int i=0;i<n;i++){
          int f=sc.nextInt();
          int s=sc.nextInt();
          if(a+f-g>500){
            g+=s;
            str.append("G");
          }
          else{
            a+=f;
            str.append("A");
          }
        }

        out.println(str.toString());


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
    private static int binarySearchPM(int[] arr, int key)
    {
        int n = arr.length;
        int mid = -1;
        int begin = 0, end = n;
        while(begin <= end)
        {
            mid = (begin + end) / 2;
            if(mid == n)
            {
                return n;
            }
            if(key < arr[mid])
            {
                end = mid - 1;
            }
            else if(key > arr[mid])
            {
                begin = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        //System.out.println(begin+" "+end);
        return -begin; //expected Index
    }
    // function to find last index <= y
    static int upperIndex(int arr[], int n, int y)
    {
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
    static int lowerIndex(int arr[], int n, int x)
    {
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