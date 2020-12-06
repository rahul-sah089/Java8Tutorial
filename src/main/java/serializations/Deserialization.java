package serializations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
    public static void main(String[] args) {
        Serialization d =  null;
        try {
            FileInputStream f = new FileInputStream("file.txt");
            ObjectInputStream oos = new ObjectInputStream(f);
            d = (Serialization) oos.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        d.getName();
    }
}
