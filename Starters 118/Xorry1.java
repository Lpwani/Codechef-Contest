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
            int X = sc.nextInt();
        
            int maxBitPos = 0;
            while((1 << maxBitPos) <= X){
                maxBitPos++;
            }
            
            int msb = (1 << (maxBitPos-1));    // from msb we are finding the most nearest but smallest power of 2.
            
            int a = msb;
            int b = X^a;
            
            System.out.println(b+" "+a);
        }
	}
}
