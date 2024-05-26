import java.util.Scanner;

public class InputInformation
{
    public String getAccount() {
        String account;
        while (true) {
            try {
                System.out.println("Nhập số tài khoản của bạn: ");
                Scanner scanner = new Scanner(System.in);
                account = scanner.nextLine();
                if (account.matches("\\d{10}")) {
                    return account;
                } else {
                    throw new Exception("Số tài khoản phải là một số có 10 chữ số.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getPassword() {
        String password;
        while (true) {
            try {
                System.out.println("Nhập mật khẩu của bạn: ");
                Scanner scanner = new Scanner(System.in);
                password = scanner.nextLine();
                if (password.length() < 8 || !password.matches("^(?=.*[0-9])(?=.*[a-zA-Z]).*$")) {
                    throw new Exception("Mật khẩu phải có ít nhất 8 ký tự và phải bao gồm cả chữ và số.");
                }
                return password;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean checkCaptcha(String generatedCaptcha, String userInput) {
        return generatedCaptcha.equals(userInput);
    }
}