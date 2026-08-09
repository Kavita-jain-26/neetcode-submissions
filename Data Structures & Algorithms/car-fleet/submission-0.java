class Solution { //from algomonter
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        Integer[] indices = new Integer[n];
        // Store car indices: 0, 1, 2, ...
        for(int i = 0; i < n ; i++){
            indices[i] = i;
        }
        // Sort cars by position: closest to target -> farthest
        Arrays.sort(indices, (i, j)->Integer.compare(
            position[j], position[i]
        ));

        int fleetCount = 0;
        // Arrival time of the fleet ahead
        double previousArrivalTime  = 0;

        // Process cars from closest -> farthest
        for(int index: indices){
            double currentArrivaltime = (double)(target-position[index])/speed[index];
            // Current car cannot catch the fleet ahead

            if(currentArrivaltime > previousArrivalTime){
                fleetCount++;
                 // This car becomes the new fleet ahead

                previousArrivalTime = currentArrivaltime;
            }
        }
        return fleetCount;


    }
}

