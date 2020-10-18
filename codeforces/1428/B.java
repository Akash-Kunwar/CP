import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
    PrintWriter out =new PrintWriter(System.out);
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
    public static void main(String[] args) {
        new Codeforces().solve();
    }
    void solve(){
        int t=nextInt();
        while(t-->0){
            int n=nextInt();
            char arr[]=next().toCharArray();
            boolean flag=true;
            boolean left =false,right=false;
            for(int i=0;i<n;i++){
                if(arr[i]=='<' && left){
                    flag=false;
                    break;
                }
                if(arr[i]=='>' && right)
                {
                    flag=false;
                    break;
                }
                if(arr[i]=='<'){
                    right=true;
                }
                if(arr[i]=='>'){
                    left=true;
                }
            }

            if(flag) out.println(n);
            else{
                
                Set<Integer> set =new HashSet<>();
                for(int i=0;i<n;i++){
                    if(arr[i]=='-')
                    {
                        set.add(i);
                        set.add((i+1+n)%n);
                    }
                }
                // out.println(set);
                out.println(set.size());
            }


        }
        out.close();
    }
}
