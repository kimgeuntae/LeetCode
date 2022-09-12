class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1] != 9) {
			digits[digits.length-1] += 1;
		} else {
			for (int i = digits.length-1; i >= 0; i--) {
				if(digits[i] == 9 && i != 0) {
					digits[i] = 0;
				} else if(digits[i] == 9 && i == 0) {
					digits[i] = 0;
					
					int [] tempDigits = new int [digits.length+1];
					tempDigits[0] = 1;
					for(int j=0; j<digits.length; j++) {
						tempDigits[j+1] = digits[j];
					}
					digits = tempDigits;
				} else {
					digits[i] += 1;
					break;
				}
			}
		}
		
        return digits;
    }
}