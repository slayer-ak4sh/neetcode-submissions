class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);
        int n = nums.length;

        int mx=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) continue;

            int a = nums[i]+1;
            if(a==nums[i+1]){
                count++;
            }else{
                mx = Math.max(mx,count);
                count=0;
            }
        }
        mx = Math.max(mx,count);
        return mx+1;
    }
}
