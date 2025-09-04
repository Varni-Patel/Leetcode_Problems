class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);

        for(int row = 0; row < matrix.length; row++){
            int i = 0;
            int j = matrix[row].length - 1;

            while(i < j){
                int temp = matrix[row][i];
                matrix[row][i++] = matrix[row][j];
                matrix[row][j--] = temp;
            }
        }
    }

    public void transpose(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}