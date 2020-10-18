// Java implementation of the approach 
class GFG 
{ 
	
// Function to return the minimum number 
// of trials needed in the worst case 
// with n eggs and k floors 
static int eggDrop(int n, int k) 
{ 
	int dp[][] = new int [k + 1][n + 1]; 

	int x = 0; 

	// Fill all the entries in table using 
	// optimal substructure property 
	while (dp[x][n] < k) 
	{ 

		x++; 
		for (int i = 1; i <= n; i++) 
			dp[x][i] = dp[x - 1][i - 1] + 
					dp[x - 1][i] + 1; 
	} 

	// Return the minimum number of moves 
	return x; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int n = 2, k = 36; 

	System.out.println( eggDrop(n, k)); 
} 
} 

