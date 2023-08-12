class Solution {
	
	/*
	 public static int calculateGCD(int num1, int num2) {
    	  	if (num2 == 0) {
      			
			return num1;
    		}

	    	int remainder = num1 % num2;
    		return calculateGCD(num2, remainder);
  	}*/
        int gcdCal(int n1, int n2, int div) {

                if(n1%div == n2%div) {

                        return div;
                }

                return gcdCal(n1, n2, --div);
        }
        public static void main(String[] args) {

                Solution s = new Solution();
                System.out.println(s.gcdCal(15, 12, 15));
        }
}

