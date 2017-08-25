package ProgramingSummer.StringExtractor;

import java.util.ArrayList;
import java.util.List;

public class StringExtractor {
    /**
     * Метод для нахождения ковычек в тексте. Создает массив, в который записывает индексы всех ковычек.
     * Method for finding quotes in text. Create array where writing down indexes of all these quotes.
     */
    public List<Integer> findQuotes(String inText) {

        List<Integer> indexFromText = new ArrayList<>();

        for (int i = 0; i < inText.length(); i++) {

            if (inText.charAt(i) == '\"') {

                indexFromText.add(i);
            }
        }
        return indexFromText;
    }

    /**
     * Метод для извлечения подстрок находящихся в ковычках из текста. Использует массив из метода findQuotes
     * с индексами всех ковычек. И создает новый массив в который записывает подстроки выражений в ковычках.
     *
     */
    public List<String> extractString(String inText) {

        List<Integer> indexesOfQuotes = findQuotes(inText);
        List<String> extractedStrings = new ArrayList<>();
        /**
         *Цикл по ииндексам ковычек через 1 (0, 2, 4...). Выделяет строку из текста по индексу ковычки + 1
         * ( от 0 до 1, от 2 до 3...). + 1 необходимо чтобы добавить в строку саму ковычку.
         */
        for (int i = 0; i < indexesOfQuotes.size(); i = i + 2) {

            String s = inText.substring(indexesOfQuotes.get(i), indexesOfQuotes.get(i + 1) + 1);
            extractedStrings.add(s);
        }


        return extractedStrings;
    }

}
