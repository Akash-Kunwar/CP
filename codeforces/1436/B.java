import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out =new PrintWriter(System.out);
    StringTokenizer st =new StringTokenizer("");
    String next(){
        if(!st.hasMoreTokens()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(Exception e){

            }
        }
        return st.nextToken();
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    boolean ok(int n) 
    {
        
        // Check if number is less than 
        // equal to 1
        if (n <= 1) 
            return false; 
            
        // Check if number is 2 
        else if (n == 2) 
            return true;
            
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
            
        // If not, then just check the odds
        for(int i = 3; i <= Math.sqrt(n); i += 2) 
        {
            if (n % i == 0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int t=nextInt();
        int primes[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,};
        while(t-->0){
            int n=nextInt();
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++){
                Arrays.fill(arr[i],1);
            }
            int m=n-1,x=-1;
            for(int i=0;i<primes.length;i++){
                if(primes[i]-m>0 && !ok(primes[i]-m)){
                    x=primes[i]-m;
                    break;
                }
            }
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++){
                    if(i==j) arr[i][j]=x;
                }
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    out.print(arr[i][j]+" ");
                }
                out.println();
            }
        }
        out.close();
    }
}
