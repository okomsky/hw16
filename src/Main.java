public class Main {
    public static void main(String[] args) {;
        try {
            ReceptionParameters.check("okomsky", "a1b2c3_", "a1b2c3_");
            System.out.println("Регистрация прошла успешно");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
    }
}