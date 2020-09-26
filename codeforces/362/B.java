import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        long n=sc.nextLong();
        int m=sc.nextInt();
        List<Long> arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            arr.add(sc.nextLong());
        }
        Collections.sort(arr);
        if(n==1){
            if(m==1)out.println("NO");
            else out.println("YES");
        }
        else if(m==0){
            out.println("YES");
        }
        else{
            long s=arr.get(0),e=arr.get(m-1);
            if(s==1 || e==n){
                out.println("NO");
            }
            else{
                boolean flag=false;
                for(int i=2;i<m;i++){
                    long x=arr.get(i-2),y=arr.get(i-1),z=arr.get(i);
                    if(y-x==1 && z-y==1){
                        flag=true;
                        break;
                    }
                }
                out.println(flag?"NO":"YES");
            }
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
    long nextLong(){
        return Long.parseLong(next());
    }
}