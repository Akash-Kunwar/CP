import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        
        int t=Integer.parseInt(sc.next());
        while(t-->0){
            int n=Integer.parseInt(sc.next());
            int x=Integer.parseInt(sc.next());
            int arr[] =new int[n];
            long sum=0;
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(sc.next());
                sum+=arr[i]-x;
            }
            boolean allE=true,X=false;
            for(int i=0;i<n;i++){
                if(arr[i]!=x){
                    allE=false;
                }
                if(arr[i]==x){
                    X=true;
                }
            }
            if(allE){
                out.println(0);
            }
            else{
                if(X || sum==0){
                    out.println(1);
                }
                else{
                    out.println(2);
                }

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
    public String next() throws Exception
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
}
