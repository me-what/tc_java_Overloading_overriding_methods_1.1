public class Main {
    public static void main(String[] args) {
        Main assistant = new Main();
        assistant.sayHello("Михаил");
        assistant.sayHello("Михаил", "Виталий");
        System.out.println();
        assistant.sayHello("Михаил", "Виталий", "Марина", "Андрей", "Анна");

        sayYourAge("\nМой возраст - ", 20);
        sayYourAge(20, "Мой возраст - ");
        System.out.println();
        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Dog dog = new Dog();
        dog.voice();
    }

    public void sayHello(String name) {
        System.out.println("Добрый день, " + name + "!");
    }

    public void sayHello(String firstGuest, String secondGuest) {
        System.out.println("Добрый день, " + firstGuest + " и " + secondGuest + "!");
    }

    public void sayHello(String... names) {
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + "!");
        }
    }

    public static void sayYourAge(String greeting, int age) {
        System.out.println(greeting + " " + age);
    }

    public static void sayYourAge(int age, String greeting) {
        System.out.println(greeting + " " + age);
    }
}