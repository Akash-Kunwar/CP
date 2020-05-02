import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        //    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
           ArrayList<Integer> arr=new ArrayList<Integer>();
           int n=sc.nextInt();
           int k=sc.nextInt();
           for(int i=0;i<n;i++){
               int curr=sc.nextInt();
                if(arr.contains(curr)){
                    continue;
                }
                else if(arr.size()<k){
                    arr.add(0,curr);
                }
                else{
                    arr.remove(arr.size()-1);
                    arr.add(0,curr);
                }
            }
            System.out.println(arr.size());
            for (int i : arr){
                System.out.print(i+" ");
            }




        

	}
}