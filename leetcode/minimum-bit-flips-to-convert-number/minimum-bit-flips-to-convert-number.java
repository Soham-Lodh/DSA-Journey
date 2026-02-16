class Solution {
    public int minBitFlips(int start, int goal) {
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();

        while (start > 0) {
            n1.add(start % 2);
            start /= 2;
        }

        while (goal > 0) {
            n2.add(goal % 2);
            goal /= 2;
        }

        int count = 0;
        int minSize = Math.min(n1.size(), n2.size());

        for (int i = 0; i < minSize; i++) {
            if (!n1.get(i).equals(n2.get(i))) count++;
        }
        if (n1.size() > n2.size()) {
            for (int i = minSize; i < n1.size(); i++) {
                if (n1.get(i) == 1) count++;
            }
        } else {
            for (int i = minSize; i < n2.size(); i++) {
                if (n2.get(i) == 1) count++;
            }
        }

        return count;
    }
}
