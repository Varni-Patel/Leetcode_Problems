class Solution {
    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        int i = 0, j = 0;

        for(; j < s.length(); j++){
            if(array[j] == ' '){
                reverse(array, i, j - 1);
                i = j + 1;
            }
        }

        reverse(array, i, array.length - 1);
        return new String(array);
    }

    public void reverse(char[] array, int left, int right){
        while(left < right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}