class Solution {
    public String intToRoman(int num) {
        Map<Integer, Character> tempMap = new LinkedHashMap<Integer, Character>() {
			{
				put(1000, 'M');
				put(500, 'D');
				put(100, 'C');
				put(50, 'L');
				put(10, 'X');
				put(5, 'V');
				put(1, 'I');
			}
		};
		
		ArrayList<Integer> tempList = new ArrayList<Integer>(
										Arrays.asList(1000, 500, 100, 50, 10, 5, 1));
		
		String result="";
		int tempNum;
		
		for(int i=0; i<tempList.size(); i++) {
			
			while(num / tempList.get(i) != 0) {
				
				tempNum = num / tempList.get(i);
				num %= tempList.get(i);
				
				for(int j=0; j<tempNum; j++) {
					result += tempMap.get(tempList.get(i));
				}
			}
			
			for(int j=(i+2)/2; j<tempList.size()/2+1; j++) {
				
				if(num / (tempList.get(i) - tempList.get(j*2)) > 0) {
					tempNum = num / (tempList.get(i)-tempList.get(j*2));
					num %= tempList.get(i)-tempList.get(j*2);
					
					for(int k=0; k<tempNum; k++) {
						result += tempMap.get(tempList.get(j*2));
						result += tempMap.get(tempList.get(i));
					}
					break;
				}
			}
		}
		return result;
    }
}