import java.util.HashMap;

public class DayOfPragrammer {

    static boolean isLeapYear(int year){
         return (year<1918)?(year%4==0):(year%400==0||(year%4==0&&year%100!=0));
    }

    static String dayOfProgrammer(int year) {
      String date=(year==1918)?"26.09.":(isLeapYear(year))?"12.09.":"13.09.";
      return date.concat(String.valueOf(year));

    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2000));
        System.out.println(dayOfProgrammer(2001));
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(1918));

    }
}
