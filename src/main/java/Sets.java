import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {


    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("acer");
        tree.add("abalone");
        tree.add("aaron");
        tree.add("zstyle");
        tree.add("versace");
        tree.add("keylog");


        HashSet<String> tree1 = new HashSet<>();
        tree1.add("acer");
        tree1.add("abalone");
        tree1.add("aaron");
        tree1.add("zstyle");
        tree1.add("versace");
        tree1.add("keylog");
        tree1.add(null);

        ArrayList<String> strings = new ArrayList<>(tree1);


        System.out.println(tree.toString());
        System.out.println(tree1.toString());
        System.out.println(strings.toString());


        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("selin");
        strings2.add("aylin");
        strings2.add("hasan");
        strings2.add("huseyn");
        strings2.add("selin");
     //   strings2.add(null);

        TreeSet<String> strings1 = new TreeSet<>(strings2);
        System.out.println(strings1.toString());

        LinkedHashSet<String> strings3 = new LinkedHashSet<>(strings2);
        System.out.println(strings3.toString());



    }
}
