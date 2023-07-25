package LAB10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(reader("C:\\Users\\skidrow\\IdeaProjects\\Javalabs\\src\\LAB10\\text.txt"));
    }

    public static List<String> reader(String filepath)  {
        List<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return arrayList;
    }
}
