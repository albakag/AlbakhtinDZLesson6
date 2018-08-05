package albakag.com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat(150, 1, 2);
        cat1.run();
        cat1.swim();
        cat1.jump();


        Animal cat2 = new Cat(300, 0, 5);
        cat2.run();
        cat2.swim();
        cat2.jump();

        Animal dog1 = new Dog(500, 10, 0.5);
        dog1.run();
        dog1.swim();
        dog1.jump();

        Dog dog2 = new Dog(600, 8,1.5);
        dog2.run();
        dog2.swim();
        dog2.jump();
    }
}
