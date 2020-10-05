import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{ 
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner((new FileReader("input.txt")));
		FileWriter out = new FileWriter("output.txt");
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(new Pair(i+1,x));
        }
        Collections.sort(arr,(a,b)->{
            return b.val-a.val;
        });
        out.write(arr.get(k-1).val+"\n");
        for(int i=0;i<k;i++){
            out.write(arr.get(i).idx+" ");
        }
        out.close();
    }
}
class Pair{
    int idx=-1,val=-1;
    Pair(int idx,int val){
        this.idx=idx;
        this.val=val;
    }
}
// class FastScanner {
//     BufferedReader br =new BufferedReader(new FileReader("input.txt"));
//     StringTokenizer st =new StringTokenizer("");
//     String next(){
//         if(!st.hasMoreTokens()){
//             try{
//                 st=new StringTokenizer(br.readLine());
//             }
//             catch(Exception e){    
//             }
//         }
//         return st.nextToken();
//     }
//     int nextInt(){
//         return Integer.parseInt(next());
//     }
// }