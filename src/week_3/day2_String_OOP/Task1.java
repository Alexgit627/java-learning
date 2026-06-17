package week_3.day2_String_OOP;

public class Task1 {
    public static void main(String[] args){
        String login= "admin";
        String login1 = "AdMin";
        boolean check = loginCheck (login);
        boolean check1 = loginCheck(login1);
        System.out.println(check + " " + check1 );
    }
    public static boolean loginCheck (String str) {

        return str.equalsIgnoreCase("admin");

    }
}

