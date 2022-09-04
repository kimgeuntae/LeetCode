class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
		
		Arrays.sort(strs);
		
		int same = 0;
		
		while(same < strs[0].length()) {
			if(strs[0].charAt(same) == strs[strs.length-1].charAt(same)) {
				same++;
			} else break;
		}
		
		return strs[0].substring(0, same);
    }
}