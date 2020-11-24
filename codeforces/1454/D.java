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
    Map<Long,Integer> pam=new HashMap<>();
    void pr(long n){
        while(n%2==0){
            pam.put(2l,pam.getOrDefault(2l,0)+1);
            n/=2;
        }
        for(long i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                pam.put(i,pam.getOrDefault(i,0)+1);
                n/=i;
            }
        }

        if(n>2) pam.put(n,pam.getOrDefault(n,0)+1);

    }
    void ok(){
        pam.clear();            
        long n = nextLong();
        pr(n);
        int len=0;
        
        List<Long> res =new ArrayList<>();
        for(long i:pam.keySet()){
            if(pam.get(i)>len){
                res.clear();
                if(pam.get(i)==1){
                    len=1;
                    res.add(n);
                }
                else{
                    int l=pam.get(i)-1;
                    long toAdd=n/((long)Math.pow(i,l));
                    len=pam.get(i);
                    for(int j=0;j<len-1;j++) res.add(i);
                    res.add(toAdd);
                }
            }
        }
        // System.out.println(n+" "+map);
        out.println(len);
        for(long i:res){
            out.print(i+" ");
        }
        res.clear();
        out.println();
    }
    void solve(){ 
        int t=nextInt();
        while(t-->0){
           ok();
        }
        out.close();
    }
}
