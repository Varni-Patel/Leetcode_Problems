class Solution {
    public boolean reorderedPowerOf2(int n) {
        long c = counter(n);
        for(int i = 0; i < 32; i++)
            if(counter(1 << i) == c)    return true;
        return false;
    }

    public long counter(int n){
        long res = 0;
        for(; n > 0; n /= 10)
            res += (int) Math.pow(10, n % 10);
        return res;
    }
}