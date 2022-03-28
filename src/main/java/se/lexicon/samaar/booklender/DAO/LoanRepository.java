package se.lexicon.samaar.booklender.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.samaar.booklender.model.LibraryUser;
import se.lexicon.samaar.booklender.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    Loan findLoanByLoanTaker_UserID (int userId);
    Loan findLoanByBook_BookId( int bookId);
    Loan findLoanByConcluded (boolean concluded);
}

