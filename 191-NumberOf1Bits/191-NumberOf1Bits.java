// Last updated: 09/07/2026, 09:49:01
class Solution {
    public int hammingWeight(int n) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        while(n!=0)
        {
            if((n&1)==1)
            {
                c++;
            }
            n>>=1;
        
        }
        return c;
    }
}