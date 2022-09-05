class Solution {
    public boolean wordPattern(String pattern, String s) {
       
		char [] splitedPattern = pattern.toCharArray();
		String [] splitedStr = s.split(" ");
		int patternSize = splitedPattern.length;
		int strSize = splitedStr.length;
		int i = 0;
		
		if(patternSize != strSize) return false;
		
		while(0 < patternSize && i < patternSize) {
			
			char patternWord = splitedPattern[i];
			String strWord = splitedStr[i];
			
			int left = i;
			int right = patternSize-1;
			
			while(left < right) {
				
				char patternLeft = splitedPattern[left];
				char patternRight = splitedPattern[right];
				
				String strLeft = splitedStr[left];
				String strRight = splitedStr[right];
				
				if(patternWord == patternLeft) {
					if(strWord.equals(strLeft)) {
						splitedPattern[left] = splitedPattern[left+1];
						splitedStr[left] = splitedStr[left+1];
					} else return false;
				}
				
				if(patternWord == patternRight) {
					if(strWord.equals(strRight)) {
						splitedPattern[right] = splitedPattern[right-1];
						splitedStr[right] = splitedStr[right-1];
					} else return false;
				}
				
				if(patternWord != patternLeft) {
					if(strWord.equals(strLeft)) return false;
				} else if(patternWord != patternRight) { 
					if(strWord.equals(strRight)) return false;
				}
				
				left++;
				right--;
			}
			i++;
		}
		
		return true;
    }
}