

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int distance = x1 - x2;
        int velocity = v1 - v2;
        return (velocity * distance < 0) && (distance % velocity == 0)?"YES":"NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0 ,3 ,4 ,2));
    }
}

