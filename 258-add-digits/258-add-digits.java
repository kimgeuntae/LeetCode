class Solution {
    public int addDigits(int num) {
        int temp = 0;
		
		if(num / 10 == 0) {
			return num;
		} else {
			while(10 <= num) {
				temp += num % 10;
				num = num / 10;
			}
			
			temp += num % 10;
			return addDigits(temp);
		}
    }
}