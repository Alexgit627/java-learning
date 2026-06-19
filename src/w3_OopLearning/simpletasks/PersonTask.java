package w3_OopLearning.simpletasks;

public class PersonTask {
    public static void main(String[] args) {
        Person person1 = new Person("Alex",22,"Moscow");
        Person person2 = new Person("Dima",21,"Piter");

        person1.printInfo();
        person2.printInfo();

    }
}
