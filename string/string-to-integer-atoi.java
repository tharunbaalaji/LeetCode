class Solution {
    public int myAtoi(String s) {
         String num="";
        int i=0;
        while(i<s.length()&&s.charAt(i)==' ')
        {
            i++;
        }
        for(;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c)||(num.equals("") &&(c=='+'||c=='-')))
            {
                num+=c;
            }
            else
            {
                break;
            }
        }
        if(num.equals("")||num.equals("+")||num.equals("-"))
        {
            return 0;
        }
        else
        {
            int ans=Integer.parseInt(num);
            return ans;
            
        }
        

    }
}