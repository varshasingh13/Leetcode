import java.util.*;
class RandomizedSet {
    Set<Integer> s;
    List<Integer> l ;
    public RandomizedSet() {
        s = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!s.contains(val)){
            s.add(val);
            return true;
        }
       
        return false;
    }
    
    public boolean remove(int val) {
         if(s.contains(val)){
            s.remove(val);
            return true;
         }
         return false;
    }
    
    public int getRandom() {
        l = new ArrayList<>(s);
        Random rand = new Random();
        return l.get(rand.nextInt(l.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */