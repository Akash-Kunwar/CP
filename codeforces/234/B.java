import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(new File("output.txt"));
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(new Pair(i+1,x));
        }
        Collections.sort(arr,(a,b)->{
            return b.val-a.val;
        });
        out.println(arr.get(k-1).val);
        for(int i=0;i<k;i++){
            out.print(arr.get(i).idx+" ");
        }
        out.close();
    }
}
class Pair{
    int idx=-1,val=-1;
    Pair(int idx,int val){
        this.idx=idx;
        this.val=val;
    }
}
class FastScanner {
    BufferedReader br;
    StringTokenizer st =new StringTokenizer("");
    FastScanner() throws Exception{
        br=new BufferedReader(new FileReader("input.txt"));
    }
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