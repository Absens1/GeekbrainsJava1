package lesson6;

public class Cat extends Animal{
    Cat(String name, int runningSpeedLimit, int swimmingSpeedLimit, double jumpHeightLimit){
        super(name, runningSpeedLimit, swimmingSpeedLimit, jumpHeightLimit);
    }

    @Override
    void swim(int swimmingSpeed) {
        System.out.println(swimmingSpeed > 0 ? name + " не участвует в заплыве!" : " не умеет плавать!");
    }
}
