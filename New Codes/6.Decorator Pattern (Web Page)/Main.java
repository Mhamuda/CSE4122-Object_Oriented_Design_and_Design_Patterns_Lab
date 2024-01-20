public class Main {
    public static void main(String[] args) {
        
        WebPage basicWebPage = new BasicWebPage("This is a basic webpage.");    // BasicWebPage is a concrete class that implements WebPage interface.
        basicWebPage.display();
        System.out.println("-----------");

        WebPage authorizedWebPage = new AuthorizedWebPageDecorator(basicWebPage);   // AuthorizedWebPageDecorator is a concrete class that extends WebPageDecorator abstract class.
        authorizedWebPage.display();
        System.out.println("-----------");

        WebPage paginatiedWebPage = new PaginatedWebPageDecorator(authorizedWebPage, 4);   // PaginatedWebPageDecorator is a concrete class that extends WebPageDecorator abstract class.
        paginatiedWebPage.display();    

    }
    
}
