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
    boolean check(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i) return false;
        }
        return true;
    }
    void solve(){ 
        int n = nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++) arr[i]=nextInt();
        int cnt=0;
        boolean flag=false;
        while(cnt<=10000){
            cnt++;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    arr[i]=(arr[i]+1)%n;
                }
                else{
                    arr[i]=(arr[i]-1+n)%n;
                }
            }
            if(check(arr)){
                flag=true;
            }
            // out.println(Arrays.toString(arr));
            cnt++;
        }
        out.println(flag?"Yes":"No");
        out.close();
    }
}
