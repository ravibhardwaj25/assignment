class CountandSay
{
 
    // Returns n'th term in
    // look-and-say sequence
    static String countndSay(int n)
    {
    // Base cases
    if (n == 1)
    return "1";
    if (n == 2)
    return "11";
     
    // Initialize previous term
    String str = "11";
    for (int k = 3; k <= n; k++)
    {
        
        str += '$';
        int len = str.length();
 
        int cnt = 1; // Initialize count
                     // of matching chars
        String tmp = ""; // Initialize i'th
                         // term in series
        char []arr = str.toCharArray();
         
        // Process previous term
        // to find the next term
        for (int j = 1; j < len; j++)
        {
            // If current character
            // doesn't match
            if (arr[j] != arr[j - 1])
            {
                tmp += cnt + 0;
 
                // Append str[j-1]
                tmp += arr[j - 1];
 
                // Reset count
                cnt = 1;
            }
 
            // If matches, then increment
            // count of matching characters
            else cnt++;
        }
 
        // Update str
        str = tmp;
    }
 
    return str;
    }
     
    // Driver Code
    public static void main(String[] args)
    {
        int N = 4;
        System.out.println(countndSay(N));
    }
}
