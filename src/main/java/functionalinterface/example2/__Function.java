package functionalinterface.example2;

import java.util.function.BiFunction;
import java.util.function.Function;

//Function Functional Interface takes one argument and return one result
//Bi-Function Functional Interface takes two argument and returns one result
public class __Function {
    public static void main(String[] args) {

        //Function takes one argument and produces one output
        int increment1 = incrment(0);
        System.out.println(increment1);

        int increment2 = incrementByOneFunction.apply(increment1);
        System.out.println(increment2);

        int multiply = multipleBy10.apply(increment2);
        System.out.println(multiply);

        int incrementMultiple = incrementByOneThenMultiplyBy10.apply(multiply);
        System.out.println(incrementMultiple);

        //BiFunction takes two argument and produces one output
        int incrementedValues = incrementByOneAndMulipleBiFunction.apply(2,3);
        System.out.println(incrementedValues);

    }

    static Function<Integer, Integer> multipleBy10 = number -> number * 10;
    //Same as other function2
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;


    //chaining functions
    static Function<Integer, Integer> incrementByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10);

    //function 2
    static int incrment(int number) {
        return number + 1;
    }


    //BiFunctions equivalent of Function 3
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMulipleBiFunction =
            (numberToIncrementByOne, numberToMultipleBy) -> (numberToIncrementByOne + 1) * numberToMultipleBy;

    //Function 3
    static int incrementByOneAndMuliple(int number1, int number2) {
        return (number1 + 1) * number2;
    }
}
