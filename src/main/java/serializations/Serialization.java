package serializations;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public Serialization(String name) {
        this.name = name;
    }

    //The serialization of the Object is done using writeObject(d)
    public static void main(String[] args) {
        try {
            Serialization d = new Serialization("Rahul");
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

