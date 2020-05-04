package wizut.tpsi.lab9;

public class BlogPost {
    private Long id;
    private String title;
    private String content;
    
    BlogPost()
    {
        
    }

    BlogPost(Long id, String title, String content) {
        this.id=id;
        this.title=title;
        this.content=content;      
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
