import entity.Artist;
import entity.Instrument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by eugen on 3/3/17.
 */
public class MusicMain {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("application.xml");
        Artist artist = (Artist) context.getBean("artist");
        System.out.println(artist);
    }
}
