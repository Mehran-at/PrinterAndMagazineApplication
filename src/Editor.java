import java.util.List;
import java.util.ArrayList;
public class Editor {
    public Magazine writeMagazine() {
        Magazine magazine = new Magazine("Best magazine");
        magazine.add(new Article("magazine1.","article text"));
        magazine.add(new Article("magazine2", "article text"));
        magazine.add(new Article("magazine3", "article text"));
        return magazine;
    }
}