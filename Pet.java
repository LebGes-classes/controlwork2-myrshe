package Zadacha_pro_animals;
import java.util.Random;

abstract class Pet {
    String name;
    int sytost;

    public Pet(String name, int satiety) {
        this.name = name;
        this.sytost = satiety;
    }

    public void eat() {
        Random random = new Random();
        if (this.sytost < 75) {
            int x = 100 - this.sytost;
            this.sytost += random.nextInt(x)+1 ;
        } else {
            this.sytost = 100;
        }
    }

    public abstract void say();
}
