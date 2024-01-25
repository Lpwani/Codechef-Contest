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
            double P = sc.nextDouble();
            double L = sc.nextDouble();
            
            double percentage = ((double)L/P)*100;
            if(percentage >= 75){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
