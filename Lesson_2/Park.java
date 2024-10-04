package Lesson_2;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " рублей");
        }
    }

    private Attraction[] attractions;
    private int count;

    public Park(int capacity) {
        attractions = new Attraction[capacity];
        count = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count] = new Attraction(name, workingHours, price);
            count++;
        } else {
            System.out.println("Не удалось добавить аттракцион: достигнуто максимальное количество.");
        }
    }

    public void printAllAttractions() {
        for (int i = 0; i < count; i++) {
            attractions[i].printInfo();
        }
    }
}
