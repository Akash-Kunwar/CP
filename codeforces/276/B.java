import java.util.*;

import javax.swing.JComponent.AccessibleJComponent;

import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        char str[]=sc.next().toCharArray();
        int alpha[]=new int[26];
        for(int i=0;i<str.length;i++){
            alpha[str[i]-'a']++;
        }
        // i%2==0 first
        int i=0;
        for(i=0;i<str.length;i++){
            int even=0,odd=0,idx=-1;
            for(int j=0;j<26;j++){
                if(alpha[j]%2==0) even++;
                else{
                    odd++;
                    idx=j;
                }
            }
            if(odd<=1)break;
            alpha[idx]--;
        }
        out.println(i%2==0?"First":"Second");
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