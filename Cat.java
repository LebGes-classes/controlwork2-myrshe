package Zadacha_pro_animals;

class Cat extends Pet {
    public Cat(String name, int sytost) {
        super (name, sytost);
    }

    public void say () {
        System.out.println("Мяу!");
    }
}
