// functionality: demostrates a custom exception

class MyCustomException extends Exception{
    public MyCustomException (String message){
        super(message);
    }

}
public class CustomExceptionDemo {
    // Step 2: Method that may throw exception
    static void checkNumber(int number) throws MyCustomException {
        if (number < 0) {
            // Throw exception if number is negative
            throw new MyCustomException("Number cannot be negative: " + number);
        } else {
            System.out.println("Number is valid: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(10);   // Valid
            checkNumber(-5);   // Invalid -> triggers exception
        } catch (MyCustomException e) {
            // Step 3: Catch exception and show message
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}