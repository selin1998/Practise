import java.util.stream.IntStream;

public class JumpingOnTheCloudsRevisited {


    static int jumpingOnClouds(int[] c, int k) {
        int index=k;int energy=100;int len=c.length;

        while(index%len>0){
            energy-=(c[index%len]==1)?3:1;
            index=index+k;
        }
        energy-=(c[0]==1)?3:1;
        return energy;

    }

    static int jumpingOnClouds2(int[] c, int k) {

        final int[] energy={100};
        IntStream.iterate(k,i->i%c.length>0,i->i+k).boxed().forEach(cloud->{
            energy[0]=(c[cloud%c.length]==1)?energy[0]-2-1:energy[0]-1;
        });
        energy[0]-=(c[0]==1)?3:1;
        return energy[0];

    }

    public static void main(String[] args) {
      //  IntStream.iterate(3,i->i%8>0,i->i+3).forEach(x->System.out.println(x));
        int[] ints = {0, 0, 1, 0, 0, 1, 1, 0};
        int  res =jumpingOnClouds(ints,2);
        int[] ints2 = {1, 1, 1, 0 ,1 ,1 ,0 ,0 ,0 ,0};
        int  res2 =jumpingOnClouds(ints2,3);
        System.out.println(res);
        System.out.println(res2);
    }
}
