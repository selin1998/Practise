import java.util.StringJoiner;

public class PrintLabirintMatrix {

    public static String dataOrdered(int R, int C, int[][] m) {
        StringJoiner sj=new StringJoiner(" ");
        int row=0,col=0;int left=0,right=C-1,up=0,down=R; int counter=0;
        for (int i = 0; i < R*C; i++) {

            sj.add(String.valueOf(m[row][col]));


            if( row==up) {
                col++;
            }
            if(col==right){
                if(row==up){
                    sj.add(String.valueOf(m[row][col]));
                    down=down-1;
                }
                row++;
            }
            if(row==down){
                if(col==right){
                    sj.add(String.valueOf(m[row][col]));
                }
                col--;
            }
            if(col==left){
                if(row==down){
                    sj.add(String.valueOf(m[row][col]));
                    up=up+1;
                    right=right-1;
                }
                row--;


            }

        }
        return sj.toString();
    }

    public static void main(String[] args) {
        int[][]a = {

                {1,  2, 3, 4, },
                {5,  6, 7, 8, },
                {9, 10,11, 12,},
                {13,14,15, 16,},
                {17,18,19, 20,},
                {21,22,23, 24,},
                {25,26,27, 28,}};

        System.out.println(dataOrdered(7,4,a));

    }
}
