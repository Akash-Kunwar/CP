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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int n=nextInt(),k=nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++) arr[i]=nextInt();
        arr[n]=1001;
        Arrays.sort(arr);
        boolean flag=true;
        int res=0;
        while(flag){
            flag=false;
            for(int i=0;i<n;i++){
                if(arr[i]==k) break;
                if(arr[i]!=arr[i+1]){
                    arr[i]++;
                    flag=true;
                }
            }
            if(flag) res++;
        }
        out.println(res);
        out.close();
    }
}
