import java.util.Scanner;
public class Printer {
        public void print(Article article) {
            System.out.println("Print " + article.getTitle());
            System.out.println("Print " + article.getarticle());
        }
    public void printMagazine(Magazine magazine) {
        System.out.println("The title of this article is "
                + magazine.getTitle() + "and the article is " + magazine.getArticles());
    }
}
