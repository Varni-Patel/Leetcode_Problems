class Solution {
    public int addDigits(int num) {
        if(num <= 9)    return num;
        int sum = 0;

        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return addDigits(sum);
    }
}