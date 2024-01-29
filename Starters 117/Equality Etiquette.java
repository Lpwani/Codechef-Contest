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
            int A = sc.nextInt();
            int B = sc.nextInt();

            int diff = Math.abs(B-A);

            long low = 0, high = diff;

            long n = 0;
            boolean gotAns = false;     // flag for checking if we get the mid such that sum of 1 to mid natural number is equal to diff...

            while(low <= high) {
                long mid = (low + high) / 2;
                if (((mid * (mid + 1)) / 2) <= diff) {
                    low = mid + 1;
                    n = mid;
                } else {
                    high = mid - 1;
                }
            }

            if(diff == ((n*(n+1)/2))){       // checking for n
                System.out.println(n);
                continue;
            }

            n++;
            long sum = ((n*(n+1))/2);
            if((sum - diff)%2 == 0){       // checking for n+1
                System.out.println(n);
                continue;
            }

            n++;
            sum = ((n*(n+1))/2);
            if((sum-diff)%2 == 0){       // checking for n+2
                System.out.println(n);
                continue;
            }

            n++;
            System.out.println(n);
        }
	}
}
