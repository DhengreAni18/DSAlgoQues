//Minimum Insertion Steps to Make a String Palindrome

class Solution {
public:
    // main function
    int minInsertions(string s) 
    {
        return helper(s,0,s.size()-1);
    }
    
    //helper function
    int helper(string s,int i,int j)
    {
        int n=s.size();
        vector<vector<int>>dp(n,vector<int>(n,0));
        
        for(int len=1;len<=n;len++)
        {
            for(int i=0,j=len;j<n;i++,j++)
            {
                dp[i][j]=(s[i]==s[j])?dp[i+1][j-1] : 1+min(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][n-1];
    }
    
};
