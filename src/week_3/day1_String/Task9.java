package week_3.day1_String;

public class Task9 {
    public static void main(String[] args) {
        String g = "Java(Backend)";
        String h = getText(g);
        System.out.println(h);
    }
    public static String getText(String str) {
        int first = str.indexOf("(");
        int second = str.lastIndexOf(")");
        return str.substring(first+1,second);

    }
}
