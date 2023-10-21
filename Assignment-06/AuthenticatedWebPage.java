public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authenticateUser() {
        System.out.println("Authenticating user");
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }
}