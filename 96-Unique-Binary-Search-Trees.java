import java.math.BigInteger;

class Solution {
    public int numTrees(int n) {
        BigInteger a=fact(2*n);
        System.out.println(\a \ + a);
        BigInteger b= fact(n+1);
        System.out.println(\b \ + b);
        BigInteger c= fact(n);
        System.out.println(\c \ + c);
       // BigInteger x= a/(b*c);
        BigInteger x = a.divide(b.multiply(c));
        int res= x.intValue();
        return res;

    }
     public BigInteger fact(int val){
         System.out.println(\val \ + val);
        // if(val ==0){
        //     return BigInteger.ONE;
        // }
        
        // return val * fact(val-1); 

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= val; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;

        // int k = 1;
        // for (int i = 2; i <= val; i++) {
        // k = k * i;
        // }
        // return k;   
     }
}