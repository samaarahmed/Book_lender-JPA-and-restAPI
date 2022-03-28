package se.lexicon.samaar.booklender.model;

import java.time.LocalDate;
import java.util.Objects;

public class Loan {
    private long loanID;
    private LibraryUser loanTaker;
    private Book book;
    private LocalDate loanDate;
    private boolean concluded;

    public Loan() {
    }

    public Loan(LibraryUser loanTaker, Book book, LocalDate loanDate, boolean concluded) {
        this.loanTaker = loanTaker;
        this.book = book;
        this.loanDate = loanDate;
        this.concluded = concluded;
    }

    public long getLoanID() {
        return loanID;
    }


    public LibraryUser getLoanTaker() {
        return loanTaker;
    }

    public void setLoanTaker(LibraryUser loanTaker) {
        this.loanTaker = loanTaker;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isOverdue(){

        return true;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }


    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }

    public boolean extendLoan(int days){

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return loanID == loan.loanID && concluded == loan.concluded && Objects.equals(loanTaker, loan.loanTaker) && Objects.equals(book, loan.book) && Objects.equals(loanDate, loan.loanDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanID, loanTaker, book, loanDate, concluded);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanID=" + loanID +
                ", loanTaker=" + loanTaker +
                ", book=" + book +
                ", loanDate=" + loanDate +
                ", concluded=" + concluded +
                '}';
    }
}
