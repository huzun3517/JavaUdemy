package Bolum15_Exception_Handling_IstisnaYakalama._06_Kendi_Exception_Classimiz;

public class InvalidAgeException extends ArithmeticException {

    public InvalidAgeException(String message) {

        super(message);
    }

    @Override
    public void printStackTrace() {

        System.out.println("Bu bir invalid age hatasıdır...");
    }


}
