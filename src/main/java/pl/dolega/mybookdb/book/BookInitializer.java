package pl.dolega.mybookdb.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local", "default"})
@Component
public class BookInitializer implements CommandLineRunner {

    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
