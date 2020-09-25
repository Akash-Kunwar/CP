    import java.util.*;
    import java.io.*;
    import java.lang.*;
    public class Main{ 
        
        public static void main(String[] args) throws Exception{
            FastScanner sc =new FastScanner();
            PrintWriter out=new PrintWriter(System.out);
            long r=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
            int d=(int)Math.ceil(Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)))/(2*r));
            out.println(d);       
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