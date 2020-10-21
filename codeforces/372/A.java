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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int n=nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++) arr[i]=nextInt();
        Arrays.sort(arr);
        int mid=n/2,j=mid,cnt=0;
        for(int i=0;i<mid && j<n;){
            if(arr[i]*2<=arr[j]){
                i++;j++;
                cnt++;
            }
            else{
                j++;
            }
        }
        out.println(n-cnt);
        out.close();
    }
}
