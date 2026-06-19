package first_mounth.week_1.week_3.day1_String;

public class Task6 {
    public static void main(String[] args) {
        String s = "ggkg.jpg";
        String g = getExtension(s);
        System.out.println(g);

    }
    public static String getExtension(String str) {
        int tap = str.lastIndexOf(".");
        return str.substring(tap +1);
    }
}
