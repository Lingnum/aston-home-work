public class Person {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Person Person = new Person("Иванов Иван Иванович", "Инженер", "ivanov@gmail.com", "+7-999-123-45-67", 80000.0, 50);
        Person.printInfo();

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов Иван Иванович", "Инженер", "ivanov@mail.ru", "+7-999-123-45-67", 80000, 50);
        persArray[1] = new Person("Петров Петр Петрович", "Менеджер", "petrov@mail.ru", "+7-999-234-56-78", 45000, 28);
        persArray[2] = new Person("Сидорова Светлана Васильевна", "Бухгалтер", "sidorova@mail.ru", "+7-999-345-67-89", 40000, 35);
        persArray[3] = new Person("Кузнецов Алексей Сергеевич", "Программист", "kuznetsov@mail.ru", "+7-999-456-78-90", 50000, 27);
        persArray[4] = new Person("Федорова Анна Николаевна", "Дизайнер", "fedorova@mail.ru", "+7-999-567-89-01", 35000, 32);

        for (Person person : persArray) {
            person.printInfo();
        }
    }
}
