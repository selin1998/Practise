import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class JavaHashset {


    public static void main(String[] args) {
        HashSet<Pair> uniques=new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int counter= sc.nextInt();

        while(counter>0){
            String a=sc.next();
            String b=sc.next();
            uniques.add(new Pair(a,b));
            System.out.println(uniques.size());
            counter--;
        }

    }
}
    class Pair{
        String a;
        String b;
       public Pair(String first,String second){
           a=first;
           b=second;
       }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a.equals(pair.a) &&
                    b.equals(pair.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
