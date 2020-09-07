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
            long x = Long.parseLong(sc.next());
            long y = Long.parseLong(sc.next());
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());

            if(a*2<=b){
                out.println(x*a+y*a);
            }
            else{
                if(x>=0 && y>=0){
                    long temp=Math.min(x,y);
                    out.println(temp*b+(x-temp)*a+(y-temp)*a);
                }
                else if(x<=0 && y<=0){
                    x=-x;y=-y;
                    long temp=Math.min(x,y);
                    out.println(temp*b+(x-temp)*a+(y-temp)*a);
                }
                else{
                    out.println(x*a+y*a);
                }
            }

        }
        out.close();
    }
}


