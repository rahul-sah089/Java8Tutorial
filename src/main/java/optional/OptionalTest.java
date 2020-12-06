package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> value = Optional.of("Hello");
        Optional<String> hello = Optional.ofNullable(null);


        String valueOptional = value.get();
        String orElse = hello.orElse("worlds");
        System.out.println(orElse);
        System.out.println(valueOptional);
        System.out.println(hello.get());

        
    }
}
