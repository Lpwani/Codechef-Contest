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
            int M = sc.nextInt();

            int arr[] = new int[N];
            for(int i = 0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            
            // First approach (using inner loop for enhancing your nested loop concept)
            for(int i = 0;i<N;i++){
                long sum = 0;
                if(arr[i] >= M){
                    count++;
                }
                else{
                    while(sum < M && i < N) {
                        if (arr[i] < M) {
                            sum += arr[i];
                            i++;
                            if(sum >= M){
                            count++;
                            i--;
                            }
                        } else if (arr[i] >= M) {
                            sum += arr[i];
                            count++;
                            break;
                        }
                        
                    }    
                }
                
            }
            System.out.println(count);
            
            
            // second approach
            int currSum = 0;
            for(int i=0;i<N;i++){
                currSum += arr[i];
                if(currSum >= M){
                    count++;
                    currSum = 0;
                }
            }
            System.out.println(count);
        }
	}
}
