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
        int t= nextInt();
        while(t-->0){
            int n =nextInt();
            long m = nextLong();
            long start = m ,end =m,prev=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                long ti =nextLong(),low=nextLong(),high=nextLong();
                long time = ti-prev;
                prev=ti;
                start = start - time ; end =end + time;
                
                if(end>=low && start<=high){
                    // out.println(ti+" "+low+" "+high);
                    // out.println(time+" "+start+" "+end);
                    start = Math.max(start,low);
                    end = Math.min(end,high);
                    
                }
                else flag=true;
                
            }
            out.println(flag?"NO":"YES");
        }
        out.close();
    }
}
