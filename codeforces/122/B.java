import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        char str[]=sc.next().toCharArray();
        int c7=0,c4=0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='7') c7++;
            if(str[i]=='4') c4++;
        }
        if(c4==0 && c7==0) out.println(-1);
        else if(c4>=c7) out.println(4);
        else out.println(7);
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