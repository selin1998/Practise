

public class Hackerrank {

    static String hackerrankInString(String s) {
    char [] letters={'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
    int counter=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==letters[counter]) {
                counter++;
            }
            if(counter==10) return "YES";
        }
        return "NO";
    }

    static String hackerrankInString2(String s) {
       return  s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")?"YES":"NO" ;
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hacakaeararanaka"));
        System.out.println(hackerrankInString("hackerworld"));
        System.out.println(hackerrankInString("hhaacckkekraraannk"));
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
        System.out.println(hackerrankInString("hhhackkerbanker"));
        System.out.println(hackerrankInString("hhhhaaaaackkkkerrrrrrrrankop"));
        System.out.println(hackerrankInString2("hacakaeararanaka"));

    }
}
//".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*"