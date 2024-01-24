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
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y1= sc.nextInt();
            int Y2 = sc.nextInt();
            int K = sc.nextInt();
            
            
            long count1 = 0;
            long count2 = 0;
            
            count1 = H/X;
            if(H%X != 0) count1++;
            
            if(H > K*Y1) {
                count2 = K+ ((H-(K*Y1))/Y2);
                long rem = (H-(K*Y1)-(((H-(K*Y1))/Y2)*Y2));
                if(rem%Y2 != 0) count2++;
            }
            else if(H <= K*Y1){
                count2 = H/Y1;
                if(H%Y1 != 0) count2++;
            }
            
            System.out.println(Long.min(count1,count2));
            
            
        }
	}
}
