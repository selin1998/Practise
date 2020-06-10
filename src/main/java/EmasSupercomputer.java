import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmasSupercomputer {

    private final static int FREE = 0;
    private final static int OCCUPIED = 1;
    private final static int BUSY = 9;

    static int[][] convert(String[] grid) {
        int dimY = grid.length;
        int dimX = grid[0].length();
        int[][] data = new int[dimY][dimX];

        IntStream.range(0, dimY).forEach(y ->
                IntStream.range(0, dimX).forEach(x ->
                        data[y][x] = grid[y].charAt(x) == 'G' ? FREE : BUSY
                ));
        return data;
    }

    static boolean isFreeHorAt(int x, int y, int len, int[][] data) {
        return IntStream.range(0, len).allMatch(i -> data[y][x+i] == FREE);
    }

    static boolean isFreeVerAt(int x, int y, int len, int[][] data) {
        return IntStream.range(0, len).allMatch(i -> data[y+i][x] == FREE);
    }

    static boolean isPossibleAt(int x, int y, int size, int[][] data) {
        return isFreeHorAt(x, y + size/2, size, data)
                && isFreeVerAt(x + size/2, y, size, data);
    }

    static void occupyHorAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y][x+i] = OCCUPIED);
    }

    static void occupyVerAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y+i][x] = OCCUPIED);
    }

    static void occupyAt(int x, int y, int size, int[][] data) {
        // size/2 - center of the plus
        occupyHorAt(x, y + size/2, size, data);
        occupyVerAt(x + size/2, y, size, data);
    }

    static void releaseHorAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y][x+i] = FREE);
    }

    static void releaseVerAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y+i][x] = FREE);
    }

    static void releaseAt(int x, int y, int size, int[][] data) {
        // size/2 - center of the plus
        releaseHorAt(x, y + size/2, size, data);
        releaseVerAt(x + size/2, y, size, data);
    }

    static class PlusAt {
        final int x1;
        final int y1;
        final int x2;
        final int y2;
        final int size1;
        final int size2;

        PlusAt(int x1, int y1, int x2, int y3, int size1, int size2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y3;
            this.size1 = size1;
            this.size2 = size2;
        }
    }
    static class PlusResult {
        public final int size1;
        public final int size2;
        public final boolean ok;

        PlusResult(int size1, int size2, boolean ok) {
            this.size1 = size1;
            this.size2 = size2;
            this.ok = ok;
        }
    }
    static int twoPluses(String[] grid) {
        int[][] data = convert(grid);
        int width = data[0].length;
        int height = data.length;
        int max_w = (width & 1) == 0 ? width - 1 : width;
        int max_h = (height & 1) == 0 ? height - 1 : height;
        int max_size = Math.min(max_w, max_h);
        List<PlusAt> combinations = IntStream.rangeClosed(1, max_size).filter(x -> (x & 1) != 0).map(x -> max_size + 1 - x).boxed().flatMap(size1 ->
                IntStream.rangeClosed(1, max_size).filter(x -> (x & 1) != 0).map(x -> max_size + 1 - x).boxed().flatMap(size2 ->
                        IntStream.rangeClosed(0, width - size1).boxed().flatMap(x1 ->
                                IntStream.rangeClosed(0, height - size1).boxed().flatMap(y1 ->
                                        IntStream.rangeClosed(0, width - size2).boxed().flatMap(x2 ->
                                                IntStream.rangeClosed(0, height - size2).boxed().map(y2 ->
                                                        new PlusAt(x1, y1, x2, y2, size1, size2)))))))
                .collect(Collectors.toList());
        return combinations.stream().map(c -> {
            if (isPossibleAt(c.x1,c.y1,c.size1, data)) {
                occupyAt(c.x1,c.y1,c.size1, data);
                if (isPossibleAt(c.x2,c.y2,c.size2, data)) {
                    releaseAt(c.x1,c.y1,c.size1, data);
                    return new PlusResult(c.size1, c.size2, true);
                }
                releaseAt(c.x1,c.y1,c.size1, data);
            }
            return new PlusResult(c.size1, c.size2, false);
        })
                .filter(r -> r.ok)
                .mapToInt(r -> (r.size1*2-1)*(r.size2*2-1))
                .max()
                .orElseThrow(RuntimeException::new);
    }


    public static void main(String[] args) {
        System.out.println(twoPluses(new String[]{"BGBBGB", "GGGGGG", "BGBBGB", "GGGGGG", "BGBBGB", "BGBBGB"}));
    }
}
