package homework4.Conditions.Task5;


public class Task5 {
    public static void main(String[] args) {

        String password = "G5U17@";
        String[] specSymbol = {"!", "@", "#", "$", "%", "^", "&", "*", "№"};

        if (password.length() >= 8) {
            System.out.println(password.length());
            if (hasDigits(password)) {
//                System.out.println("Password has digit(s)");

                if (hasSpecSymbol(password)) {
//                    System.out.println("Password has Special Symbol");
                    System.out.println("Пароль принят");
                } else {
                    System.out.println("Пароль должен содержать минимум 1 спецсимвол");
                }

            } else {
                System.out.println("Пароль должен содержать минимум 1 цифру");
            }
        } else {
            System.out.println("Пароль должен содержать не менее 8 символов");
        }

    }

    String[] specSymbol = {"!", "@", "#", "$", "%", "^", "&", "*", "№"};

    // Метод для проверки содержит ли пароль хоть 1 спецсимвол
    public static Boolean hasSpecSymbol(String word) {
        String[] specSymbol = {"!", "@", "#", "$", "%", "^", "&", "*", "№"};
        Boolean hasSpecSymbol = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.contains(specSymbol[i])) {
                hasSpecSymbol = true;
                //break;
            }
        }
        return hasSpecSymbol;
    }

    ;

    // проверка содержит ли пароль хоть 1 цифру
    public static Boolean hasDigits(String word) {
        boolean hasDigits = false;
        for (int i = 0; i < word.length() && !hasDigits; i++) {
            if (Character.isDigit(word.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }


}
