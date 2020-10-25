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
            int n=nextInt(),m=nextInt();
            int rows[][]=new int[n][m];
            Map<Integer,Integer> map =new HashMap<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++){
                    rows[i][j]=nextInt();
                    map.put(rows[i][j],i);
                }
            }
            int cols[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    cols[i][j]=nextInt();
                }
            }
            // System.out.println(map);
            for(int i=0;i<n;i++){
                int curr = cols[0][i];
                int idx = map.get(curr);
                for(int j=0;j<m;j++){
                    out.print(rows[idx][j]+" ");
                }
                out.println();
            }

        }
        out.close();
    }
}
