package ru.netology.exception;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.TShirt;
import ru.netology.manager.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class NotFoundExceptionTest {
    ProductRepository repository1= new ProductRepository();
    Book book1 = new Book(1, "Book1", 1000, "Author1", 1000, 2012);
    Book book2 = new Book(2, "Book2", 500, "Author2", 100, 2015);
    Book book3 = new Book(3, "Book3", 100, "Author3", 50, 2018);
    TShirt shirt1 = new TShirt(4,"Shirt", 1000, "red", "42");
    @Test
    public void remoteById(){

        repository1.save(book1);
        repository1.save(book2);
        repository1.save(book3);
        repository1.save(shirt1);

        assertThrows(NotFoundException.class, () -> repository1.removeById(7));

    }

}