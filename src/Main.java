import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("letters.txt")){
            for (char i = 'A'; i <= 'Z'; i++) {
                String a=i + "" + Character.toLowerCase(i)+" \n";
                fileWriter.append(a);
            }
            for (char i = '0'; i <= '9'; i++) {
                fileWriter.write(i+"\n");
            }
        }catch (IOException e) {
            System.out.println("Ошибка");
        }
        try (FileReader fileReader = new FileReader("letters.txt")) {
            Scanner scanner = new Scanner(fileReader);
            int i = 1;
            while (scanner.hasNext()) {
                System.out.println(i + ". " + scanner.nextLine());
                i++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}