package lesson7;

public class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }
    //Метод проверки возможности покушать из миски на значение appetite а также вызов метода decreaseFood
    boolean canEating(int appetite){
        //Проверка на отрицательное значение food при вычитании appetite
        if (food - appetite > 0){
            //Вызов метода уменьшения кол-ва еды в миске
            decreaseFood(appetite);
            return true;
        }
        return false;
    }

    void decreaseFood(int appetite){
        this.food -= appetite;
    }

    void addFood(int food) {
        this.food += food;
        System.out.println("> В миску добавлено " + food + " единиц еды");
    }


    void info(){
        System.out.println("> В миске " + food + " единиц еды");
    }
}
