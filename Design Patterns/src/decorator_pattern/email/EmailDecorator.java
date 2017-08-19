package decorator_pattern.email;

/*
* Base class for all the decorators
* */
public abstract class EmailDecorator implements IEmail{
    //each decorator will add its own property into the email content
    public abstract String modifyContent();

}
