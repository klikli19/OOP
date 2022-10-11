package HW7.task1;

import static HW7.task1.Data.checkRegistration;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Data d1 = new Data("kli_kli_19", null, "244511kkk_");
        checkRegistration(d1);

    }
}
