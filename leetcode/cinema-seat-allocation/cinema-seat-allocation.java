class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            map.computeIfAbsent(seat[0], k -> new HashSet<>())
               .add(seat[1]);
        }
        long count = 2L * n;
        for (HashSet<Integer> set : map.values()) {
            boolean left = true;
            boolean middle = true;
            boolean right = true;
            for (int seat : set) {
                if (seat >= 2 && seat <= 5)
                    left = false;
                if (seat >= 4 && seat <= 7)
                    middle = false;
                if (seat >= 6 && seat <= 9)
                    right = false;
            }
            if (left && right) {
            } else if (left || middle || right) {
                count--;
            } else {
                count -= 2;
            }
        }
        return (int) count;
    }
}