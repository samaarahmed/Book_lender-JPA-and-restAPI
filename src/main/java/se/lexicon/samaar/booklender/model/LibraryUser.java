package se.lexicon.samaar.booklender.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class LibraryUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
   @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate regDate;
    private String name;
    @Column(unique = true)
    private String email;

    public LibraryUser() {
    }

    public LibraryUser(int userID, LocalDate regDate, String name, String email) {
        this.userID = userID;
        this.regDate = regDate;
        this.name = name;
        this.email = email;
    }

    public LibraryUser(LocalDate regDate, String name, String email) {
        this.regDate = regDate;
        this.name = name;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }



    public LocalDate getRegDate() {
        return regDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return userID == that.userID && Objects.equals(regDate, that.regDate) && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, regDate, name, email);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "userID=" + userID +
                ", regDate=" + regDate +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
