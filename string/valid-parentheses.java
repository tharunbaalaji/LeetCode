class Solution {
    int size;
    int top=-1;
    char[]stack;
    Solution()
    {
        size=100;
        stack=new char[size];
    }
    void push(char a)
    {
        if(top==size-1)
        {
            return;
        }
        stack[++top]=a;
    }
    char pop()
    {
        if(top==-1)
        {
            return '\0';
        }
        return stack[top--];
    }
    boolean isEmpty()
    {
        if(top==-1)
        { 
          return true;
        }
        return false;
    }
    public boolean isValid(String s) {

          for(char c:s.toCharArray())
          {
             if(c=='{'||c=='['||c=='(')
             {
                push(c);
             }
             else if(c=='}'||c==']'||c==')')
             {
                if(isEmpty())
                {
                    return false;
                }
                char temp=pop();
                if((temp=='{'&&c!='}')||(temp=='['&&c!=']')||(temp=='('&&c!=')'))
                {
                    return false;
                }
              }
          }
          if(isEmpty())
          {
            return true;
          }
          return false;
    }
}