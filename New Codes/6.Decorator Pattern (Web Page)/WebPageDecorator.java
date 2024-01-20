public class WebPageDecorator implements WebPage{
    protected WebPage decorateWebPage; // This is the key point of this pattern which is to have a reference to the WebPage interface.

    public WebPageDecorator(WebPage decorateWebPage){   
        this.decorateWebPage = decorateWebPage; 
    }

    @Override
    public void display(){
        decorateWebPage.display();  // This is the key point of this pattern whihch is to call the display() method of the WebPage interface.
    }
    
}
