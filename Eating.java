package Zadacha_pro_animals;
import java.util.ArrayList;
import java.util.Random;

public class Eating {
    public static void main(String [] args) {
        Random random = new Random();
        String[] petNames = {"Гоша", "Нюша", "Муся", "Шарик", "Бобик", "Вовик"};


        Pet[] pets = new Pet[6];


        for (int i = 0; i < pets.length; i++) {
            String petName = petNames[random.nextInt(petNames.length)];
            int sytost = random.nextInt(100) + 1;
            if (random.nextBoolean()) {
                pets[i] = new Dog(petName, sytost);
            } else {
                pets[i] = new Cat(petName, sytost);
            }
        }
        
        System.out.println("Процент сытости до кормления:");
        for (Pet pet : pets) {
            System.out.println("Питомец: " + pet.name + ", Сытость: " + pet.sytost + "%");
        }

        //животные хевают
        System.out.println("Животные хевают:");
        for (Pet pet : pets) {
            pet.eat();
            pet.say();
        }

        System.out.println("Процент сытости после кормления:");
        for (Pet pet : pets) {
            System.out.println("Питомец: " + pet.name + ", Сытость: " + pet.sytost + "%");
        }
    }
}

