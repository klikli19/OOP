package HW7.task1;

public class Data {
    private final String login;
    private final String password;
    private final String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean checkRegistration(Data data) throws WrongLoginException, WrongPasswordException {
        if (data.login.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_]).{1,20}$") && !data.login.isBlank()) {
            System.out.println("Логин соответствует формату");
        } else {
            throw new WrongLoginException("Неверный формат логина");

        }
        if (data.password != null && !data.password.isBlank() && data.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])" +
                "(?=.*[A-Z])(?=.*[_]).{1,20}$") &&
                data.getPassword().equals(data.getConfirmPassword())) {
            System.out.println("Пароль введен корректно");
        } else {

            throw new WrongPasswordException("Неверный формат пароля/пароли не совпадают");
        }
        return false;
    }

}
