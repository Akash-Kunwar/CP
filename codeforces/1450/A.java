import java.util.*;
import java.io.*;
import java.lang.*;
public class Codeforces2{ 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=1;
        t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[26];
            char tr[]=sc.next().toCharArray();
            // System.out.println(Arrays.toString(str));
            for(char c:tr){
                arr[c-'a']++;
            }
            StringBuilder res=new StringBuilder();
            for(int i=25;i>=0;i--){
                for(int j=0;j<arr[i];j++){
                    res.append((char)('a'+i));
                }
            }
            System.out.println(res);
        }
    }
}

