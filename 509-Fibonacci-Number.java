class Solution {
    public int fib(int n) {
        //General approach
        // int a=0;
        // int b=1;
        // int c;
        // if(n ==0){
        //     return a;
        // }
        // for(int i=2; i<=n; i++){
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }
        // return b;

        
        //recursion
        //if(n<=1)
        //    return n;
        // return fib(n-1)+fib(n-2);

        //Dynamic programing
        int f[] = new int[n+2];
        f[0] =0;
        f[1] =1;
        for(int i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}