package lesson5;

public class MainClass {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "none@mailbox.com", "89153285491", 30000, 30);
        persArray[1] = new Person("Kurochkin Yegor", "Engineer", "none@mailbox.com", "89157502584", 25000, 42);
        persArray[2] = new Person("Ilya Frolov", "Engineer", "none@mailbox.com", "89152194333", 32000, 39);
        persArray[3] = new Person("Ivan Chistyakov", "Engineer", "none@mailbox.com", "89159432999", 48000, 45);
        persArray[4] = new Person("Daniil Romanov", "Engineer", "none@mailbox.com", "89153894222", 40000, 20);
        outputPesonInfo(persArray);
    }

    public static void outputPesonInfo(Person[] persArray){
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40)
            persArray[i].PersonInfo();
        }
    }
}
