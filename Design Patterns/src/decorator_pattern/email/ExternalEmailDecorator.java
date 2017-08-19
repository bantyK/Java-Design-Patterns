package decorator_pattern.email;

public class ExternalEmailDecorator extends EmailDecorator {
    //Every email must be added with a disclaimer

    IEmail originalMail;

    public ExternalEmailDecorator(IEmail originalMail) {
        this.originalMail = originalMail;
    }

    @Override
    public String getContents() {
        return originalMail.getContents() + modifyContent();
    }

    @Override
    public String modifyContent() {
        return "\nDisclaimer information. All rights reserved";
    }
}
