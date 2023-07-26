package LAB10;

import java.io.*;

public class Task3 {

    public static void merge(String filePath, String filePath1, String mergedFilePath){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(mergedFilePath));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath1))){
            String line;
            while ((line = bufferedReader1.readLine()) != null){
                bufferedWriter.write(line + "\n");
            }
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line + "\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
