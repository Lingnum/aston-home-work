package Lesson_3;

public class Cat {
    private static int catCount = 0;
    private boolean isFull;
    private static final int maxRunDistance = 200;
    private Bowl bowl;

    public Cat(Bowl bowl) {
        super();
        this.bowl = bowl;
        this.isFull = false;
        catCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat() {
        int foodAmount = bowl.getFoodAmount();
        if (foodAmount > 0) {
            bowl.decreaseFood(5); // Предположим, что кот ест 5 единиц еды
            isFull = true; // Кот становится сытым
            System.out.println("Кот поел и теперь сыт.");
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
