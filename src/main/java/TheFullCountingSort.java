import java.util.*;

public class TheFullCountingSort {

    static void countSort(List<List<String>> arr) {
        int size=arr.size();
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> strings;
        for (int i = 0; i < size; i++) {
            if(map.get(Integer.parseInt(arr.get(i).get(0)))!=null){
                strings=new ArrayList<>(map.get(Integer.parseInt(arr.get(i).get(0))));
            }
            else strings=new ArrayList<>();


            if(i<size/2){
                strings.add("-");
            }
            else{
                strings.add(arr.get(i).get(1));
            }

            map.put(Integer.parseInt(arr.get(i).get(0)),strings);


        }
        StringBuilder sb=new StringBuilder();
        map.values().stream().flatMap(i -> i.stream()).forEach(j-> sb.append(j+" "));
        System.out.println(sb);

    }

    public static void main(String[] args) {
        List<List<String>> lists = Arrays.asList(
                Arrays.asList("0" ,"ab"),
                Arrays.asList("6", "cd"),
                Arrays.asList("0" ,"ef"),
                Arrays.asList("6", "gh"),
                Arrays.asList("4" ,"ij"),
                Arrays.asList("0", "ab"),
                Arrays.asList("6" ,"cd"),
                Arrays.asList("0", "ef"),
                Arrays.asList("6" ,"gh"),
                Arrays.asList("0", "ij"),
                Arrays.asList("4" ,"that"),
                Arrays.asList("3", "be"),
                Arrays.asList("0" ,"to"),
                Arrays.asList("1", "be"),
                Arrays.asList("5", "question"),
                Arrays.asList("1" ,"or"),
                Arrays.asList("2", "not"),
                Arrays.asList("4", "is"),
                Arrays.asList("2" ,"to"),
                Arrays.asList("4", "the"));

               countSort(lists);



    }
}
