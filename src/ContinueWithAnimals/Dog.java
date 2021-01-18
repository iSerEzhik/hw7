package ContinueWithAnimals;

import java.util.Random;

public class Dog extends Animal {
    public Dog(String name, String color, int age, int foodForFull,int maxFoodInBowl) {
        super(name, color, age, foodForFull,maxFoodInBowl);
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }

    @Override
    public float generateJumpHeight() {
        Random jumpRandom = new Random();
        return (jumpRandom.nextFloat()+(float)0.3);
    }

    @Override
    public float generateRunLength() {
        Random runRandom = new Random();
        return runRandom.nextFloat() + runRandom.nextInt(100) + 200;
    }

    @Override
    public float generateSwimLength() {
        Random swimRandom = new Random();
        return swimRandom.nextFloat() + swimRandom.nextInt(2) + 9;
    }
}
