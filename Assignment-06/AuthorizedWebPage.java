public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizedUser() {
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        super.display();
        this.authorizedUser();
    }
}
