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
    void ok(){
        int n = nextInt(), k = nextInt();
        char arr[] = next().toCharArray();
        char brr[] = next().toCharArray();

        int a1[] = new int[27],a2[] = new int[27];

        for(char c:arr){
            a1[c-'a']++;
        }
        for(char c:brr){
            a2[c-'a']++;
        }

        // out.println(Arrays.toString(a1));
        // out.println(Arrays.toString(a2));

        for(int i=0;i<26;i++){
            if(a1[i]<a2[i]){
                out.println("NO");
                return;
            }
            else if(a1[i]!=a2[i]){
                if((a2[i]-a1[i])%k!=0){
                    out.println("NO");
                    return;
                }
                else{
                    int diff=a2[i]-a1[i];
                    a2[i+1]+=diff;
                }
            }
        }

        out.println("YES");


    }
    void solve(){ 
        int t = nextInt();
        while(t-->0) ok();
        out.close();
    }
}
