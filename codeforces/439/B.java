import java.util.*;
public class Solution {
public static void main(String [] args){
Scanner in = new Scanner(System.in);
int n=in.nextInt();
long x=in.nextLong();
Long array[]=new Long[n];
for(int i=0;i<n;i++){
array[i]=in.nextLong();
}
Arrays.sort(array);
long sum=0;
for(int i=0;i<n;i++){
sum+=x*array[i];
if(x>1)
x--;
}
System.out.print(sum);
}
}