package albakag.com.company;

public abstract class Animal {
    //объявляем переменные, по которым будут идти сравнения животных
    private int runDistance;
    private int swimDistance;
    private double heightJumps;

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public double getHeightJumps() {
        return heightJumps;
    }

    public Animal(int runDistance, int swimDistance, double heightJumps) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.heightJumps = heightJumps;
    }

    //использую абстрактные методы, оставляю реализацию наследникам класса
    abstract void run();

    abstract void swim();

    abstract void jump();
}
