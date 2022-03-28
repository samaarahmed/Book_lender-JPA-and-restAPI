package se.lexicon.samaar.booklender.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.samaar.booklender.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

    Book findBookByReserved (boolean reserved);
    Book findBookByAvailable (boolean available);
    Book findBookByTitle (String title);

}
