package lesson5;

public class Person {
    String fullName;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Person(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void PersonInfo() {
        System.out.println("----------------------");
        System.out.println("Иформация о сотруднике.");
        System.out.println("ФИО: " + fullName + "\n" +
                           "Должность: " + post + "\n" +
                           "Email: " + email + "\n" +
                           "Телефон: " + phoneNumber + "\n" +
                           "Зарплата: " + salary + " рублей\n" +
                           "Возраст: " + age + " лет\n");
    }
}
