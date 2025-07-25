// Last updated: 7/25/2025, 8:53:29 AM
import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

   
    public MedianFinder() {
    left = new PriorityQueue<>(Collections.reverseOrder());
    right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
    if(right.size() > 0 && num > right.peek()){
        right.add(num);
    }
    else{
        left.add(num);
    }

    // we can allow both to be of equal size or diff of 1 but not more that that
    if(right.size() -left.size() == 2){
        left.add(right.remove());
    }
    else if(left.size()-right.size()==2){
        right.add(left.remove());
    }
    // if(right.size() > 0 && num > right.peek()){
    //     right.add(num);
    // }
    // else{
    //     left.add(num);
    // }
    // if(right.size()-left.size() == 2){
    //     left.add(right.remove());
    // }
    // else if(left.size() - right.size() == 2){
    //    right.add(left.remove());
    // }
    }
    
    public double findMedian() {
        double ans = 0;
        if(right.size() > left.size()) return (double)right.peek();
        else if(left.size() > right.size()) return (double)left.peek();
        else {
            return (double)(left.peek() + right.peek())/2;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */