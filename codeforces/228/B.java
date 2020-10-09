import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{ 
    public static void main(String[] args) {
        FastScanner sc =new FastScanner();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt(),m=sc.nextInt();
        char arr[][] =new char[n][m];
        for(int i=0;i<n;i++){
            String temp=sc.next();
            for(int j=0;j<m;j++){
                arr[i][j]=temp.charAt(j);
            }
        }
        int p=sc.nextInt(),q=sc.nextInt();
        char brr[][] =new char[p][q];
        for(int i=0;i<p;i++){
            String temp=sc.next();
            for(int j=0;j<q;j++){
                brr[i][j]=temp.charAt(j);
            }
        }
        int res=0,resX=-1,resY=-1;
        for(int x=-n;x<=p;x++){
            for(int y=-m;y<=q;y++){
                int t=0;
                // out.println("1");
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        if(i+x>=0 && j+y>=0 && i+x<p && j+y<q && arr[i][j]==brr[i+x][j+y] && arr[i][j]=='1'){
                            t++;
                            // out.println(i+" "+j+" "+(i+x)+" "+(j+y));

                        }
                    }
                }
                if(t>res){
                    res=t;
                    resX=x;
                    resY=y;
                }
            }
        }

        out.println(resX+" "+resY+" "+" ");
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