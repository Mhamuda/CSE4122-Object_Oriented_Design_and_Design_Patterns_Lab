/*
 * This code demonstrates the Decorator pattern by adding authorization and authentication behaviors to a basic web page component.
 */

public class Program {
    public static void main(String args[]) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthorizedWebPage(myPage);
        myPage = new AuthenticatedWebPage(myPage);
        myPage.display();
    }
}