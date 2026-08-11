class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = piles[0];
        for (int i = 0; i < piles.length; i++) {
            r = Math.max(r, piles[i]);
        }

        while(l <= r) {
            int speed = l + ((r - l) / 2);

            if (canEat(piles, h, speed)) {
                r = speed - 1;
            } else {
                l = speed + 1;
            }
        }
        return l;
    }

    public boolean canEat(int[] piles, int h, int speed) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            int div = piles[i] / speed;
            hours += div;
            if (piles[i] % speed != 0) {
                hours++;
            }
        }
        return hours <= h;
    }
}
