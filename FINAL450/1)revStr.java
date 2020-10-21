import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        

        while(t-- >= 0) {
            String str = s.nextLine();
            helper(str);
        }
    }
    
    private static void helper(String str) {
        char[] arr = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(str.length()-1-i);
            }
            
         System.out.println(new String(arr));
 }
}