package nothingjava8;

public class ExceptionHandlingTest {
    public static void main(String[] args) {
        System.out.println("Main Method Stared");
        try {
            System.out.println("1");
            throw new Exception();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("3");
        }finally{
            System.out.println("4");
        }
    }
}
