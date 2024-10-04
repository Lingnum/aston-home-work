package Lesson_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иванов Иван Иванович", "Инженер", "ivanov@gmail.com", "+7-999-123-45-67", 80000.0, 50);
        person.printInfo();

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов Иван Иванович", "Инженер", "ivanov@gmail.com", "+7-999-123-45-67", 80000, 50);
        persArray[1] = new Person("Петров Петр Петрович", "Менеджер", "petrov@gmail.com", "+7-999-234-56-78", 45000, 28);
        persArray[2] = new Person("Александрова Александра Александровна", "Бухгалтер", "alex@gmail.com", "+7-999-345-67-89", 40000, 35);
        persArray[3] = new Person("Андреев Андрей Андреевич", "Программист", "andreev@gmail.com", "+7-999-456-78-90", 50000, 27);
        persArray[4] = new Person("Евгеньева Евгения Евгеньевна", "Дизайнер", "evgen@gmail.com", "+7-999-567-89-01", 35000, 32);

        for (Person p : persArray) {
            p.printInfo();
        }

        Park park = new Park(5);
        park.addAttraction("Американские горки", "10:00 - 22:00", 300);
        park.addAttraction("Колесо обозрения", "09:00 - 23:00", 250);
        park.addAttraction("Поездка на лодке", "11:00 - 20:00", 200);
        park.addAttraction("Водные горки", "10:00 - 21:00", 350);
        park.addAttraction("Детская площадка", "09:00 - 19:00", 150);

        park.printAllAttractions();
    }
}
