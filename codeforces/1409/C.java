import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{   
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void solve(int a,int b, int n){
        int min=Integer.MAX_VALUE;
        int temp[]=new int[n];
        int res[]=new int[n];
        for(int i=1;i<=50;i++){
            for(int j=1;j<=50;j++){
                Arrays.fill(temp,0);
                temp[0]=i;
                int curr_max=temp[0];
                boolean apre=false,bpre=false;
                if(temp[0]==a) apre=true;
                if(temp[0]==b) bpre=true;

                for(int k=1;k<n;k++)
                {
                    temp[k]=temp[k-1]+j;
                    if(temp[k]==a) apre=true;
                    if(temp[k]==b) bpre=true;
                    curr_max=Math.max(curr_max,temp[k]);
                }
                
                if(min>curr_max && apre && bpre){
                    // out.println(Arrays.toString(temp));
                    for(int k=0;k<n;k++) res[k]=temp[k];
                    min=curr_max;
                }

            }

        }
        // out.println("ans");
        // out.println(Arrays.toString(res));
        for(int i=0;i<n;i++){
            out.print(res[i]+" ");
        }

        out.println();
    }

    public static void main(String args[]) throws Exception
    {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            solve(a,b,n);

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

    public void reverse(int arr[]){
       for(int i=0;i<arr.length/2;i++){
           int temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
       }         
    }
    public void revLongArray(long arr[]){
       for(int i=0;i<arr.length/2;i++){
           long temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
       }         
    }   

}


