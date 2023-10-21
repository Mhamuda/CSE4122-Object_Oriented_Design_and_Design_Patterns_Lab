public abstract class WebPageDecorator implements WebPage {
    protected WebPage page;

    public WebPageDecorator(WebPage webpage) {
        this.page = webpage;
    }

    @Override
    public void display() {
        this.page.display();
    }
}