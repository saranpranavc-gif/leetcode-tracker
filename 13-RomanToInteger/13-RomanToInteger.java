// Last updated: 09/07/2026, 09:49:44
class Solution {
    public int romanToInt(String s)
     {
        int result = 0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c == 'I'){
                result += 1;
            }
            else if(c == 'V')
            {
                result += 5;
            }
            else if(c == 'X')
            {
                result += 10; 
            }
            else if(c == 'L')
            {
                result += 50;
            }
            else if(c == 'C')
            {
                result += 100;
            }
            else if(c == 'D')
            {
                result += 500;
            }
            else if (c == 'M')
            {
                result += 1000;
            }
       }
       if(s.contains("IV") || s.contains("IX")) result -= 2;
       if(s.contains("XL") || s.contains("XC")) result -= 20;
       if(s.contains("CD") || s.contains("CM")) result -= 200;

       return result;
    }
}