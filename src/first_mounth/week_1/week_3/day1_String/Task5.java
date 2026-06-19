package first_mounth.week_1.week_3.day1_String;

public class Task5 {
    public static void main(String[] args) {
        String s = "C:\\Users\\Alex\\photo.jpg";
        String file = tt(s);
        System.out.println(file);
    }
    public static String tt(String str) {
        int ss = str.lastIndexOf("\\");
        return (str.substring(ss+1));
    }
}
