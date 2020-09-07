import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{   
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String args[]) throws Exception
    {
        int t=Integer.parseInt(sc.next());
        while(t-->0){
            String str=sc.next();
            if(str.length()<=2){
                out.println(str);
            }
            else{
                boolean flag=true;
                for(int i=1;i<str.length();i++){
                    if(str.charAt(i)!=str.charAt(i-1)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    out.println(str);
                }
                else{
                    String ans=""+str.charAt(0);
                    for(int i=1;i<str.length();i++){
                        if(str.charAt(i)!=str.charAt(i-1)){
                            ans+=str.charAt(i);
                        }
                        else{
                            if(str.charAt(i)=='1') ans+='0';
                            else ans+='1';
                            ans+=str.charAt(i);
                        }
                    }
                    out.println(ans);
                }
            }
        }
        out.close();
    }
}


