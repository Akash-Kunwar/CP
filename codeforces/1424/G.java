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
        int n=nextInt();
        List<Pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            long a=nextLong(),b=nextLong();
            arr.add(new Pair(a,true));
            arr.add(new Pair(b,false));
        }
        Collections.sort(arr,(a,b)->{

            if(a.year==b.year){
                if(a.birth) return 1;
                return -1;
            }
            return (int)(a.year-b.year);
        });

        long sum=0,res=0,year=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).birth){
                sum++;
                if(res<sum){
                    res=sum;
                    year = arr.get(i).year;
                }
            }
            else{
                sum--;
            }
        }
        out.println(year+" "+res);
        out.close();
    }
}

class Pair{
    long year;
    boolean birth;
    Pair(long year,boolean birth){
        this.year=year;
        this.birth=birth;
    }
}