package week_3.day1_String;

public class Task7 {
    public static void main(String[] args) {
        String gm =  "alex@gmail.com";
        String ff = getLogin(gm);
        System.out.print(ff);
    }
    public static String getLogin(String email) {
        int s = email.lastIndexOf("@");
        String result = "";

        for (int i = 0; i < s ; i++) {
            result += email.charAt(i);
        }
        return result;
    }
}
