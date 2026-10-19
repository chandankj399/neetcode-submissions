class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));


        Stack<int[]> fleet = new Stack();
        fleet.push(pairs[n - 1]);

        for(int i = position.length - 2; i >= 0; i--) {
            double timeTakenByCurrentCar = (double)(target - fleet.peek()[0]) / fleet.peek()[1];
            double timeTakenByLeftCar = (double)(target - pairs[i][0]) / pairs[i][1];
            if (timeTakenByLeftCar <= timeTakenByCurrentCar) {
                continue;
            } else {
                fleet.push(pairs[i]);
            }
        }

        return fleet.size();




        
    }
}
