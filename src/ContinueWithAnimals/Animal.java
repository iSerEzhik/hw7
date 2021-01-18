package ContinueWithAnimals;


public abstract class Animal {
    private final Bowl bowl;
    protected final String name;
    protected final int age;
    protected final String color;
    protected boolean hunger;
    protected final int foodForFull;
    protected final float maxJumpHeight;
    protected final float maxRunLength;
    protected final float maxSwimLength;
    private static int count;

    public Animal(String name, String color, int age, int foodForFull,int maxFoodInBowl) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.foodForFull = foodForFull;
        this.hunger = true;
        this.maxRunLength = generateRunLength();
        this.maxJumpHeight = generateJumpHeight();
        this.maxSwimLength = generateSwimLength();
        this.incrementsCount();
        this.bowl=new Bowl(maxFoodInBowl);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", hunger=" + hunger +
                ", foodForFull=" + foodForFull +
                ", maxJumpHeight=" + maxJumpHeight +
                ", maxRunLength=" + maxRunLength +
                ", maxSwimLength=" + maxSwimLength +
                '}';
    }

    public abstract void voice();

    public static int getCount() {
        return count;
    }

    public void incrementsCount() {
        count++;
    }

    public abstract float generateJumpHeight();
//    {
//        System.out.println("Введите высоту прыжка " + this.name + ": ");
//        Random jumpRandom = new Random();
//        return jumpRandom.nextFloat() + jumpRandom.nextInt(5);
//    }

    public abstract float generateRunLength();
//    {
//        System.out.println("Введите как далеко может убежать " + this.name + ": ");
//        Random runRandom = new Random();
//        return runRandom.nextFloat() + runRandom.nextInt(100) + 200;
//    }

    public abstract float generateSwimLength();
//    {
//        System.out.println("Введите сколько может проплыть " + this.name + ": ");
//        Random swimRandom = new Random();
//        return swimRandom.nextFloat() + swimRandom.nextInt(5) + 1;
//    }

    public boolean testJump(float jumpHeight) {
        return (this.maxJumpHeight>=jumpHeight) && (jumpHeight>0);
    }

    public boolean testRun(float runLength) {
        return (this.maxRunLength>=runLength) && (runLength>0);

    }

    public boolean testSwim(float swimLength) {
        return  (this.maxSwimLength>=swimLength) && (swimLength>0);
    }

    public boolean isHunger() {
        return this.hunger;
    }

    public void eat() {
        if (bowl.isEnough(this.foodForFull)) {
            bowl.delFood(this.foodForFull);
            this.hunger=false;
        } else {
            System.out.println(this.name + " не будет сыт!!!" + "Добавте еды в миску!!!");
        }
    }
    public void setHunger(){
        this.hunger=true;
    }

    public String getName() {
        return this.name;
    }


}

