package w3_OopLearning.simpletasks;

public class Car {
    String name;
    int age;
    double speed;

    public Car(String name, int age, double speed ) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }
    public void printInfoCar() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(speed);
    }
}
