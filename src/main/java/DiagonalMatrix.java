import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiagonalMatrix {

    static class Track {
      final  int r ;
      final  int c ;
     final   int dir;
        List<Integer> data = new LinkedList<>();

        public Track(int r, int c, int dir) {
            this.r = r;
            this.c = c;
            this.dir = dir;
        }

        public Track(){
            this(0,0,0);
        }

        public Track newDir(int val) {
            return new Track(r, c, val);
        }
        public  Track changeCol(int delta) {
            return new Track(r,c+delta, dir);
        }

        public Track changeRow(int delta) {
            return new Track(r+delta, c, dir);
        }

        public Track add (int val){
            data.add(val);
            return this;
        }



    }

    private static String traverse(int R, int C, int[][] a) {

        Track t = new Track();
        List<Integer> data = new LinkedList<>();
        return IntStream.range(0, R*C).map(n -> {
            int val = a[t.r][t.c];
            data.add(val);
            switch (t.dir) {
                case 0: t.changeCol(1).newDir(1); break;
                case 1:
                    if      (t.r == R-1) { t.changeCol(1).newDir(2); }
                    else if (t.c == 0  ) { t.changeRow(1).newDir(2); }
                    else                 { t.changeRow(1).changeCol(2);   }
                    break;
                case 2:
                    if      (t.c == C-1) { t.changeRow(1).newDir(1); }
                    else if (t.r == 0)   { t.changeCol(1).newDir(1); }
                    else                 { t.changeRow(-1).changeCol(1);    }
            }
            return val;
        }).mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));


    }

    public static void main(String[] args) {
        int[][]a = {
                {  1,  2,  3,  4, },
                {  5,  6,  7,  8, },
                {  9, 10, 11, 12, },
                { 13, 14, 15, 16, },
                { 17, 18, 19, 20, },
                { 21, 22, 23, 24, },
                { 25, 26, 27, 28, },
        };
        System.out.println("1 2 5 9 6 3 4 7 10 13 17 14 11 8 12 15 18 21 25 22 19 16 20 23 26 27 24 28");
        System.out.println(traverse(a.length, a[0].length, a));
    }
}
