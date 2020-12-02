import java.util.*;
 
public class practice1 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long l=scn.nextLong();
		long r=scn.nextLong();
		long[] ln=new long[1025];
		ln[0]=ln[1]=0;
		for(int i=2;i<=1024;i++){
			if((i&1)>0){
				ln[i]=10*ln[i/2]+7;
			}
			else{
				ln[i]=10*ln[i/2]+4;
			}
		}
		int c=2;
		while(l>ln[c]){
			c++;
		}
		long sum=0;
		while(l<=r){
			sum=sum+ln[c]*(Math.min(ln[c],r)+1-l);
			l=ln[c]+1;
			c++;
		}
		System.out.println(sum);
	}
}