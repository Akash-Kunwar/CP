    import java.util.*;
    import java.io.*;
    import java.lang.*;
    public class Main{ 
        public static void main(String[] args) {
            FastScanner sc =new FastScanner();
            PrintWriter out=new PrintWriter(System.out);
            int n=sc.nextInt(),k=sc.nextInt();
            int arr[]=new int[2*n+1];
            for(int i=0;i<k;i++){
                out.print(2*i+2+" ");
                out.print(2*i+1+" ");
            }
            for(int i=k;i<n;i++)
            {
                out.print(2*i+1+" ");
                out.print(2*i+2+" ");
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
        int nextInt(){
            return Integer.parseInt(next());
        }
    }