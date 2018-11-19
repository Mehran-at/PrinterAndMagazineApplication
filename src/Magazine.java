import java.util.ArrayList;
import java.util.List;
public class Magazine {
    private String title;
    private List<Article> articles = new ArrayList<>();
    public Magazine(String title) {
        this.title = title;
    }
    public void add(Article article) {
        articles.add(article);
    }
    public List<Article> getArticles() {
        return articles;
    }
    public String getTitle() {
        return title;
    }
}
