package LAB10;

import java.io.*;
import java.util.Scanner;

public class Task4  {
    public static void main(String[] args)   {
        replace("C:\\Users\\skidrow\\IdeaProjects\\Javalabs\\src\\LAB10\\text.txt");
    }
    public static void replace(String file){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            StringBuilder result = new StringBuilder();

            while (line != null) {
                String replacedLine = line.replaceAll("[^\\p{Alnum}]", "\\$");
                result.append(replacedLine).append("\n");//.append(System.lineSeparator())
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(result.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
