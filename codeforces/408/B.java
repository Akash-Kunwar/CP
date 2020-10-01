import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        Map<Character,Integer> map=new HashMap<>();
        char ip[]=sc.next().toCharArray();
        char op[]=sc.next().toCharArray();
        for(int i=0;i<ip.length;i++)
        {   
            map.put(ip[i],map.getOrDefault(ip[i],0)+1);
        }
        boolean flag=true;
        int count=0;
        for(int i=0;i<op.length;i++){
            if(!map.containsKey(op[i])){
                flag=false;
                break;
            }
            if(map.get(op[i])>0){
                count++;
                map.put(op[i],map.get(op[i])-1);
            }
        }
        if(flag){
            out.println(count);
        }
        else{
            out.println(-1);
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