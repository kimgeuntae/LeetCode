class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int nums1Index = m-1, nums2Index = n-1, resultIndex = m+n-1;
		int tempNum = 0;
		
		while(0 <= nums1Index || 0 <= nums2Index || 0 < resultIndex) {
			if(nums2Index < 0) {
				tempNum = nums1[nums1Index--];
			} else if(nums1Index < 0) {
				tempNum = nums2[nums2Index--];
			} else {
				if(nums2[nums2Index] < nums1[nums1Index]) {
					tempNum = nums1[nums1Index--];
				} else {
					tempNum = nums2[nums2Index--];
				}
			}
			
			nums1[resultIndex--] = tempNum;
		}
    }
}