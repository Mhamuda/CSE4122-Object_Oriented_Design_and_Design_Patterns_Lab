public class BasicWebPage implements WebPage {
    public String html = "<html>...</html>";
    public String styleSheet = "<style>...</style>";
    public String script = "<script>...</script>";

    public void display() {
        System.out.println("Displaying Basic Web Page:");
        System.out.println(html);
        System.out.println(styleSheet);
        System.out.println(script);
    }
}