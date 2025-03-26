import java.io.*;
import java.util.*;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./sheet1.csv");
        f1.createNewFile();
        File f2 = new File("./sheet2.csv");
        f2.createNewFile();
        StudentMarks(f1.getPath());
        StudentMarks(f2.getPath());
    }

    public static void StudentMarks(String s) {
        try {
            File s1 = new File(s);
            if (!s1.exists()) {
                System.out.println("File not found: " + s1);
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(s1));
            HashMap<String, List<Integer>> h = new HashMap<>();
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int marks = Integer.parseInt(data[2]);
                h.putIfAbsent(name, new ArrayList<>());
                h.get(name).add(marks);
            }
            br.close();
            System.out.println("Student Marks: " + h);
            System.out.println("Averages Marks: " + s);
            for (Map.Entry<String, List<Integer>> entry : h.entrySet()) {
                List<Integer> marksList = entry.getValue();
                double average = marksList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                System.out.println(entry.getKey() + " - Average Marks: " + average);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
