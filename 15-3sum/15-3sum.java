class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> result = new HashSet<>();
        
        if(nums.length >= 3) {
        	Arrays.sort(nums);
        	
	        for(int i = 0; i < nums.length; i++) {
	            int left = i + 1;
	            int right = nums.length - 1;
	            
	            while(left < right) {
	                int tempSum = nums[i] + nums[left] + nums[right];
	                
	                if(tempSum == 0) {
	                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
	                    left++;
	                    right--;
	                } else if (tempSum < 0) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	        }
        }
	        
        return new ArrayList<>(result);
    }
}