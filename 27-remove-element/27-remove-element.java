class Solution {
    public int removeElement(int[] nums, int val) {
        int removedCount=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == val) {
				removedCount++;
			} else {
				nums[i-removedCount] = nums[i];
			}
		}
		
		return nums.length-removedCount;
    }
}