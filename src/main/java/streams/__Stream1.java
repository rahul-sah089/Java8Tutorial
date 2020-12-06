package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class __Stream1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,12,12,12231321,321,3213,123,1231,13123,123,2,3,5,7,8);
        int value = values.stream().sorted().collect(Collectors.toList()).get(values.size()-2);
        System.out.println("**************");
        System.out.println(value);
        System.out.println("**************");

        String valuesA = "January";

        //Arrays.stream(values.toArray()).filter(val-> val == "A" || val == "a").collect(Collectors.toList()).size();
    }
}
