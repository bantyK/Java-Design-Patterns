package decorator_pattern.email;

public class SecureEmailDecorator extends EmailDecorator {
    //Encrypt the email

    IEmail originalEmail;

    public SecureEmailDecorator(IEmail originalEmail) {
        this.originalEmail = originalEmail;
    }

    @Override
    public String getContents() {
        return modifyContent();
    }

    @Override
    public String modifyContent() {
        StringBuilder builder = new StringBuilder();
        builder.append(originalEmail.getContents());
        builder = builder.reverse();
        return builder.toString();
    }
}
