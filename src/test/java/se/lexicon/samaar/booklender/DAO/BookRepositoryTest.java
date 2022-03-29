package se.lexicon.samaar.booklender.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import se.lexicon.samaar.booklender.model.Book;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BookRepositoryTest {

  @Autowired
  private BookRepository bookRepository;

@Test
public void testSaveNewBook(){

    Book book = new Book(0,"kids",true,false,
            14,BigDecimal.valueOf(20.00),"Kids from 5-6");
    bookRepository.save(book);
    assertNotNull(bookRepository);

}
@Test
public void testFindBookbyTitle(){
    Book book = new Book(0,"kids",true,false,
            14,BigDecimal.valueOf(20.00),"Kids from 5-6");
    bookRepository.save(book);
    Book foundDetails = bookRepository.findBookByTitle("kids");
    System.out.println(foundDetails);
    assertEquals(foundDetails,book);
}
@Test
    public void testFindbyAvailable(){
    Book book = new Book(0,"kids",true,false,
            14,BigDecimal.valueOf(20.00),"Kids from 5-6");

    bookRepository.save(book);

    Book found = bookRepository.findBookByAvailable(true);
    System.out.println(found);

    assertEquals(found,book);
}

}