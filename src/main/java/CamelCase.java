


public class CamelCase {

    static int camelcase(String s) {
       return (int) s.codePoints().mapToObj(i->(char)i).filter(x->x<=90).count()+1;

    }

    public static void main(String[] args) {

        System.out.println(camelcase("selinIsADreamGirl"));
        System.out.println(camelcase("selin"));
        System.out.println(camelcase("saveChangesInTheEditor"));

    }


}
