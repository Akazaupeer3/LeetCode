class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        String lastword = s.substring(lastSpace+1);
        int length = lastword.length();
        return length;
    }
}