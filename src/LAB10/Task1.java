package LAB10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println(reader("C:\\Users\\skidrow\\IdeaProjects\\Javalabs\\src\\LAB10\\text.txt"));
    }

    public static List<String> reader(String filepath) throws IOException {
        List<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            arrayList.add(line);
        }
        bufferedReader.close();
        return arrayList;
    }
}
