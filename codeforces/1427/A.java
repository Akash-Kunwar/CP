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
        int t=nextInt();
        while(t-->0){
            int n=nextInt();
            int arr[]=new int[n];
            int pos=0,neg=0;
            for(int i=0;i<n;i++){
                arr[i]=nextInt();
                if(arr[i]>0) pos+=arr[i];
                if(arr[i]<0) neg+=arr[i];
            }
            if(Math.abs(pos)==Math.abs(neg)){
                out.println("NO");
            }
            else{
                out.println("YES");
                if(Math.abs(pos)>Math.abs(neg)){
                    Arrays.sort(arr);
                    for(int i=n-1;i>=0;i--){
                        out.print(arr[i]+" ");
                    }
                }
                else{
                    Arrays.sort(arr);
                    for(int i=0;i<n;i++){
                        out.print(arr[i]+" ");
                    }
                }
                out.println();
            }
        }
        out.close();
    }
}
