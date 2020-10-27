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
    long nextLong()
    {
        return Long.parseLong(next());
    }
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){ 
        int n=nextInt(),m=nextInt();
        long arr[] =new long[n],brr[]=new long[m],x=nextLong(),y=nextLong();
        for(int i=0;i<n;i++) arr[i]=nextLong();
        for(int j=0;j<m;j++) brr[j]=nextLong();
        int i=0,j=0;
        List<Pair> res =new ArrayList<>();
        while(i<n && j<m){
            if(arr[i]-x <= brr[j] && arr[i]+y>=brr[j]){
                res.add(new Pair(i+1,j+1));
                i++;
                j++;
            }
            else if(arr[i]+y<brr[j]){
                i++;
            }
            else if(arr[i]-x>brr[j]){
                j++;
            }
            // out.println(i+" "+j);
        }
        out.println(res.size());
        for(Pair p:res){
            out.println(p.i+" "+p.j);
        }
        out.close();
    }
}
class Pair{
    int i,j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}