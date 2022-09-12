class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int head = 0;
		int tail = nums.length-1;
		int mid = 0;
		
		if(nums[head] > target) {
			return head;
		} else if(nums[tail] < target) {
			return tail+1;
		}
		
		while(head <= tail) {
			mid = (head+tail) / 2;
			
			if(nums[mid] == target) return mid;
			else {
				if(nums[mid] > target) {
					if(nums[mid-1] < target) return mid;
					tail = mid-1;
				} else {
					if(nums[mid+1] > target) return mid+1;
					head = mid+1;
				}
			}
		}
		
		return mid;
    }
}