class Solution {
    public int lengthOfLongestSubstring(String s) {
        		
		Queue<Character> tempQueue = new LinkedList<>();
		
		if(s.length() == 0)
			return 0;
		else if(s.length() == 1)
			return 1;
		
		int num=0;
		
		for(int i=0; i<s.length(); i++) {
			char chr = s.charAt(i);
			
			while (tempQueue.contains(chr)) {
				if(num < tempQueue.size()) {
					num = tempQueue.size();
				}
				tempQueue.remove();
			}
			
			tempQueue.add(chr);
		}
		
		return num > tempQueue.size() ? num : tempQueue.size();
    }
}