class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();

        while(l<r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);

            if(!( (lc >= 'a' && lc <= 'z') || (lc >= '0' && lc <= '9') )){
                l++;
                continue;
            }

            if(!( (rc >= 'a' && rc <= 'z') || (rc >= '0' && rc <= '9') )){
                r--;
                continue;
            }

            if(lc == rc) {
                l++;
                r--;
                continue;
            }

            return false;
        }

        return true;
    }
}
