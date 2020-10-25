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
            for(int i=0;i<n;i++)arr[i]=nextInt();
            int res[] =new int[n];
            for(int i=0;i<n;i+=2){
                int a=arr[i],b=arr[i+1];
                if(a>0 && b>0){
                    res[i]=-b;
                    res[i+1]=a;
                }
                else if(a<0 && b<0){
                    res[i]=-b;
                    res[i+1]=a;
                }
                else if(a<0 && b>0){
                    res[i]=b;
                    res[i+1]=-a;
                }
                else{
                    res[i]=-b;
                    res[i+1]=a;
                }

            }
            for(int i:res){
                out.print(i+" ");
            }
            out.println();
        }
        out.close();
    }
}
