package lesson7;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(20);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Пушок", 10);
        cats[2] = new Cat("Люся", 4);
        cats[3] = new Cat("Мотя", 8);

        //Вызов метода info для вывода информации о тарелке
        plate.info();
        //Цикл, упрощающий работу с массивом cats
        for (int i = 0; i < cats.length; i++) {
            //Вызов метода eat для кота и передача plate
            cats[i].eat(plate);
            //Вызов метода info для отображения информации о состоянии кота
            cats[i].info();
        }
        //Вызов метода addFood для добавления заданного кол-ва еды в миску
        plate.addFood(10);
    }
}
