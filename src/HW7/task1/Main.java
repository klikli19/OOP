package HW7.task1;

import static HW7.task1.Data.checkRegistration;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Data d1 = new Data("kli_kli_19aH", "244511Kkk_", "244511Kkk_");
        checkRegistration(d1);

    }
}
