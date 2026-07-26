class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder a = new StringBuilder(s);
        a = a.reverse();
        String b = new String(a);
        s = s.trim();
        if(b.equalsIgnoreCase(s)){
            return true;
        }else{
            return false;
        }
    }
}