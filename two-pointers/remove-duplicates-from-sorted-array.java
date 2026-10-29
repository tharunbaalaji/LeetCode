class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            boolean isduplicate=false;
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j])
                {
                  isduplicate=true;
                  break;
                }
            }
            if(!isduplicate)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
}
}