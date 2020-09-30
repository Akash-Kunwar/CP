import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        Map<Character,String> map=new HashMap<>();
        map.put('>',"1000");
        map.put('<',"1001");
        map.put('+',"1010");
        map.put('-',"1011");
        map.put('.',"1100");
        map.put(',',"1101");
        map.put('[',"1110");
        map.put(']',"1111");
        char ip[]=sc.next().toCharArray();
        StringBuilder x=new StringBuilder();
        for(int i=0;i<ip.length;i++){
            x.append(map.get(ip[i]));
        }
        long mod=1000003,res=0;
        for(int i=x.length()-1;i>=0;i--){
            char a=x.charAt(i);
            if(a=='1'){
                int p=x.length()-i-1;
                long ttl=1;
                for(int j=0;j<p;j++){
                    ttl=(ttl*2)%mod;
                }
                res=(res+ttl)%mod;
            }
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
}