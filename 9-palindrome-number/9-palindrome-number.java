class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
		else if(x/10 == 0) return true;
		
		char [] tempChrArr = Integer.toString(x).toCharArray();
		
		for(int i=0; i<tempChrArr.length/2; i++) {
			if(tempChrArr[i] != tempChrArr[tempChrArr.length-i-1]) {
				return false;
			}
		}
		
		return true;
    }
}