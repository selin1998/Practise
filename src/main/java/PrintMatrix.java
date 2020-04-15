


public class PrintMatrix {

    public static String dataOrdered(int R, int C, int[][] m) {
        int row = 0, col = 0, counter=0;
        StringBuilder str=new StringBuilder();
        while (row < R && col < C) {
            str.append(m[row][col]+" ");

            if(counter==0){
                if(col==C-1) {
                    row++;
                    counter=counter^1;
                    str.append(m[row][col]+" ");
                }
                else   col++;

            }
            if(counter==1){
                if(col==0) {
                    row++;
                    counter=counter^1;
                }
                 else col--;
            }


        }
        return str.toString();
    }

    public static void main(String[] args) {
        int[][]a =
                {
                        {  1,  2,  3 },
                        {  5,  6,  7 },
                        {  9, 10, 11 },
                        { 13, 14, 15 },
                        { 17, 18, 19 },
                        { 21, 22, 23 },
                };

        System.out.println(dataOrdered(a.length, a[0].length, a));
        // 1 2 3 7 6 5 9 10 11 15 14 13 17 18 19 23 22 21

    }


}
