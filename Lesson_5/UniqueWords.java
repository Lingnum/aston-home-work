package Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
            "Отвертка", "Изолента", "Бокорезы", "Пассатижи", 
            "Отвертка", "Рулетка", "Изолента", "Уровень", 
            "Бокорезы", "Саморезы", "Пассатижи", "Дюпели", 
            "Отвертка", "Шуроповерт", "Бокорезы", "Саморезы"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и количество их вхождений:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}