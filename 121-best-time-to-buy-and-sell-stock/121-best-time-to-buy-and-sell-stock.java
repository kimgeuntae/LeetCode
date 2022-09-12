class Solution {
    public int maxProfit(int[] prices) {
        
        int profitVal = 0;
		int minVal = prices[0];
		
		for(int i=1; i<prices.length; i++) {
			
			if(minVal < prices[i]) {
				if(profitVal < prices[i] - minVal) {
					profitVal = prices[i] - minVal;
				}
			} else {
				minVal = prices[i];
			}

		}
		
		return profitVal;
    }
}