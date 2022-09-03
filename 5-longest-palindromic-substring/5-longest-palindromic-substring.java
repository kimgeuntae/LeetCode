class Solution {
    public String longestPalindrome(String s) {
        
		if(s == null || s.length() <= 1) return s;
		
		String longestStr = s.substring(0, 1);
		char [] tempChr = s.toCharArray();
		
		for(int i=1; i<tempChr.length; i++) {
			String curStr = s.substring(0, i+1);
			String curWord = Character.toString(tempChr[i]);
			boolean isPalindromic = false;
			
			while(curStr.contains(curWord)) {
				
				curStr = curStr.substring(curStr.indexOf(tempChr[i]));
				char [] curChrArr = curStr.toCharArray();
				int left = 0;
				int right = curStr.length()-1;
				
				while(left <= right) {
					if(curChrArr[left] != curChrArr[right]) {
						isPalindromic = false;
						break;
					} else {
						isPalindromic = true;
						left++;
						right--;
					}
				}
				
				if(isPalindromic) break;
				curStr = curStr.substring(1);
			}
			
			if(longestStr.length() < curStr.length() && isPalindromic) {
				longestStr = curStr;
			}
		}
		
		return longestStr;
    }
}