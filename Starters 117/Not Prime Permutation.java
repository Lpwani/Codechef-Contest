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
            int arr[] = new int[N];
            for(int i = 0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            if(N==1 || N==2){
                System.out.print(-1);
            }
            else{
                int odd = 1;
                int even = 2;
                boolean oddOperation = false;
                for(int i = 0;i<N;i++){
                    if(arr[i] == 1 && odd == 1){
                        System.out.print(3+" ");
                        odd = 1;
                        oddOperation = true;
                    }
                    else if(arr[i]%2 == 1){
                        if(oddOperation == true){
                            System.out.print(odd+" ");
                            odd+=4;
                            oddOperation = false;
                        }
                        else{
                            System.out.print(odd+" ");
                            odd+= 2;
                        }
                    }
                    else{
                        System.out.print(even+" ");
                        even += 2;
                    }
                }
            }
            System.out.println();
        }
	}
}
