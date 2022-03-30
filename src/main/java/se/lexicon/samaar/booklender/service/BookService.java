package se.lexicon.samaar.booklender.service;

import se.lexicon.samaar.booklender.DTO.BookDTO;

import java.util.List;

public interface BookService {

List<BookDTO> findByReserved(boolean reserved);
List<BookDTO> findByAvailable(boolean available);
List<BookDTO> findByTitle(String title);
BookDTO findById(int bookID);
List<BookDTO> findAll();
BookDTO create(BookDTO bookDTO);
BookDTO update (BookDTO bookDTO);
boolean delete (int bookId);
}
