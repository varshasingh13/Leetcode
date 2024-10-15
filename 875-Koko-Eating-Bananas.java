class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed =0;
        for(int pile: piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }

        while(maxSpeed> minSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            if(eatInSpeed(piles, mid, h)){
                maxSpeed = mid;
            }else{
                minSpeed = mid+1;
            }
        }
        return minSpeed;
    }

    private static boolean eatInSpeed(int[] piles,int speed, int h ){
        int hours=0;
        for(int pile: piles){
            hours = hours+ (int)(Math.ceil((double)pile/speed));

        }
        return h>=hours;
    }
}