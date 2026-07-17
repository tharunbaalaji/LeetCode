class Solution {
    public int findDuplicate(int[] nums) {
        boolean found=false;
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    num=nums[i];
                    found=true;
                    break;
                }
            }
            if(found==true)
            {
                break;
            }
        }
        return num;
    }
}