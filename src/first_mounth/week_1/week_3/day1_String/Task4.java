package first_mounth.week_1.week_3.day1_String;

public class Task4 {
    public static void main(String[] args) {
        String s = "skdkas@gmail.com";
        String itog = mail(s);
        System.out.print(itog);

    }
    public static String mail (String str) {
        int g = str.indexOf("@");
        return  (str.substring(g +1));
    }
}
