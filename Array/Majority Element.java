class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maj = n/2;
        int val = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            int el = nums[i];
            if(el==nums[i])count++;
            if(count>maj) val= nums[i];
        } return val;
    }
}
