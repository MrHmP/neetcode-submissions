class Solution {
    class Elem implements Comparable<Elem> {
        int num;
        int freq;

        public Elem(int num, int v) {
            this.num = num;
            this.freq = v;
        }

        @Override
        public int compareTo(Elem other) {
            return Integer.compare(other.freq, this.freq);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        int maxFreq = 0;

        for (int n : nums) {
            if (f.containsKey(n)) {
                f.put(n, f.get(n) + 1);
            } else {
                f.put(n, 1);
            }
            maxFreq = maxFreq < f.get(n) ? f.get(n) : maxFreq;
        }

        int[] result = new int[k];
        List<Elem> r = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : f.entrySet()) {
            r.add(new Elem(e.getKey(), e.getValue()));
        }
        Collections.sort(r);

        for (int i = 0; i < k; i++) {
            result[i] = r.get(i).num;
        }

        return result;
    }
}
