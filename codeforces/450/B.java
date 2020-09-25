import java.util.*;
 
public class sequence 
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	long  x = sc.nextLong();
	long  y = sc.nextLong();
	long  n = sc.nextLong();
	long v[] = {x,y,y-x,-1*x,-1*y,x-y};
	n--;
	long M = 1000000007;
	System.out.print(((v[(int)n%6]%M) +M)%M);
	
	}
}