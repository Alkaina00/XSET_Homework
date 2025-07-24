package homework25;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // считать все слова из файла, отсортировать их в алфавитном порядке и вывести на экран
        ArrayList<String> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("./src/homework25/text.txt"))){
            String line;

            while((line=br.readLine()) != null){
                // Разбиваем строку на слова, используя регулярное выражение для всех не-буквенных символов (кроме апострофа)
                String[] words = line.split("[^a-zA-Z']+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        result.add(word);
                    }
                }
            }
            Collections.sort(result);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Все слова из файла: \n" + result);
        System.out.println(); // Добавляем перенос строки после вывода

        // Найдем процент вхождения каждого слова относительно их общего количества
        //сделать хеш мапу где ключ слово, а кол-во повторений значение
        Map<String, Integer> countWord = new HashMap<String, Integer>();
        result.forEach(word -> countWord.merge(word, 1, Integer::sum));

        // сделать хеш мапу где ключ слово, значение процент вхождения
        Map<String, Double> wordPercent = new HashMap<>();
        int totalWords = result.size();

        // Рассчитываем процент для каждого слова
        countWord.forEach((word, count) -> {
            double percent = (double) count / totalWords * 100;
            wordPercent.put(word, percent);
        });

        // Выводим процент вхождения каждого слова
        System.out.println("Процент вхождения каждого слова:");
        wordPercent.forEach((word, percent) ->
                System.out.printf("%s: %.2f%%\n", word, percent));
        System.out.println();

        // Найти слово, встречающееся максимальное число раз в файле и его частоту и вывести на экран.
        // находим самое максимальное кол-во повторений
        int maxCount = countWord.values().stream().max(Integer::compare).orElse(0);

        // Выводим все слова с макс повторений
        System.out.println("Слова, встречающиеся максимальное число раз в файле:");
        countWord.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .forEach(entry -> System.out.print(entry.getKey() + " " + maxCount + "\n"));
        System.out.println(); // Добавляем перенос строки после вывода

        //То же самое, но не учитываем регистр слов
        for(int i = 0; i < result.size(); i++){
            result.set(i, result.get(i).toLowerCase());
        }

        //сделать хеш мапу где ключ слово, а кол-во повторений значение
        Map<String, Integer> countWordReg = new HashMap<String, Integer>();
        result.forEach(word -> countWordReg.merge(word, 1, Integer::sum));

        // находим самое максимальное кол-во повторений
        int maxCountReg = countWordReg.values().stream().max(Integer::compare).orElse(0);

        // Выводим все слова с макс повторений
        System.out.println("Слова, встречающиеся максимальное число раз в файле без учета регистра:");
        countWordReg.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCountReg)
                .forEach(entry -> System.out.print(entry.getKey() + " " + maxCountReg + "\n"));
        System.out.println(); // Добавляем перенос строки после вывода
    }
}
