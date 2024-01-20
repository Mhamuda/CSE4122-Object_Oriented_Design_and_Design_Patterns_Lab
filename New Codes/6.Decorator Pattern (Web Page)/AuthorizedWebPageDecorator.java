public class AuthorizedWebPageDecorator extends WebPageDecorator{

    public AuthorizedWebPageDecorator(WebPage decorateWebPage){
        super(decorateWebPage); 
    }

    @Override
    public void display(){
        checkAuthentication();
        super.display();    
    }

    public void checkAuthentication(){
        System.out.println("Checking user authentication....");
        System.out.println(("User is authorized."));
    }
    
}
