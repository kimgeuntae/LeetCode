class Solution {
    public int reverse(int x) {
        
        String temp = "";
		
		if(x<0) {
			temp += "-";
			x *= -1;
		}
		
		while(true) {
			if(x/10 == 0) {
				temp += x;
				break;
			}
			temp += x%10;
			x = x/10;
		}
		
		try {
			return Integer.parseInt(temp);
		} catch (Exception e) {
			return 0;
		}
		
    }
}