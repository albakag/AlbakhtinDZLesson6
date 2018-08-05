package albakag.com.company;

import java.text.DecimalFormat;

public class Dog extends Animal{

    public Dog(int runDistance, int swimDistance, double heightJumps) {
        super(runDistance, swimDistance, heightJumps);
    }

    //Используем форматирование дробных чисел(для прыжков в высоту - heightJumps)
    DecimalFormat dec = new DecimalFormat("#0.0");

    //задаем беговой диапазон собак
    private final int DOG_RUN_MIN = 400;
    private final int DOG_RUN_MAX = 600;

    //задаем прыжковый диапазон собак, с точкой отсчета 0
    private final double DOG_JUMP_MAX = 1.5f;

    //задаем диапазон дальности заплыва собак
    private final int DOG_SWIM_MIN = 8;
    private final int DOG_SWIM_MAX = 12;

    //получаем рандомное значение активности животного в заданных выше диапазонах
    private int dogRun = DOG_RUN_MIN + (int)(Math.random()*(DOG_RUN_MAX - DOG_RUN_MIN) + 1);
    private int dogSwim = DOG_SWIM_MIN + (int)(Math.random()*(DOG_SWIM_MAX - DOG_SWIM_MIN) + 1);
    private double dogJump = (float)(Math.random()*DOG_JUMP_MAX );

    //переопределяем методы класса animal для класса dog
    @Override
    void run() {
        if (getRunDistance() > dogRun) {
            System.out.println(getRunDistance() + "- непреодолимая дистанция для пса");;
        } else {
            System.out.println("Этот пес преодолеет дистанцию - " + getRunDistance());
        }
    }

    @Override
    void swim() {
        if (getSwimDistance() > dogSwim) {
            System.out.println(getSwimDistance() + "- непреодолимая дистанция для пса");
        } else {
            System.out.println("Этот пес проплывет дистанцию - " + getSwimDistance());
        }
    }

    @Override
    void jump() {
        if (getHeightJumps() > dogJump) {
            System.out.println(getHeightJumps() + "- непреодолимая высота для пса");
        } else {
            System.out.println("Этот пес запрыгнет на высоту - " + getHeightJumps());
        }
    }
}
