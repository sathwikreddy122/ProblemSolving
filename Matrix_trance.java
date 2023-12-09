public class Matrix_trance {
    public static void main(String[] args) {
        int[][] mat = {{1, 8, 9,}, {2, 7, 10}, {3, 6, 11}};
        int rows = 3;
        int cols = 3;
        int[][] transpose = new int[rows][cols];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < cols){
                transpose[i][j] = mat[j][i];
                j++;
            }
            i++;
        }
        for(int k = 0; k < rows; k++){
            for(int s = 0; s < cols; s++){
                System.out.print(transpose[k][s] + " ");
            }
            System.out.println();
        }
    }
}
