package homework25;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // считать все слова из файла, отсортировать их в алфавитном порядке и вывести на экран
        ArrayList<String> result = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("./src/homework25/text.txt"))){
            String line;
            StringBuilder word = new StringBuilder();

            while((line=br.readLine()) != null){
                for(char c: line.toCharArray()){
                    //Пока символ является буквой записываем в word (исключение символ ')
                    if(Character.isLetter(c) || c == '\''){
                        if(Character.isUpperCase(c)){
                            if(!word.isEmpty()){
                                result.add(word.toString());
                            }
                            word.setLength(0);
                        }
                        word.append(c);
                    }
                    else {
                        if(!word.isEmpty()){
                            result.add(word.toString());
                        }
                        word.setLength(0);
                    }
                }
            }
            Collections.sort(result);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(result);

        // Найти слово, встречающееся максимальное число раз в файле и его частоту и вывести на экран.
        //сделать хеш мапу где ключ слово, а кол-во повторений значение

    }
}
