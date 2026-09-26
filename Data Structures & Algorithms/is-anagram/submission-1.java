class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;

        Map<Character, Integer> ss = new HashMap<>();
        Map<Character, Integer> tt = new HashMap<>();

        for (char c : s.toCharArray()){
            ss.put(c, ss.getOrDefault(c,0)+1);
        }

        for (char c : t.toCharArray()){
            tt.put(c, tt.getOrDefault(c,0)+1);
        }


        for (Character c : ss.keySet()){
            if (!ss.get(c).equals(tt.get(c))) return false;
        }

        return true;
    }
}
