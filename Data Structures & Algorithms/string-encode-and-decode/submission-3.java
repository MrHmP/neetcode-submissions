class Solution {
    public String encode(List<String> strs) {
        String res = "";
        for (int i = 0; i < strs.size(); i++) {
            res = res + (strs.get(i).equals("") ? "-EMPTY-" : strs.get(i)) + ((i < strs.size() - 1) ? "-END-" : "");
        }
        return res;
    }

    public List<String> decode(String str) {
        String[] inputs = str.split("-END-");
        List<String> r = new ArrayList();
        System.out.println(str + "=>" + inputs.length);
        for (String i : inputs) {
            System.out.println("input is:'"+i+"'");
            if (i == null || i.equals(""))
                continue;
            r.add(i.equals("-EMPTY-") ? "" : i);
        }

        return r;
    }
}
