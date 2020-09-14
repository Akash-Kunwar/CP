import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{       
    static Scanner sc =new Scanner(System.in);
    static PrintWriter out =new PrintWriter(System.out); 
    static int nI(){
        return Integer.parseInt(sc.next());
    }
    static long nL(){
        return Long.parseLong(sc.next());
    } 
   
    public static void main(String args[]) throws Exception{
        int t= nI();
        while(t-->0){
            long a=nL(),b=nL(),c=nL();
            // (x-1/a-1)
            long x=b*c+c;
            x--;
            // out.println(x);
            long res=(long)(x)/(a-1);
            if(x%(a-1)!=0){
                res++;
            }
            out.println(res+c);
            
            
        }
        out.close();
    }
}

