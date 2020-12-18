import java.util.*;
import java.io.*;
import java.lang.*;
public class B_Find_The_Array{
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
        new B_Find_The_Array().solve();
    }
    void solve(){ 
        int t=1; 
        t = nextInt();
        for(int tt=0;tt<t;tt++){
            int n = nextInt();
            long arr[] = new long[n];
            for(int i=0;i<n;i++) arr[i]=nextLong();
            List<Long> a1=new ArrayList<>(),a2=new ArrayList<>();
            boolean flag=true;
            for(long i:arr){
                if(flag){
                    a1.add(1l);
                    a2.add(i);
                }
                else{
                    a2.add(1l);
                    a1.add(i);
                }
                flag=!flag;
            }
            long s1=0,s2=0,s=0;
            for(int i=0;i<n;i++){
                s1+=Math.abs(a1.get(i)-arr[i]);
                s2+=Math.abs(a2.get(i)-arr[i]);
                s+=arr[i];
            }
            if(2*s1<=s){
                for(long i:a1) out.print(i+" ");
            }
            else{
                for(long i:a2) out.print(i+" ");
            }
            out.println();
        }
        out.close();
    }
}
