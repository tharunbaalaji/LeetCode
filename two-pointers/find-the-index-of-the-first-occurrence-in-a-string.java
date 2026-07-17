class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==1)
        {
            return 0;
        }
        if(needle.length()==1)
        {
            for(int i=0;i<haystack.length();i++)
            {
                if(needle.equals(haystack.charAt(i)))
                {
                    return i;
                }
            }
        }
        
          for(int i=0;i<haystack.length()-needle.length();i++)
          {
            int j=0;
            while(j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==needle.length())
            {
                return i;
            }
          }
          return -1;
    }
}