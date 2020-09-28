import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),t=sc.nextInt();
        int max=0,min=0;
        List<Pair> arr =new ArrayList<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt(),y=sc.nextInt();
            max+=y;min+=x;
            arr.add(new Pair(y,x));
            res[i]=y;
        }
        if(max<t || min>t){
            out.println("NO");
            out.close();
            return;
        }
        out.println("YES");
        int rem=max-t;
        for(int i=0;i<n;i++){
            if(rem==0)break;
            int z=Math.min(rem,arr.get(i).x-arr.get(i).y);
            res[i]-=z;
            rem-=z;
        }
        for(int i:res){
            out.print(i+" ");
        }
        out.close();
    }
}
class Pair{
    int x=0,y=0;
    Pair(int a,int b){
        this.x=a;
        this.y=b;
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
}