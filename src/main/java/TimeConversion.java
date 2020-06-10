public class TimeConversion {

    static boolean isPMBefore12(String s){
       return  s.contains("PM")&&Integer.parseInt(s.substring(0,2))<12;
    }
    static boolean isAM12(String s){
       return s.contains("AM")&&Integer.parseInt(s.substring(0,2))==12;
    }

    static String timeConversion(String s) {
        StringBuilder str= new StringBuilder(s);
        String hour=String.valueOf(Integer.parseInt(str.substring(0,2))+12);
        if(isPMBefore12(s)) str.replace(0,2,hour);
        if(isAM12(s)) str.replace(0,2,"00");
        str.delete(8,10);
        return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:05:45PM"));
        System.out.println(timeConversion("12:05:45AM"));
        System.out.println(timeConversion("11:59:59PM"));

    }
}
