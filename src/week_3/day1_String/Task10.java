package week_3.day1_String;

public class Task10 {
    public static void main(String[] args) {
        String s = "www.google.com";
        String jj = getSite(s);
        System.out.print(jj);
    }

    public static String getSite(String url) {
        int p = url.indexOf(".");
        int o = url.lastIndexOf(".");
        return url.substring(p+1 ,o);
    }
}
