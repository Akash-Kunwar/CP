import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG{
    static int dp[][]=new int[101][101];

    public static void solve(int n,int m,int x,int y){

        System.out.println(x+" "+y);
        dp[x][y]=0;

        if(x==1 || y==1){
            dp[1][1]=-1;
        }
        else{

            dp[1][y]=0;
            System.out.println(1+" "+y);
        }
        int i=1,j=1;
        while(i<=n){

            if(j==1){
                while(j<=m){
                    if(dp[i][j]==-1){
                        System.out.println(i+" "+j);
                        dp[i][j]=0;
                        
                    }
                    j++;
                }
                j--;
            }
            else{
                
                while(j>0){
                    if(dp[i][j]==-1){
                        System.out.println(i+" "+j);
                        dp[i][j]=0;
                        
                    }
                    j--;
                }
                j++;
            }

            i++;

        }




    }

    public static void main (String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        

        
        for(int i=0;i<101;i++){
            Arrays.fill(dp[i],-1);
        }

        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();

        solve(n,m,x,y);

       
        

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



