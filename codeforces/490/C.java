import java.util.*;
import java.io.*;
public class C279 {
    public static void main(String args[]) throws IOException
    {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int a = cin.nextInt();
        int b = cin.nextInt();
        int l = s.length();
        long rema[] = new long [l + 1];
        for(int i = 0; i < l; i++)
            rema[i] = -1;
        long base = 1, tmp = 0;
        for(int i = l - 1; i >= 0; i--)
        {
            tmp = (tmp + (s.charAt(i) - '0') * base) % b;
            rema[i] = tmp;
            base = (base * 10) % b;
        }
        
        tmp = 0;
        for(int i = 0; i < l - 1; i++)
        {
            tmp = (tmp * 10 + (s.charAt(i) - '0')) % a;
            if(tmp == 0 && rema[i + 1] == 0 && s.charAt(i + 1) != '0')
            {
                System.out.println("Yes");
                System.out.println(s.substring(0, i + 1));
                System.out.println(s.substring(i + 1, l));
                return;
            }
        }
        System.out.println("NO");
        cin.close();
    }

}
