class MedianFinder {
    PriorityQueue<Integer> leftMaxheap;
    PriorityQueue<Integer> rightMinheap;
    public MedianFinder() {
       leftMaxheap = new PriorityQueue<Integer>((a,b)->b-a);
       rightMinheap = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        if(leftMaxheap.isEmpty() || num<=leftMaxheap.peek()){
            leftMaxheap.offer(num);
        }
        else{
             rightMinheap.offer(num);
        }
        if(leftMaxheap.size()> rightMinheap.size()+1){
            rightMinheap.offer(leftMaxheap.poll());
        }
         if(rightMinheap.size()> leftMaxheap.size()){
            leftMaxheap.offer(rightMinheap.poll());
        }
    }
    
    public double findMedian() {
        if(leftMaxheap.size() == rightMinheap.size()){
            return (leftMaxheap.peek() + rightMinheap.peek())/2.0;
        }
        return leftMaxheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */