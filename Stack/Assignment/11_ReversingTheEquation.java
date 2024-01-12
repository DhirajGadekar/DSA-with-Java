/*
 * 11] Reversing the equation
 */ 
class Solution
{

    String reverseEqn(String S) {

        String ans = new String();
        String temp = new String();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '+' ||S.charAt(i) == '-' ||S.charAt(i) == '*' ||S.charAt(i) == '/') {
                ans = S.charAt(i) + ans;
            } else {
                temp = temp + S.charAt(i);
                if(i < S.length() - 1) {
                    if(S.charAt(i + 1) == '+' ||S.charAt(i + 1) == '-' ||S.charAt(i + 1) == '*' ||S.charAt(i + 1) == '/') {

                        ans = temp + ans;
                        temp = "";
                    }
                } else {

                    ans = temp + ans;
                    temp = "";
                }
            }
        }
        return ans;
    }
}
