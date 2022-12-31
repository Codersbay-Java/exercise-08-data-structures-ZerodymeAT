package com.codersbay.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook testBook;
    @BeforeEach
    public void before(){
       testBook = new PhoneBook();
        Person mustermann = new Person("Max", "Mustermann", "0190666666");
        testBook.addContact(mustermann);
    }
    @Test
    public void addPersontoPhonebook() {
        Assertions.assertEquals("0190666666",testBook.getNumberfromIndex(0));
    }
    @Test void deletePersonfromPhonebook(){
        Assertions.assertEquals("Max Mustermann 0190666666",  testBook.deleteContact(0).toString());
    }
    @Test void updatePersonInPhonebook(){
        Person update = new Person("Sabine", "Traxler", "0732739400");
        testBook.updateContact(0, update);
        Assertions.assertEquals("[0] Sabine Traxler 0732739400", testBook.getContact(0));
    }

}
