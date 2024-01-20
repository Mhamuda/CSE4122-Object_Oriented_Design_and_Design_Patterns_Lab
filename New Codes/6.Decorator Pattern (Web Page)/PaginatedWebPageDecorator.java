public class PaginatedWebPageDecorator extends WebPageDecorator{
    private int pageSize;

    public PaginatedWebPageDecorator(WebPage decorateWebPage, int pageSize) {
        super(decorateWebPage);
        this.pageSize = pageSize;
    }

    @Override
    public void display(){
        super.display();
        addPagination();
    }

    public void addPagination(){
        System.out.println("Adding pagination to the web page. Page size: " + pageSize);
    }
}
