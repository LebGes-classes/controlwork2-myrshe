package Zadacha_pro_animals;
class Dog extends Pet {

    public Dog(String name, int sytost) {
        super(name, sytost);
    }

    @Override
    public void say () {
        System.out.println("Гав!");
    }
}
