import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    static boolean ok(int i,int j,int n,int m){
        if(i<0 || i>=n || j<0 ||j>=m) return false;
        return true;
    } 
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int X[]={1,-1,0,0},Y[]={0,0,-1,1};
        int n=sc.nextInt(),m=sc.nextInt();
        char dp[][]=new char[n][m];
        for(int i=0;i<n;i++){
            char t[]=sc.br.readLine().toCharArray();
            for(int j=0;j<m;j++){
                dp[i][j]=t[j];
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dp[i][j]=='P'){
                    for(int k=0;k<4;k++){
                        int x=i+X[k],y=j+Y[k];
                        if(ok(x,y,n,m) && dp[x][y]=='W'){
                            dp[i][j]='.';
                            dp[x][y]='.';
                            cnt++;
                        }
                    }
                }
            }
        }
        out.println(cnt);
        
        out.close();
    }
}

class FastScanner{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
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
}