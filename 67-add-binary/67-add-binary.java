class Solution {
    public String addBinary(String a, String b) {
       
        char [] binaryAChr = a.toCharArray();
		char [] binaryBChr = b.toCharArray();
		
		int aIndex = a.length()-1;
		int bIndex = b.length()-1;
		String resultBinary = "";
		int sum = 0;
		char carry = '0';
		
		while(aIndex >= 0 || bIndex >= 0 || carry != '0') {
			if(aIndex < 0 && bIndex < 0) {
				sum = carry - '0';
			} else if(aIndex < 0) {
				sum = (binaryBChr[bIndex] - '0') + (carry - '0');
			} else if(bIndex < 0) {
				sum = (binaryAChr[aIndex] - '0') + (carry - '0');
			} else {
				sum = (binaryAChr[aIndex] - '0') + (binaryBChr[bIndex] - '0') + (carry - '0');
			}
			
			resultBinary += sum % 2;
			carry = Character.forDigit(sum/2, 10);
			
			aIndex--;
			bIndex--;
		}
		
		String temp = "";
		
		for(int i=resultBinary.length()-1; i>=0; i--) {
			temp += resultBinary.charAt(i);
		}
		
		resultBinary = temp;
		
		return resultBinary;
    }
}