package Lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
     private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        
        myPhoneBook.add("Иванов", "+7 (495) 123-45-67");
        myPhoneBook.add("Иванов", "+7 (912) 345-67-89");
        myPhoneBook.add("Смирнов", "+7 (831) 987-65-43");
        myPhoneBook.add("Соболев", "+7 (903) 456-78-90");
        myPhoneBook.add("Смирнов", "+7 (812) 234-56-78");

        System.out.println("Телефоны для Иванов: " + myPhoneBook.get("Иванов"));
        System.out.println("Телефоны для Смирнов: " + myPhoneBook.get("Смирнов"));
        System.out.println("Телефоны для Соболев: " + myPhoneBook.get("Соболев"));
        System.out.println("Телефоны для Андреев: " + myPhoneBook.get("Анреев"));
    }
}
