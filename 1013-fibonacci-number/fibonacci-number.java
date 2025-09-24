class Solution {
    int[] fibona = new int[31];
    public int fib(int n) {
        if(n <= 1)  return n;

        if(fibona[n] != 0)  return fibona[n];

        return fibona[n] = fib(n - 2) + fib(n -1);
    }
}