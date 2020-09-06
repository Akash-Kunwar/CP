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
            int n=Integer.parseInt(sc.next());
            int k=Integer.parseInt(sc.next());

            char arr[]=sc.next().toCharArray();
            boolean flag=true;
            char str[]=new char[k];

            for(int i=0;i<k;i++){
                str[i]=arr[i];
            }

            for(int i=k;i<n;i++){
                if(str[i%k]=='?'){
                    str[i%k]=arr[i];
                }
                else if(arr[i]=='?'){
                    continue;
                }
                else if(arr[i]!=str[i%k]){
                    flag=false;
                    break;
                }
            }

            if(flag){
                int zero=0,one=0,q=0;
                for(int i=0;i<k;i++){
                    if(str[i]=='0') zero++;
                    else if(str[i]=='1') one++;
                    else q++;
                }
                // out.println(zero+" "+one+" "+q);
                if(zero==one){
                    out.println("YES");
                }
                else if(zero<one && zero+q>=one){
                    out.println("YES");
                }
                else if(zero>one && one+q>=zero){
                    out.println("YES");
                }
                else{
                    out.println("NO");
                }
                // out.println(Arrays.toString(str));
            }
            else{
                out.println("NO");
            }
            
        }        
        out.close();
    }
    
}





