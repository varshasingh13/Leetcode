class LRUCache {
   
    private int capacity;
    private final LinkedHashMap<Integer, Integer> m ;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        m = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        
        if(m.containsKey(key)){

            Integer val = m.get(key);
            m.remove(key);

            m.put(key,val);


            return m.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            m.remove(key);
            m.put(key,value);
        }
        else{
            m.put(key,value);
        }
        if(m.size()>capacity){
             Iterator<Integer> iterator = m.keySet().iterator();
                m.remove(iterator.next());
        }
       
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */