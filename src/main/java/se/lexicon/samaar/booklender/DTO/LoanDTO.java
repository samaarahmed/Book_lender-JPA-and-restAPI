package se.lexicon.samaar.booklender.DTO;

import java.time.LocalDate;

public class LoanDTO {

    private long loanId;
    private LibraryUserDTO loanTaker;
    private BookDTO book;
    private LocalDate loanDate;
    private boolean concluded;

    public LoanDTO(long loanId, LibraryUserDTO loanTaker, BookDTO book, LocalDate loanDate, boolean concluded) {
        this.loanId = loanId;
        this.loanTaker = loanTaker;
        this.book = book;
        this.loanDate = loanDate;
        this.concluded = concluded;
    }

    public long getLoanId() {
        return loanId;
    }

    public void setLoanId(long loanId) {
        this.loanId = loanId;
    }

    public LibraryUserDTO getLoanTaker() {
        return loanTaker;
    }

    public void setLoanTaker(LibraryUserDTO loanTaker) {
        this.loanTaker = loanTaker;
    }

    public BookDTO getBook() {
        return book;
    }

    public void setBook(BookDTO book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }
}
