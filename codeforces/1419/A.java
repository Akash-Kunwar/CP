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
            char arr[] =sc.next().toCharArray();
            if(n%2!=0){
                // Alyce have the option to choose the winner
                boolean win=false;
                for(int i=0;i<n;i+=2){
                    if((arr[i]-'0')%2!=0) win=true;
                }
                out.println(win?1:2);
            }
            else{
                // BOB
                boolean win=false;
                for(int i=1;i<n;i+=2){
                    if((arr[i]-'0')%2==0) win=true;
                }
                out.println(win?2:1);
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
