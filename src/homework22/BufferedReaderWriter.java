package homework22;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("introduce.txt"))){
            String line;
            StringBuilder result = new StringBuilder();
            String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";

            int count_vowels = 0;
            int count_consonants = 0;

            while((line=br.readLine()) != null){
                for(char c: line.toCharArray()){
                    //Проверяем, является ли символ буквой
                    if(Character.isLetter(c)){
                        //Проверяем, буква гласная?
                        if(vowels.indexOf(c) != -1){
                            result.append("а"); //Если да, то меняем на а
                            count_vowels++;
                        }
                        else {
                            result.append("м"); //Если нет, то меняем на м
                            count_consonants++;
                        }
                    }
                    else result.append(c); // добавляем символы, которые не являются буквой, без изменений
                }
                result.append("\n"); // добавляем перенос строки
            }
            System.out.println(result);
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("result_homework22.txt"))){
                bw.write(String.valueOf(result));
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Количество гласных: " + count_vowels);
            System.out.println("Количество согласных: " + count_consonants);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
