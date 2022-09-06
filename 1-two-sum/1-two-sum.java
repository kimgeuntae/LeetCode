class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        int [] result = new int[2];
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
        	if(tempList.contains(target-nums[i])) {
        		result[0] = tempList.indexOf(target-nums[i]);
        		result[1] = i;
        		break;
        	}
        	
        	tempList.add(nums[i]);
        }
        
        return result;
    }
}