package se.lexicon.samaar.booklender.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class LibraryUserDTO {

    private int userID;

   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")

    private LocalDate regDate;
    private String name;
    private String email;

    public LibraryUserDTO() {
    }

    public LibraryUserDTO(int userID, LocalDate regDate, String name, String email) {
        this.userID = userID;
        this.regDate = regDate;
        this.name = name;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
