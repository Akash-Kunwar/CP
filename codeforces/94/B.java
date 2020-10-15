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
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=5;i++) arr.add(new ArrayList<>());
        int m=nextInt();
        for(int i=0;i<m;i++){
            int a=nextInt(),b=nextInt();
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        boolean flag=false;
        // out.println(arr);
        for(int i=1;i<=5;i++){
            if(arr.get(i).size()<=1 || arr.get(i).size()>=3){
                flag=true;
            }
        }
        if(flag){
            out.println("WIN");
        }
        else{
            out.println("FAIL");
        }
        out.close();
    }
}
