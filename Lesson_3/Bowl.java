package Lesson_3;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public void decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        } else {
            System.out.println("Недостаточно еды в миске для уменьшения на " + amount);
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        } else {
            System.out.println("Количество добавляемой еды должно быть положительным.");
        }
    }
}
