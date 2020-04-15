import java.util.StringJoiner;

public class Matrix {

    static String traverse(int R, int C, int[][] m) {
        StringBuilder str=new StringBuilder();
        StringJoiner sj = new StringJoiner(" ");
        int row = 0, col = 0, next = 0;
        while (row < R-1 || col <= C-1) {
            sj.add(String.valueOf(m[row][col]));

            switch (next) {
                case 0: col++; next++; break;
                case 1:
                    if (row == R-1) {      col++; next++; } // last row
                    else if (col == 0  ) { row++;      next++; } // first column
                    else               { row++; col--;         }
                    break;
                case 2:
                    if (col == C-1) { row++;      next--; } // last column
                    else if (row == 0  ) {      col++; next--; } // first row
                    else               { row--; col++;         }
                    break;
            }
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        int[][]a = {
//                {1,  2, 3},
//                {5,  6, 7},
//                {9, 10,11},
//                {13,14,15},
//        {17,18,19},
//        {21,22,23},
//        {25,26,27},
        {1,  2, 3, 4, },
        {5,  6, 7, 8, },
        {9, 10,11, 12,},
        {13,14,15, 16,},
        {17,18,19, 20,},
        {21,22,23, 24,},
        {25,26,27, 28,},
//        {1,  2,},
//        {5,  6,},
//        {9, 10,},
//        {13,14,},
//        {17,18,},
//        {21,22,},
//        {25,26,},
//        {1,  2, 3, 4,  100},
//        {5,  6, 7, 8,  101},
//        {9, 10,11, 12, 102},
//        {13,14,15, 16, 103},
//        {17,18,19, 20, 104},
//        {21,22,23, 24, 105},
//        {25,26,27, 28, 106},
        };
        System.out.println(traverse(a.length, a[0].length, a));
    }
}