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
            
            int smlNrPow2 = (1 << (maxBitPos - 1));
            
            // System.out.println(maxBitPos);
            
            int count = maxBitPos - 2;
            boolean fndSecMsb = false;   // Here we are implementing a flag for second most significant bit...
            int ans = 1;
            while(count >= 0){
                if((X&(1<<count)) != 0){
                    fndSecMsb = true;
                }
                else{
                    if(fndSecMsb == true){
                        ans *= 2;
                    }
                }
                count--;
            }
            System.out.println(ans);
		}
	}
}
