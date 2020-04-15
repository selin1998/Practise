import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintZigzagMatrix {


  //  Explanation ->
//  sequence of indexes -> 00 | 01 10 | 20 11 02 | 03 12 21 30 | 40 31 22 13 | 23 32 41 50 | 60 51 41 33 | 43 52 61 | 62 53 | 63
//    sumOfIndexes ->      0      1        2           3             4              5           6               7       8      9
//  int[][]a = {
//
//          {1,  2, 3, 4, },
//          {5,  6, 7, 8, },
//          {9, 10,11, 12,},
//          {13,14,15, 16,},
//          {17,18,19, 20,},
//          {21,22,23, 24,},
//          {25,26,27, 28,}};

    //     For each diagonal which is going down (if sumofIndexes is odd) we increase row by one and decrease column by one
    //      For each diagonal which is going up (if sumofIndexes is even) we  increase column by one and decrease row by one
    //     column = sumofIndexes-row
    // if row is >= R or col is >= C we will not add this index because it does not exist and decrease iterator

    public static String traverse(int R, int C, int[][] m) {

        StringJoiner sj=new StringJoiner(" ");

        int row=0;int sumofIndexes=0;int numberofCombinations=1;int counter=0;

        for (int i = 0; i <R*C ; i++) {

            if(row<R && sumofIndexes-row<C)   sj.add(String.valueOf(m[row][sumofIndexes-row]));


            if(row>=R || sumofIndexes-row>=C)   i--;

            counter++;
            row=(sumofIndexes&1)==0 ? row-1 :row+1;

            if(counter==numberofCombinations){
                sumofIndexes++;
                numberofCombinations=sumofIndexes+1;
                counter=0;
                row=(sumofIndexes&1)==0 ?sumofIndexes :0 ;
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



        int[][]aa =
                {
                        {  1,  2,  3 },
                        {  5,  6,  7 },
                        {  9, 10, 11 },
                        { 13, 14, 15 },
                        { 17, 18, 19 },
                        { 21, 22, 23 },
                };


        System.out.println(traverse(7,4,a));
        System.out.println();
        System.out.println(traverse(6,3,aa));

    }

}
