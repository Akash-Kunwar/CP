import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() throws Exception{
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int n=arr.length;
        int k=sc.nextInt();
        char a[]=new char[n];
        Arrays.fill(a,'1');
        for(int i=0;i<n;i++){
            if(arr[i]=='0'){
                if(i+k<n){
                    a[i+k]='0';
                }
                if(i-k>=0){
                    a[i-k]='0';
                }
            }
        }
        String res="";
        for(int i=0;i<n;i++){
            int flag=0;
            if(i+k<n){
                if(a[i+k]=='1'){
                    flag=1;
                    res+='1';
                }
            }
            if(i-k>=0 && flag==0){
                if(a[i-k]=='1'){
                    flag=1;
                    res+='1';
                }
            }
            if(flag==0){
                res+='0';
            }

        }
        // out.println(Arrays.toString(a));
        // out.println(res);
        if(res.equals(str)){
            for(int i=0;i<n;i++){
                out.print(a[i]);
            }
            out.println();
        }
        else{
            out.println("-1");
        }




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

