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
            int n = nI();
            int temp[] = new int[110];
            for(int i=0;i<n;i++){
                temp[nI()]++;
            }
            if(temp[0]>=2){
                int res=0,i=0;
                for(int j=0;j<2;j++){
                    for(i=0;i<110;i++){
                        if(temp[i]==0){
                            res+=i;
                            break;
                        }
                        temp[i]--;
                    }
                }
                out.println(res);
            }
            else if(temp[0]==1){
                int i=0;
                for(i=0;i<110;i++){
                    if(temp[i]==0){
                        break;
                    }
                }
                out.println(i);
            }
            else{
                out.println(0);
            }
        }
        out.close();
    }
}
