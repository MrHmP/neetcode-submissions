class Solution {

    
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mainResult = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String hc = getHashCode(strs[i]);
            if(mainResult.containsKey(hc)){
                mainResult.get(hc).add(strs[i]);
            }else{
                List<String> r = new ArrayList<>();
                r.add(strs[i]);
                mainResult.put(hc,r);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(String hc : mainResult.keySet()){
            result.add(mainResult.get(hc));
        }

        return result;
    }

private String getHashCode(String a) {
    if (a == null) return null;

    Map<Character, Integer> aa = new TreeMap<>();

    for (char c : a.toCharArray()) {
        aa.put(c, aa.getOrDefault(c, 0) + 1);
    }

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : aa.entrySet()) {
        sb.append(entry.getKey()).append(entry.getValue());
    }

    return sb.toString();
}
}
