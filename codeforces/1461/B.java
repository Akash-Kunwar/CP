import java.util.*;
import java.io.*;
import java.lang.*;
public class codeforces2{ 
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        
        int t = 1;
        t=sc.nextInt();
        while(t-->0){
            kk();
        }
    }
    static int n=0,m=0;
    static char arr[][];
    static int dp[][];
    static boolean ck(int i,int j){
        if(i<0 || i>=n || j<0 || j>=m) return false;
        return true;
    }
    static void kk(){
        n=sc.nextInt();m=sc.nextInt();
        arr=new char [n][m];
        dp=new int[n][m];
        int c=0;

        for(int i=0;i<n;i++){
            char temp[]=sc.next().toCharArray();
            for(int j=0;j<m;j++){
                arr[i][j]=temp[j];
                if(arr[i][j]=='*')dp[i][j]=1;
            }
        } 

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='*'){
                    if(ck(i+1, j-1) && ck(i+1,j) && ck(i+1,j+1)){
                        int add=Math.min(Math.min(dp[i+1][j-1],dp[i+1][j]),dp[i+1][j+1]);
                        dp[i][j]+=add;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) c+=dp[i][j];
        }
        
        System.out.println(c);
    }
}

