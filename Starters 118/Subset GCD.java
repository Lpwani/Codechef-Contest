import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int ans = N/K;
            int result = ans;
            while(K-- > 0){
                System.out.print(result+" ");
                result+=ans;
            }
            
            System.out.println();
        }
	}
}
