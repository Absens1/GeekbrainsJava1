package lesson6;

public class Animal {
    protected String name;
    private int runningSpeedLimit;
    private int swimmingSpeedLimit;
    private double jumpHeightLimit;

    Animal(String name, int runningSpeedLimit, int swimmingSpeedLimit, double jumpHeightLimit){
        this.name = name;
        this.runningSpeedLimit = runningSpeedLimit;
        this.swimmingSpeedLimit = swimmingSpeedLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

     void run(int runningSpeed){
         System.out.println(runningSpeed < runningSpeedLimit ? name + " бежит со скоростью " + runningSpeed + " метров!" :
                 name + " не смогл(а) пробежать со скоростью " + runningSpeed + " метров!");
     }

     void swim(int swimmingSpeed){
         System.out.println(swimmingSpeed < swimmingSpeedLimit ? name + " проплывает дистанцию " + swimmingSpeed + " метров!" :
                 name + " не смогл(а) проплыть дистанцию " + swimmingSpeed + " метров!");
     }

     void jump(double jumpHeight){
         System.out.println(jumpHeight < jumpHeightLimit ? name + " прыгает на высоту " + jumpHeight + " метров!" :
                 name + " не смогл(а) прыгнуть на высоту " + jumpHeight + " метров!");
     }
}