package ContinueWithAnimals;

import java.util.Random;

public class Cat extends Animal {
    public Cat(String name, String color, int age, int foodForFull,int maxFoodInBowl) {
        super(name, color, age, foodForFull,maxFoodInBowl);
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }

    @Override
    public float generateJumpHeight() {
        Random jumpRandom = new Random();
        return jumpRandom.nextFloat() + jumpRandom.nextInt(2) + 1;
    }

    @Override
    public float generateRunLength() {
        Random runRandom = new Random();
        return runRandom.nextFloat() + runRandom.nextInt(100) + 200;
    }

    @Override
    public float generateSwimLength() {
        return 0;
    }
}

