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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int n=nextInt();
        Map<String,Integer> map = new HashMap<>();
        while(n-->0){
            String str = next();
            String st=str;
            if(map.containsKey(str)){
                
                while(true){
                    int x = map.get(str)+1;
                    String s =str + Integer.toString(x);
                    if(map.containsKey(s)){
                        continue;
                    }
                    else{
                        map.put(s,0);
                        map.put(st,map.getOrDefault(st,0)+1);
                        out.println(s);
                        break;
                    }
                }
            }
            
            else{
                map.put(str,0);
                out.println("OK");
            }
        } 
        
        out.close();
    }
}
