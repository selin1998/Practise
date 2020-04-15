import java.util.HashMap;

public class shortlong {
    public static void main(String[] args) {
        shortlong app=new shortlong();
        HashMap<Integer, String> map = new HashMap<>();
        int k=1;
        while (map.size() < 20) {
            map.put(k++, app.randomString(10,30));
        }
        int len_min = Integer.MAX_VALUE;
        int len_max = Integer.MIN_VALUE;
        String shortest = null;
        String longest = null;




    }


    private String randomString(int min, int max) {
        int len = (int) (Math.random()*(max-min+1))+min;
        String outcome = "";
        while (outcome.length()<len)
            outcome = outcome + (char)(Math.random()*('z'-'a'+1)+'a');
        return outcome;
    }

}
