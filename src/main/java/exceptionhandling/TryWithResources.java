package exceptionhandling;

import java.io.FileInputStream;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            int data = fileInputStream.read();
            System.out.println(data);
            while (data != -1) {
                data = fileInputStream.read();
                System.out.println(data);
            }
        }
    }
}
