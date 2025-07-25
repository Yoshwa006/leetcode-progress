// Last updated: 7/25/2025, 8:49:47 AM
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long[] rat = new long[n]; // rat = room available time , vedapu
        int rcount[] = new int[n];

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        for (int[] meet : meetings) {
            boolean foundUnusedRoom = false;
            long minTime = Long.MAX_VALUE;
            int minTimeRoomIdx = 0;
            int s = meet[0];
            int e = meet[1];

            for (int i = 0; i < n; i++) {
                if (rat[i] <= s) {
                    rcount[i]++;
                    foundUnusedRoom = true;
                    rat[i] = e;
                    break;
                }
                if (rat[i] < minTime) {
                    minTime = rat[i];
                    minTimeRoomIdx = i;
                }
            }
            if (!foundUnusedRoom) {
                rat[minTimeRoomIdx] += e - s;
                rcount[minTimeRoomIdx]++;
            }
        }

        int max = 0;
        int whichRoom = 0;
        for (int i = 0; i < n; i++) {
            if (rcount[i] > max) {
                max = rcount[i];
                whichRoom = i;
            }
        }

        return whichRoom;
    }
}