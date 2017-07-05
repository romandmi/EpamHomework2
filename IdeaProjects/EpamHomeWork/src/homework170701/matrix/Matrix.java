package homework170701.matrix;


public class Matrix {

    public static void main(String[] args) {

        int [][] matrix = {{1,2,3},
                            {-4,5,6},
                            {8,9,-10}};


        int summ = 0;
          INNER: for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++ ){

                summ += matrix[i][j];

                if (matrix[i][j] < 0) {
                    summ = 0;
                    continue INNER;
                }

                else if (j == 2) {
                    System.out.println(summ);
                    summ = 0;
                }
            }
        }
    }
}
