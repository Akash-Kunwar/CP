import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    
    public static void main(String[] args) throws Exception{
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        char str[]=sc.next().toCharArray();
        char max='0';
        int idx=-1;
        for(int i=0;i<str.length;i++){
            if((str[i]-'0')%2==0){
                idx=i;
                if(str[i]<str[str.length-1]){
                    break;
                }
            }
        }
        if(idx==-1){
            out.println(-1);
        }else{
            char temp=str[str.length-1];
            str[str.length-1]=str[idx];
            str[idx]=temp;
            out.println(new String(str));
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
    int nI(){
        return Integer.parseInt(next());
    }
}