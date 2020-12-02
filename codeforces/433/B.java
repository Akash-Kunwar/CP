import java.io.*;
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  long[] a=new long[n+1];
	  long[] b=new long[n+1];
	  long c=0;
	for(int i=0;i<n;i++){
	   int v=sc.nextInt();
	    b[i]=v;
	    c+=v;
	    a[i+1]=c;
	  }
	    Arrays.sort(b);
	    for(int i=0;i<n;i++){
	        b[i+1]+=b[i];
	    }
	  int m=sc.nextInt();
	while(m --> 0){
			int t = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
			System.out.println(t == 1?a[r]-a[l-1]:b[r]-b[l-1]);
		}
	}
}