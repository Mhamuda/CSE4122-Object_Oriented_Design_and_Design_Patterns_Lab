public class BasicWebPage implements WebPage{
    private String content;

    public BasicWebPage(String content){
        this.content = content;
    }

    @Override
    public void display(){
        System.out.println("Displaying basic web page content: " + content);
    }
}
