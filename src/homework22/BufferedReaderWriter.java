package homework22;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("bufferreaderwriter.txt"))){
            String text = "Hello World! \nHey! Teachers! Leave the kids alone";
            bw.write(text);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("bufferreaderwriter.txt"))){
            String line;
            while((line=br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
