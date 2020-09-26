import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> arr=new ArrayList<>();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            map.put(a,map.getOrDefault(a,0)+1);
            List<Integer> temp=new ArrayList<>();
            temp.add(a);temp.add(b);
            arr.add(temp);
        }
        int n=arr.size();
        for(int i=0;i<arr.size();i++){
            int home=(n-1),away=(n-1);
            int x=map.getOrDefault(arr.get(i).get(1),0);
            out.println((home+x)+" "+(away-x));
        }
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
}