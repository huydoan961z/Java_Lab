import java.util.Scanner;

public class Main
{
    public char[] chars= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
            '4', '5', '6', '7', '8', '9'};

    public String randomCapcha()
    {
        String capcha="";
        int n=5;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int pos= (int)(Math.random()*(chars.length-1));
            sb.append(chars[pos]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Main main = new Main();
        String generatedCaptcha = main.randomCapcha();
        System.out.println("Captcha: " + generatedCaptcha);
        String userInput= sc.nextLine();

        InputInformation inputInformation = new InputInformation();
        if(inputInformation.checkCaptcha(generatedCaptcha, userInput))
        {
            System.out.println("Captcha matched");
            String account = inputInformation.getAccount();
            String password = inputInformation.getPassword();
            System.out.println("Login successful ");
        }
        else
        {
            System.out.println("Captcha not matched");
        }
    }
}