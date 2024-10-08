package Lesson_3;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(20);

        Dog dogBobik = new Dog();
        
        Cat catMurzik = new Cat(bowl);
        Cat catMurka = new Cat(bowl);

        dogBobik.run(150);
        dogBobik.swim(5);
        
        catMurka.run(100);
        catMurka.swim(5);

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        dogBobik.run(600);
        dogBobik.swim(15);
        catMurka.run(250);

        System.out.println("Коты пытаются поесть:");
        catMurzik.eat();
        catMurka.eat();

        System.out.println("Мурзик сытый: " + catMurzik.isFull());
        System.out.println("Мурка сытая: " + catMurka.isFull());

        System.out.println("\n Коты пытаются поесть снова:");
        catMurzik.eat();
        catMurka.eat();

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        System.out.println("\n Добавляем 30 единиц еды в миску:");
        bowl.addFood(30);

        System.out.println("Коты снова пытаются поесть:");
        catMurzik.eat();
        catMurka.eat();

        System.out.println("Мурзик сытый: " + catMurzik.isFull());
        System.out.println("Мурка сытая: " + catMurka.isFull());
    }
}