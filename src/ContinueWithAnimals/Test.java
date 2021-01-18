package ContinueWithAnimals;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static final int maxFoodInBowl=50;
    public static Bowl bowl=new Bowl(maxFoodInBowl);

    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", "Серый", 25, 25,maxFoodInBowl);
        Animal dog = new Dog("Шарик", "Черный", 23, 40,maxFoodInBowl);
        Animal[] arrOfAnimals = new Animal[Animal.getCount()];
        arrOfAnimals[0] = cat;
        arrOfAnimals[1] = dog;
        int buf;
        do {
            buf = choice(arrOfAnimals);
            switch (buf) {
                case 1 -> menuOfActions(cat);

                case 2 -> menuOfActions(dog);
                case 3 -> {
                    if (!bowl.isFull()) {
                        bowl.addFood(bowl.getMaxFood());
                    } else {
                        System.out.println("Миска полная, если не хватает купите побольше!");
                    }
                }
                case 4 -> {}
                default -> System.out.println("Такого пункта нет в меню!");

            }
        } while (buf != 4);
    }

    public static int choice(Animal[] arrOfAnimals) {
        System.out.println("Выберите с кем хотите взаимодействовать: ");
        int i;
        for (i = 0; i < arrOfAnimals.length; i++) {
            System.out.println((i + 1) + ". " + arrOfAnimals[i].toString());
        }
        i++;
        System.out.println(i + ". Наполнить миску (В миске: "+bowl.info()+" единиц еды)");
        i++;
        System.out.println(i + ". Я устал хочу уйти");
        Scanner scanChoice = new Scanner(System.in);
        return scanChoice.nextInt();
    }


    public static void menuOfActions(Animal animal) {
        System.out.println("Что вы хотите сделать с " + animal.getName() + "?");
        System.out.println("1. Поиграть");
        System.out.println("2. Покормить");
        Scanner scanAction = new Scanner(System.in);
        switch (scanAction.nextInt()) {
            case 1 -> {
                if (!animal.isHunger()) {
                    menuOfPlay(animal);
                } else
                    System.out.println(animal.name + " нужно покормить!!!");

            }
            case 2 -> {
                if (animal.isHunger())
                    animal.eat();
                else {
                    System.out.println();
                }

            }
            default -> System.out.println("Такого пункта нет в меню((");

        }


    }

    public static void menuOfPlay(Animal animal) {
        Random randomForActions = new Random();
        System.out.println("Как вы хотите поигарать с " + animal.getName() + '?');
        System.out.println("1. Бег");
        System.out.println("2. Прыжки");
        System.out.println("3. Плавание");
        Scanner scanChoicePlay = new Scanner(System.in);
        switch (scanChoicePlay.nextInt()) {
            case 1 -> {

                float runLength = randomForActions.nextFloat() + randomForActions.nextInt(100) + 200;
                if (animal.testRun(runLength)) {
                    System.out.println(animal.name + " пробежал " + runLength);
                } else {
                    System.out.println(animal.name + " пытался пробежать " + runLength + ", но у него не получилось(");
                }
                System.out.println(animal.name + " проголодался, его нужно покормить!");
                animal.setHunger();

            }
            case 2 -> {
                float jumpLength = randomForActions.nextFloat() + randomForActions.nextInt(2);
                if (animal.testJump(jumpLength)) {
                    System.out.println(animal.name + " подпрыгнул на " + jumpLength);
                } else {
                    System.out.println(animal.name + " пытался подпрыгнуть на " + jumpLength + ", но у него не получилось(");
                }
                System.out.println(animal.name + " проголодался, его нужно покормить!");
                animal.setHunger();

            }
            case 3 -> {
                float swimLength = randomForActions.nextFloat() + randomForActions.nextInt(2) + 9;
                if (animal.testSwim(swimLength)) {
                    System.out.println(animal.name + " проплыл " + swimLength);
                } else {
                    System.out.println(animal.name + " пытался проплыть " + swimLength + ", но у него не получилось(");
                }
                System.out.println(animal.name + " проголодался, его нужно покормить!");
                animal.setHunger();
            }
            default -> System.out.println("Выберите действие из списка!!!");

        }
    }
}

