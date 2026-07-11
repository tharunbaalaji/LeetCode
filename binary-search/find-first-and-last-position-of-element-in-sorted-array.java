class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end=-1;
        if(nums.length==1)
        {
            for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                start=i;
                break;
            }

        }
          end=start;
        }
        else
        {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                start=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target && i!=start)
            {
                end=i;
            }
        }
        }
        int []result=new int[2];
        result[0]=start;
        result[1]=end;
        return result;
    }
}