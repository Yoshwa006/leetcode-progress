// Last updated: 01/03/2026, 22:30:37
class RideSharingSystem {

    Queue<Integer> riders;
    Queue<Integer> drivers;

    public RideSharingSystem() {
        riders = new LinkedList<>();
        drivers = new LinkedList<>();
    }

    public void addRider(int riderId) {
        riders.add(riderId);
    }

    public void addDriver(int driverId) {
        drivers.add(driverId);
    }

    public int[] matchDriverWithRider() {
        int[] arr = new int[2];
        Arrays.fill(arr, -1);
        if (drivers.size() > 0 && riders.size() > 0) {
            arr[0] = drivers.poll();
            arr[1] = riders.poll();
        }
        return arr;
    }

    public void cancelRider(int riderId) {
        Iterator<Integer> it = riders.iterator();

        while (it.hasNext()) {
            int x = it.next();

            if (x == riderId) {
                it.remove();
                break;
            }
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */