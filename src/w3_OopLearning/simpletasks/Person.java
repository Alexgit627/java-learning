package w3_OopLearning.simpletasks;

public class Person {
    String name;
    int age;
    String city;

     public Person (String name, int age, String city) {
         this.name = name;
         this.age = age;
         this.city = city;
    }

    void doSomething(String text) {
        System.out.println(text);
    }

    int getBirthYear() {
        return 2026 - age;
    }

    void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);

    }
}

