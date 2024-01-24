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
            sc.nextLine();
            String S = sc.nextLine();
            
            int remChar = -1;
            for(int i = 0;i<S.length()-1;i++){
                String currchar = S.charAt(i)+"";
                String currcharOne = S.charAt(i+1)+"";
                
                if(currchar.compareTo(currcharOne) > 0){
                    remChar = i;
                    break;
                }
            }
            
            if(remChar == -1){
                System.out.println(S.substring(0,S.length()-1));
            }
            else{
                if(remChar == 0){
                    System.out.println(S.substring(1));
                }
                else{
                    System.out.println(S.substring(0,remChar)+""+S.substring(remChar+1));    
                }
            }
        }
	}
}
