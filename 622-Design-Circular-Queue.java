class MyCircularQueue {
    ArrayList<Integer> l ;
    int size ;
    public MyCircularQueue(int k) {
        l = new ArrayList<>();
        size =k;
    }
    
    public boolean enQueue(int value) {
        if(l.size()<size){
            l.add(0,value);
            return true;
        }
        return false;
        
    }
    
    public boolean deQueue() {

        if(l.size()>0){
            l.remove(l.size()-1);
            return true;
        }

        return false;
    }
    
    public int Front() {
        if(l.size() >0){
        return l.get(l.size()-1);
        }
        return -1;
        
    }
    
    public int Rear() {
        if(l.size() >0){
        return l.get(0);
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(l.size()==0){
        return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(l.size()==size){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */