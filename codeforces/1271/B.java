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
    boolean ok(char arr[],char tar,List<Integer> res){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=tar){
                if(i==arr.length-1) return false;
                arr[i]=tar;
                if(arr[i+1]=='W')arr[i+1]='B';
                else{ arr[i+1]='W';}
                res.add(i+1);
            }
        }
        return true;
    }
    void solve(){ 
        int n = nextInt();
        char arr[] =next().toCharArray();
        char a[]=new char[n];
        for(int i=0;i<n;i++) a[i]=arr[i];
        List<Integer> res=new ArrayList<>();
        res.clear();
        boolean flag=false;
        if(ok(arr,'W',res)==true){
            out.println(res.size());
            for(int i:res)out.print(i+" " );
            // out.println(Arrays.toString(arr));
            flag=true;
        }
        res.clear();
        if(ok(a,'B',res)==true && !flag){
            out.println(res.size());
            for(int i:res)out.print(i+" " );
            flag=true;
        }
        if(!flag)out.println(-1);
        out.close();
    }
}
