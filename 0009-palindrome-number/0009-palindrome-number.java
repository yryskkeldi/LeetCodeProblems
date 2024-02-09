class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String str2 = "";
        
        for (int i = 1; i <= str.length(); i++){
            int y = i - 1;
            
            str2 += str.substring(str.length()-i, str.length() - y);
        }
        if (str.equals(str2)){
            return true;
        }
        return false;
    }
}