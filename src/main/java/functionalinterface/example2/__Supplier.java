package functionalinterface.example2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.Supplier;
import java.util.jar.JarOutputStream;

//Supplier => Results a supplier of Results
public class __Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDbConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> {
        return "jdbc://localhost:5432/users";
    };


}
