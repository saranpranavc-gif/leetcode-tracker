// Last updated: 09/07/2026, 09:47:05
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;

        for (int i = 0; i < startTime.length; i++) {

            if (startTime[i] <= queryTime &&
                endTime[i] >= queryTime) {
                count++;
            }
        }

        return count;
    }
}