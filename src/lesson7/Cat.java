package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate){
        //Проверка на сытость
        if (satiety == false)
            // присвоение результата метода canEating (проверка возможности покушать из миски
            // и уменьшение кол-ва еды в миске на значение appetite)
            satiety = plate.canEating(this.appetite);
    }

    void info(){
        System.out.println(satiety ? "Котик " + name + " сыт." : "Котик " + name + " голоден!");
    }
}
