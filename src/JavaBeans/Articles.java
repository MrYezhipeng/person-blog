package JavaBeans;

public class Articles {
    private int id;
    private String title;
    private String content;
    public Articles(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setI(int id) {
        this.id = id;
    }

    public int getI() {
        return id;
    }
}
