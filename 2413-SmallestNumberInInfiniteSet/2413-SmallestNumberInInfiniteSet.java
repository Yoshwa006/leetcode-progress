// Last updated: 7/25/2025, 8:49:53 AM
class SmallestInfiniteSet {

    TreeSet<Integer> set;
    int count;
    public SmallestInfiniteSet() {
        count =1;
        set = new TreeSet<>();
    }
    
    public int popSmallest() {
        if(!set.isEmpty()){
            int top = set.first();
            set.remove(top);
            return top;
        }
        return count++;
    }
    
    public void addBack(int num) {
        if(num >= count){
            return;
        }
        set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */