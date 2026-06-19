package first_mounth.week_1.week_2.day3;

public class Task1 {
    public static void main(String[] args) {
        printName("Alex" , 20);
        car("BMW",2025);

    }

    public static void printName(String name, int age) {
        System.out.printf("You are: %s%d%n ",name,age);
    }

    public static void car(String name, int age) {
        System.out.printf("Information about car: %s,%d",name,age);
    }
}
