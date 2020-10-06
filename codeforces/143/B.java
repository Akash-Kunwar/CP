import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        StringBuilder out=new StringBuilder();
        String s=sc.next();
        String str[]=new String[2];
        int i=0;
        str[0]="";
        str[1]="";
        while( i<s.length() && s.charAt(i)!='.' ){
            str[0]+=s.charAt(i);
            i++;
        }
        i++;
        while(i<s.length()){
            str[1]+=s.charAt(i);
            i++;
        }

        int count=1;
        out.append('$');
        StringBuilder st=new StringBuilder();
        for(i=str[0].length()-1;i>=0;i--){
            if(str[0].charAt(i)=='-') continue;
            st.append(str[0].charAt(i));
            if(count%3==0 && !(i==0||(i==1 && str[0].charAt(i-1)=='-'))){
                st.append(',');
            }
            count++;
        }
        out.append(st.reverse());
        out.append(".00");
        for(i=0;i<str[1].length() && i<2;i++){
            out.setCharAt(out.length()-2+i,str[1].charAt(i));
        }
        if(str[0].charAt(0)=='-'){
            System.out.println("("+out+")");
        }
        else{
            System.out.println(out);
        }
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