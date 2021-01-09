package lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        Cat cat1 = new Cat("Пушок", 200, 0, 2);
        cat1.run(100);
        cat1.swim(5);
        cat1.jump(1.6);
        System.out.println("-----------------");
        Dog dog1 = new Dog("Рекс", 500, 100 ,0.5);
        dog1.run(300);
        dog1.swim(9);
        dog1.jump(1);
        System.out.println("-----------------");
    }
}
