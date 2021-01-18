package ContinueWithAnimals;

public class Bowl {
    final private int maxFood;
    private static int food;
    public Bowl(int maxFood)
    {
        this.maxFood = maxFood;
        food=0;
    }
    public int info(){
        return food;
    }
    public static void addFood( int quantity)
    {
        food=quantity;
    }
    public static boolean isEnough(int quantity)
    {
        return quantity <= food;
    }
    public boolean isFull() {return food==this.maxFood;}
    public void delFood(int quantity)
    {
        food-=quantity;
    }
    public int getMaxFood(){
        return this.maxFood;
    }

}
