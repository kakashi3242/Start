import java.io.*;

public class FileLearning {

    public static void main(String[] args) throws IOException {
//        InputStream inputStream = new FileInputStream("/home/mar/Start/TestJava.txt");

        readFile();
        writeFile();

    }

    public static void readFile() throws IOException {

        FileReader fileReader = new FileReader("/home/mar/Start/TestJava.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void writeFile() throws IOException {
        File file = new File("Output.txt");

        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("This is auto append.");
        bufferedWriter.write("This is append.");
        bufferedWriter.flush();

    }

}
