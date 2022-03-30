package se.lexicon.samaar.booklender.service;

import se.lexicon.samaar.booklender.DTO.LoanDTO;

import java.util.List;

public interface LoanService {

    LoanDTO findById(long loanId);
    List<LoanDTO> findByBookId(int bookId);
    List<LoanDTO> findByUserID(int userId);
    List<LoanDTO> findByConcluded(boolean concluded);
    List<LoanDTO> findAll();
    LoanDTO create (LoanDTO loanDTO);
    LoanDTO update (LoanDTO loanDTO);
    boolean delete (long loanID);
}
