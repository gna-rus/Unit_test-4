package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void findBookById() {
        Book bookX = mock(Book.class);
        bookX.setId("1");
        when(bookX.getId()).thenReturn("1");
        assertEquals(bookX.getId(), "1");
    }

    @Test
    void findAllBooks() {
        BookRepository bookRep = new BookRepository() {
            @Override
            public Book findById(String id) {
                return null;
            }
            @Override
            public List<Book> findAll() {
                List books = new ArrayList<String>();
                books.add("Гарри");
                books.add("Война и мир");
                return books;
            }
        };

        assertEquals(bookRep.findAll(), 123);

    }
}
