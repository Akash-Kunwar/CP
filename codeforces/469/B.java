import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();
        Set<Integer> set =new HashSet<>(),time=new HashSet<>();
        for(int i=l;i<=r;i++) time.add(i);
        for(int i=0;i<n;i++){
            int p=sc.nextInt(),q=sc.nextInt();
            for(int j=p;j<=q;j++) set.add(j);
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            int p=sc.nextInt(),q=sc.nextInt();
            for(int j=l;j<=r;j++){
                for(int k=p;k<=q;k++){
                    if(set.contains(j+k) && time.contains(j)){
                        cnt++;
                        time.remove(j);
                        break;
                    }
                    if(set.contains(k+j) && time.contains(j)){
                        cnt++;
                        time.remove(j);
                        break;
                    }
                }
            }
        }
        out.println(cnt);
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