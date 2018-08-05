package albakag.com.company;

import java.text.DecimalFormat;

public class Cat extends Animal {

    public Cat(int runDistance, int swimDistance, double heightJumps) {
        super(runDistance, swimDistance, heightJumps);
    }

    //Используем форматирование дробных чисел(для прыжков в высоту - heightJumps)
    DecimalFormat dec = new DecimalFormat("#0.0");

    //задаем беговой диапазон котов, при условии что кот точно пробежит больше 0
    private final int CAT_RUN_MIN = 50;
    private final int CAT_RUN_MAX = 300;

    //задаем прыжковый диапазон котов
    private final double CAT_JUMP_MIN = 1;
    private final double CAT_JUMP_MAX = 3;

    //задаем максимальную дальность заплыва котов - 0
    private final int CAT_SWIM_MAX = 0;

    //получаем рандомное значение активности животного в заданных выше диапазонах
    private int catRun = CAT_RUN_MIN + (int)(Math.random()*(CAT_RUN_MAX - CAT_RUN_MIN) + 1);
    private int catSwim = CAT_SWIM_MAX;
    private double catJump = CAT_JUMP_MIN + (int)(Math.random()*(CAT_JUMP_MAX - CAT_JUMP_MIN) + 1);

    //переопределяем методы класса animal для класса cat
    @Override
    void run() {
        if (getRunDistance() > catRun) {
            System.out.println(getRunDistance() + "- непреодолимая дистанция для кота");;
        } else {
            System.out.println("Этот кот преодолеет дистанцию - " + getRunDistance());
        }
    }

    @Override
    void swim() {
        if (getSwimDistance() > catSwim) {
            System.out.println(getSwimDistance() + "- большое расстояние, а коты плохо плавают...");
        } else {
            System.out.println("Коты не умеют плавать, но расстояние в - " + getSwimDistance() + " - преодолимо даже котом");
        }
    }

    @Override
    void jump() {
        if (getHeightJumps() > catJump) {
            System.out.println(getHeightJumps() + "- непреодолимая высота для кота");
        } else {
            System.out.println("Этот кот запрыгнет на высоту - " + getHeightJumps());
        }
    }
}
