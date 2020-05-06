public class CatsAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int dist1 = Math.abs(z - x);
        int dist2 = Math.abs(z - y);
        return (dist1<dist2)?"Cat A":(dist1>dist2)? "Cat B":"Mouse C";

    }
    public static void main(String[] args) {
        System.out.println(catAndMouse(1,2,3));
        System.out.println(catAndMouse(4,1,3));
        System.out.println(catAndMouse(1,5,3));
    }
}
