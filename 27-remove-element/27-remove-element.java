class Solution {
    public int removeElement(int[] nums, int val) {
        int removedCount=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == val) {
				nums[i] = 51;
				removedCount++;
			}
		}
		
		Arrays.sort(nums);
		
		return nums.length-removedCount;
    }
}