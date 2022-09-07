class Solution {
    public int romanToInt(String s) {
        
		Map<Character, Integer> tempMap = new HashMap<Character, Integer>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};
		
		int result=0;
		
		for(int i=0; i<s.length(); i++) {
			if(i == s.length()-1) {
				result += tempMap.get(s.charAt(i));
			} else if(tempMap.get(s.charAt(i)) < tempMap.get(s.charAt(i+1))) {
				result -= tempMap.get(s.charAt(i));
			} else {
				result += tempMap.get(s.charAt(i));
			}
		}
		
		return result;
    }
}