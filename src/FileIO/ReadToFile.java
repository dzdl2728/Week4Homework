package FileIO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadToFile {
    private static final String SOURCE_FILE_NAME = "我的测试文件.txt";

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("." + File.separator + SOURCE_FILE_NAME);
        Scanner in = new Scanner(System.in);

        readWay(sourceFile);
    }

    private static void readWay(File sourceFile) {
        try (

                FileInputStream fis = new FileInputStream(sourceFile);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);
        ) {
            reader.lines().map(String::trim).map(String::toUpperCase).forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
