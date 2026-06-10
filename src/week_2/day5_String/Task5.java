package week_2.day5_String;

public class Task5 {
    public static void main(String[] args) {
        String name = "world";
        String k = "word";
        int i = name.length() - 1;
        for (; i >= 0;i --) {
            System.out.print(name.charAt(i));

        }
        System.out.println();
        int w = k.length() - 1;
        for (; w >= 0; w--) {
            System.out.print(k.charAt(w));
        }

    }
}
