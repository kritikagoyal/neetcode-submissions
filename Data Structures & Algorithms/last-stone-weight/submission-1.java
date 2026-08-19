class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int each : stones) {
            pq.add(each);
        }

        while (pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            int diff = Math.abs(stone1 - stone2);

            if (diff != 0) pq.add(diff);
        }

        if (!pq.isEmpty()) {
            return pq.poll();
        }
        return 0;
    }
}
