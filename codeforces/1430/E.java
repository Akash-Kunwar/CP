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
        int n=nextInt();
        char line[]=next().toCharArray();
        Pos orig []=new Pos[n];
        for(int i=0;i<n;i++) orig[i]=new Pos(line[i]);
        ArrayDeque<Integer> positionOf [] =new ArrayDeque[26];
        for(int i=0;i<26;i++) positionOf[i]=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            int val=line[n-i-1]-'a';
            positionOf[val].addLast(i);
        }
        for(int i=0;i<n;i++){
            orig[i].finalPos=positionOf[orig[i].value-'a'].removeFirst();
        }
        BIT bit =new BIT(n);
        long inv=0;
        for(int i=n-1;i>=0;i--){
            inv+=bit.read(orig[i].finalPos);
            bit.update(orig[i].finalPos,1);
        }
        out.println(inv);
        out.close();
    }
}
class Pos{
    int finalPos;
    char value;
    Pos(char value){
        this.value=value;
    }
}

class BIT {
    int n;
    int[] tree;
    
    public BIT(int n) {
        this.n = n;
        tree = new int[n + 2];
    }
    
    int read(int i) {
        i++;
        int sum = 0;
        while (i > 0) {
            sum += tree[i];
            i -= i & -i;
        }
        return sum;
    }
    
    void update(int i, int val) {
        i++;
        while (i <= n) {
            tree[i] += val;
            i += i & -i;
        }
    }
    
}