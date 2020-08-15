import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{   

    static int dp[][][]=new int [201][201][201];
    


    public static int Solve(int a[],int b[],int c[],int i,int j,int l){
        int ans=0;



        if(i==-1 || j==-1 || l==-1){

            if((i==-1 && j==-1 ) || (l==-1 && i==-1) || (j==-1 && l==-1)) return 0;
            if(i==-1) return Solve(a,b,c,i,j-1,l-1)+b[j]*c[l];
            if(j==-1) return Solve(a,b,c,i-1,j,l-1)+a[i]*c[l];
            if(l==-1) return Solve(a,b,c,i-1,j-1,l)+a[i]*b[j];
        }

        if(dp[i][j][l]!=-1) return dp[i][j][l];
        
        if(i>=0 && j>=0){
            ans=Math.max(ans,Solve(a,b,c,i-1,j-1,l)+a[i]*b[j]);
        }
        if(i>=0 && l>=0) {
            ans=Math.max(ans,Solve(a,b,c,i-1,j,l-1)+a[i]*c[l]);
        }
        if(j>=0 && l>=0) {
            ans=Math.max(ans,Solve(a,b,c,i,j-1,l-1)+b[j]*c[l]);
        }
        return dp[i][j][l]=ans;   
    }

    public static void main (String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // int t=sc.nextInt();
        while(true){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int l=sc.nextInt();

            int a[]=new int[n];
            int b[]=new int[m];
            int c[]=new int[l];
        
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    Arrays.fill(dp[i][j],-1);
                }
            }

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<l;i++){
                c[i]=sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);



            // System.out.println(Arrays.toString(a));
            // System.out.println(Arrays.toString(b));
            // System.out.println(Arrays.toString(c));
            out.println(Solve(a,b,c,n-1,m-1,l-1));
            

            
            break;

            
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



