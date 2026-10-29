class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    a=i;
                    b=j;
                    break;
                }else{
                    continue;
                }
            }
        }
        return new int[]{a,b};
    }
}
