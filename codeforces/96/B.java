import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{ 
    static List<Long> list =new ArrayList<>(); 
    static void ok(int four,int seven,long num){
        if(four==0 && seven==0){
            list.add(num);return;
        }
        if(four>0){
            ok(four-1,seven,num*10+4);
        }
        if(seven>0){
            ok(four,seven-1,num*10+7);
        }
    }
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        for(int i=1;i<=5;i++) ok(i,i,0);
        long num=sc.nextInt();
        Collections.sort(list);
        for(Long i:list){
            if(i>=num){
                out.println(i);
                break;
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
    long nextLong(){return Long.parseLong(next());}
}