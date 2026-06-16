package week_3.day1_String;

public class Task8 {
    public static void main(String[] args) {
        String email = ("alex@gmail.com");
        String g = getName(email);
        System.out.println(g);
    }
    public static String getName(String email) {
        int sk = email.lastIndexOf("@");
        String name = email.substring(0, sk);

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
