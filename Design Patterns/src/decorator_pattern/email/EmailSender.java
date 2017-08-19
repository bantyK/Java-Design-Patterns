package decorator_pattern.email;

public class EmailSender {

    public static void main(String[] args) {
        IEmail email = new Email("Hello Ezio, How are you");
        email = new SecureEmailDecorator(email); // make the email encrypted
        email = new ExternalEmailDecorator(email); // adding disclaimer information
        System.out.println(email.getContents());
    }
}
