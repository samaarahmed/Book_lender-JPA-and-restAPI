package se.lexicon.samaar.booklender.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String expresult = "history";
        instance.setTitle(expresult);
        String result = instance.getTitle();
        assertEquals( expresult,result);
    }



    @Test
    void setTitle() {
        System.out.println("setTitle");
        String title = "novel";
        Book instance = new Book();

       instance.setTitle(title);
        assertEquals(instance.getTitle(), title);

    }
}