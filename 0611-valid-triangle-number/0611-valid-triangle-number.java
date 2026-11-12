class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for(int i = n - 1; i >= 2; i--){
            int left = 0;
            int right = i - 1;
            while(left < right){
            long sum = (long) nums[left] + nums[right];
            if(sum > nums[i]){
                count += right - left;
                right--;
            }else{
                left++;
            }
        }
        }
        return count;
    }
}