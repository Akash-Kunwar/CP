import java.util.*;
import java.io.*;
import java.lang.*;
public class codeforces2{ 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = 1;
        t=sc.nextInt();
        for(int tt=0;tt<t;tt++){
            int n =sc.nextInt();
            char str1[]=sc.next().toCharArray();
            char str2[]=sc.next().toCharArray();
           
            int f=0;
            for(int i=0;i<n;i++){
                if(str1[i]>str2[i])f++;
                if(str1[i]<str2[i])f--;
            }
            if(f>0)
            {
                System.out.println("RED");
            }
            else if(f<0){
                System.out.println("BLUE");
            }
            else{
                System.out.println("EQUAL");
            }
            // set1.clear();
            // set2.clear();
        }
    }
}

