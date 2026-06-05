class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int min_land_index = 0;
        int min_water_index = 0;
        for (int i = 1; i < landStartTime.length; i++) {
            int k = landStartTime[i] + landDuration[i];
            if (k < landStartTime[min_land_index] + landDuration[min_land_index]) {
                min_land_index = i;
            }
        }
        for (int i = 1; i < waterStartTime.length; i++) {
            int k = waterStartTime[i] + waterDuration[i];
            if (k < waterStartTime[min_water_index] + waterDuration[min_water_index]) {
                min_water_index = i;
            }
        }

        int t1 = landStartTime[min_land_index] + landDuration[min_land_index];
        int t2 = waterStartTime[min_water_index] + waterDuration[min_water_index];

        int landToWater = Integer.MAX_VALUE;
        int waterToLand = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            landToWater = Math.min(
                landToWater,
                Math.max(t1, waterStartTime[i]) + waterDuration[i]
            );
        }
        for (int i = 0; i < landStartTime.length; i++) {
            waterToLand = Math.min(
                waterToLand,
                Math.max(t2, landStartTime[i]) + landDuration[i]
            );
        }

        return Math.min(landToWater, waterToLand);
    }
}