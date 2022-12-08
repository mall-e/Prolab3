import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        readCSV();
    }

    static public void readCSV() throws FileNotFoundException {
        String file = "/Users/mali/Desktop/Prolab3/Prolab3/src/test2.csv";
        BufferedReader reader = null;
        String line = "";

        try {

            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null){
                String[] row = line.split(";");
                for (String s : row) {
                    System.out.printf("%-10s", s);
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}