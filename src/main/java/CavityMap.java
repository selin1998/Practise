import java.util.Arrays;

public class CavityMap {

    static boolean isCavity(char cell, char... args) {

        for (int i = 0; i < args.length; i++) {
            if (parse(cell) <= parse(args[i])) return false;

        }
        return true;
    }

    public static int parse(char s) {
        return Integer.parseInt(String.valueOf(s));
    }

    public static StringBuilder[] convertToSb(String[] s) {
        StringBuilder[] sbs = new StringBuilder[s.length];
        Arrays.setAll(sbs, i -> new StringBuilder(s[i]));
        return sbs;
    }

    public static String[] convertToString(StringBuilder[] sbs) {

        String[] s = new String[sbs.length];
        Arrays.setAll(s,i->new String(sbs[i]));
        return s;
    }

    static String[] cavityMap(String[] grid) {
        StringBuilder[] map = convertToSb(grid);
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length() - 1; j++) {
                if ( isCavity(grid[i].charAt(j), grid[i].charAt(j - 1), grid[i].charAt(j + 1) ,
                        grid[i - 1].charAt(j), grid[i + 1].charAt(j)  )  )
                            map[i].setCharAt(j, 'X');

            }
        }
        return convertToString(map);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cavityMap(new String[]{"1112", "1912", "1892", "1234"})));
    }
}
