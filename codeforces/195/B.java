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
    void solve(){
        int n=nextInt(),m=nextInt();
        StringBuilder str = new StringBuilder();
        List<Integer> arr =new ArrayList<>();
        int pos=m/2;
        if(m%2!=0){
            arr.add(pos);
            for(int i=1;i<m;i++)
            {
                if(i%2!=0){
                    pos-=i;
                }
                else{
                    pos+=i;
                }
                arr.add(pos);
            }
        }
        else{
            arr.add(pos-1);
            pos--;
            for(int i=1;i<m;i++){
                if(i%2!=0){
                    pos+=i;
                }
                else{
                    pos-=i;
                }
                arr.add(pos);
            }
        }
        for(int i=0;i<n;i++){
            out.println(arr.get(i % arr.size())+1);
        }
        out.close();
    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
}
