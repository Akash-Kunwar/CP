import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Rextester{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = new Integer(br.readLine());
        int[][] array = new int[n][n];
        long[] ldiag = new long[2*n+2];
        long[] rdiag = new long[2*n+2];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                array[i][j]=new Integer(st.nextToken());
                ldiag[i+j]+=array[i][j];
                rdiag[i-j+n]+=array[i][j];
            }
        }
        br.close();
        int[] x = new int[2];
        int[] y = new int[2];
        long anse=Long.MIN_VALUE;
        long anso=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum = ldiag[i+j]+rdiag[i-j+n]-array[i][j];
                if((i+1+j+1)%2==0){
                    if(sum>anse){
                        anse=sum;
                        x[0]=i+1;
                        y[0]=j+1;
                    }
                }
                if((i+1+j+1)%2!=0){
                    if(sum>anso){
                        anso=sum;
                        x[1]=i+1;
                        y[1]=j+1;
                    }
                }
            }
        }
        System.out.println((anso+anse)+"\n"+x[0]+" "+y[0]+" "+x[1]+" "+y[1]);
    }
}