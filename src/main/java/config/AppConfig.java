package config;

import dao.impl.MongodbArtistDaoImpl;
import dao.impl.MysqlArtistDaoImpl;
import entity.Artist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.ArtistService;

/**
 * Created by eugen on 3/10/17.
 */
@Configuration
public class AppConfig {

    @Bean
    public Artist getArtist() {
        Artist artist = new Artist();
        artist.setName("Sviatoslav");
        artist.setSurname("Vakarchuk");
        return artist;
    }

    @Bean
    public MongodbArtistDaoImpl mongodbArtistDao() {
        return new MongodbArtistDaoImpl();
    }

    @Bean
    public MysqlArtistDaoImpl mysqlArtistDao() {
        return new MysqlArtistDaoImpl();
    }

    @Bean
    public ArtistService artistService() {
        return new ArtistService();
    }

}
