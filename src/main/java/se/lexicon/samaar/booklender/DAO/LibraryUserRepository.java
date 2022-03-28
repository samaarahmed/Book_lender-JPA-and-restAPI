package se.lexicon.samaar.booklender.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.samaar.booklender.model.LibraryUser;

public interface LibraryUserRepository extends JpaRepository<LibraryUser,Integer> {

    LibraryUser findLibraryUserByEmail (String email);
}
