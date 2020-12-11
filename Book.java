import java.util.Arrays;
import java.util.List;
    class Book {
        String ISBN;
        Author author;
        List<Chapter> chapters;

        Book() {
            chapters = Arrays.asList(
                    new Chapter( 2),
                    new Chapter( 2),
                    new Chapter( 3));
        }
    }

