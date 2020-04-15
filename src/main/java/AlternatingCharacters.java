



public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int counter=0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {

        System.out.println(alternatingCharacters("ABABAB"));
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
