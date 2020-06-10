import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ModifiedKaprekarNumbers {

    static class Mapping{
        long square;
        long sumofParts;
        long sqrt;

        public Mapping(long square, long sumofParts) {
            this.square = square;
            this.sumofParts = sumofParts;
            sqrt=(long)Math.sqrt(square);
        }

    }

    public static Long parse(String s){
        return (s.isEmpty())?0L:Long.parseLong(s);
    }

    public static long sumOfSquareParts(long n){
        String s = String.valueOf(n);
        return parse(s.substring(0,s.length()/2)) +parse(s.substring(s.length()/2));
    }

    static void kaprekarNumbers(int p, int q) {

        List<Long> kaprekars = LongStream.rangeClosed(p, q)
                .mapToObj(n -> new Mapping(n * n, sumOfSquareParts(n * n)))
                .filter(mapping -> mapping.sumofParts == mapping.sqrt).mapToLong(s -> s.sqrt)
                .boxed().collect(Collectors.toList());

        if(kaprekars.isEmpty()){
            System.out.println("INVALID RANGE");
        }
        else{
            for (Long kaprekar : kaprekars) {
                System.out.printf("%d ",kaprekar);
            }
        }


    }
    public static void main(String[] args) {
        kaprekarNumbers(1,100);
        kaprekarNumbers(250,300);
    }
}
