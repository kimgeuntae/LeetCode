class Solution {
    public int lengthOfLastWord(String s) {
        
		while(s.lastIndexOf(" ") == s.length()-1) {
			s = s.substring(0, s.lastIndexOf(" "));
			if(s.length() == 0) {
				return 0;
			}
		}
		
		s = s.substring(s.lastIndexOf(" ")+1, s.length());
		return s.length();
    }
}