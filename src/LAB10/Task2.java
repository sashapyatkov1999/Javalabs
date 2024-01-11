package LAB10;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        writer("Вввввввв", "C:\\Users\\skidrow\\IdeaProjects\\Javalabs\\src\\LAB10\\text.txt");
    }

    public static void writer(String string, String filepass)  {
        try (FileWriter fileWriter = new FileWriter(filepass);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter)){
            printWriter.write(string);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
