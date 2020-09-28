import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        List<Pair> arr=new ArrayList<>();
        int count=1,sum=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            if(b>0){
                count--;
                sum+=a;
                count+=b;
                continue;
            }
            arr.add(new Pair(a,b));
        }
        Collections.sort(arr,new cmp());
        for(int i=0;i<arr.size() && count>0;i++){
            count--;
            sum+=arr.get(i).a;
        }
        out.println(sum);
        out.close();
    }
}
class Pair{
    int a=0,b=0;
    Pair(int x,int y){
        a=x;
        b=y;
    }
}
class cmp implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        return b.a-a.a;
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