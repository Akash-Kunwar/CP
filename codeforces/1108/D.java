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
        int n=nextInt();
        char arr[] =next().toCharArray();
        char val[]={'R','G','B'};
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
                for(int j=0;j<3;j++){
                    if(arr[i-1]!=val[j] && (i==n-1 || arr[i+1]!=val[j])){
                        arr[i]=val[j];
                    }
                }
            }
        }
        out.println(count);
        out.println(new String(arr));
        out.close();
    }
}
