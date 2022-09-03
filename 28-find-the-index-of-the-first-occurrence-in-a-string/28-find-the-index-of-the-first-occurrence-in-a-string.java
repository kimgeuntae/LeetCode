class Solution {
    public int strStr(String haystack, String needle) {
        
		int l1 = haystack.length(), l2 = needle.length();
		
		if(l1 < l2) {
			return -1;
		} else if(l2 == 0) {
			return 0;
		} else {
			String needleFitstWord = needle.substring(0, 1);
			
			for(int i=0; i<l1;) {
				if(l1 < i+l2) return -1;
				String tempStr = haystack.substring(i, i+l2);
				
				if(tempStr.equals(needle)) {
					return i;
				} else if(tempStr.contains(needleFitstWord)) {
					i += tempStr.indexOf(needleFitstWord);
                    if(l1 < i+l2) return -1;
					tempStr = haystack.substring(i, i+l2);
					if(tempStr.equals(needle)) return i;
					
					i++;
				} else {
					i += l2;
				}
			}
		}
		
		return -1;
    }
}