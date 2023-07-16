public class ReceptionParameters {

    private static final String ALLOWED_CHARS = "qwertyuiopasdfghjklzxcvbnm_1234567890";
    public static void check(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может состоять больше чем из 20 символов");
        }

        if (!checkSymbols(login)) {
            throw new WrongLoginException("Строка содержит недопустмимые значения");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может состоять больше чем из 20 символов");
        }
        if (!checkSymbols(password)) {
            throw new WrongPasswordException("Пароль содержит недопустимые значения");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не равны");
        }
    }

    private static boolean checkSymbols(String str) {
        var lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            var c = lowerCase.charAt(i);
            if (!ALLOWED_CHARS.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    private static void checkLength(String str) throws WrongLoginException {
        if (str.length() > 20) {
            throw new WrongLoginException("Логин не может состоять больше чем из 20 символов");
        }
    }
}
