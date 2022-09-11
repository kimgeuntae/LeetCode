class Solution {
    public boolean isValid(String s) {
        
		if(s == null || s.length() <= 1 || s.length() % 2 == 1) return false;
		
		Map<Character, Character> tempMap = new HashMap<Character, Character>();
		tempMap.put('(', ')');
		tempMap.put('{', '}');
		tempMap.put('[', ']');
		
		char [] tempChr = s.toCharArray();
		
		if(tempMap.containsValue(tempChr[0]) || tempMap.containsKey(tempChr[tempChr.length-1])) {
			return false;
		}
		
		Stack<Character> tempStack = new Stack<Character>();
		
		for(int i=0; i<tempChr.length; i++) {	//	[[[]
			
			char now = tempChr[i];
			
			if(tempMap.containsKey(now)) {
				char next = tempChr[i+1];
				
				if(tempMap.get(now) == next) {
					i++;
				} else if(tempMap.containsValue(next)) {
					return false;
				} else {
					tempStack.push(now);
				}
			} else {
				if(tempStack.isEmpty()) {
					return false;
				} else if(tempMap.get(tempStack.lastElement()) == now) {
					tempStack.pop();
				} else {
					return false;
				}
			}
		}
		
		return tempStack.isEmpty();
    }
}