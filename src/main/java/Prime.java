import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prime {

    public static boolean isPrime(long n){
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPrimeR(int n, int divisor){
        if(n==2||divisor>=Math.sqrt(n)) return true;
        if( n%divisor==0) return false;
        else{
            return  isPrimeR(n,divisor+1);
        }
    }
    public static List<Integer> gen_prime(int N){
        List<Integer> list=new ArrayList<>();
        int counter=0;int numbers=2;
        while(counter<N){
            if(isPrime(numbers)){
                list.add(numbers);
                counter++;
            }

            numbers++;
        }
        return list;
    }
    public static List<Long> gen_prime_5digit(){
        List<Long> list=new ArrayList<>();
        int counter=0; long numbers=10000;
        for(int i=0;i<89999;i++){
            if(isPrime(numbers)){
                list.add(numbers);
                counter++;
            }

            numbers++;
        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrimeR(13,2));
        System.out.println(isPrimeR(27,2));
        System.out.println(isPrimeR(7,2));
        System.out.println(isPrimeR(29,2));

        System.out.println(gen_prime(10).toString());
        System.out.println(gen_prime_5digit().toString());
        List<Long> prime5digit=gen_prime_5digit();


        List<Integer> list1= Arrays.asList(2,3,4,5,6,12,24);
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        List<Integer> integers = list1.stream().flatMap(x -> list1.stream().map(y -> x * y)).distinct().collect(Collectors.toList());

        System.out.println(integers.toString());
    //    List<Long> longList = prime5digit.stream().flatMap(x -> prime5digit.stream().map(y -> x * y)).distinct().collect(Collectors.toList());



    }
}
