class Solution {
    public int removeDuplicates(int[] nums) {
        
        int size=0;
		
		for(int n : nums) {
			if(nums[size] < n) {
				nums[++size] = n;
			}
		}
		
		return size+1;
    }
}