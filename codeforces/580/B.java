import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner in =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        long d=in.nextLong();
        List<Pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(in.nextLong(),in.nextLong()));
        }
        Collections.sort(arr,new cmp());
        // for(Pair p:arr){
        //     out.println(p.m+" "+p.s);
        // }
        int j=0;
        long res=Long.MIN_VALUE,tmp=0;
        for(int i=0;i<n;i++){
            while(j<n && arr.get(j).m-arr.get(i).m<d){
                tmp+=arr.get(j).s;
                j++;
            }
            res=Math.max(res,tmp);
            tmp-=arr.get(i).s;
        }
        out.println(res);
        out.close();

    }
}

class FastScanner{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
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
}    
class Pair{
    long m=0,s=0;
    Pair(long m,long s){
        this.m=m;
        this.s=s;
    }
}
class cmp implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        return (int)(a.m-b.m);
    }
}