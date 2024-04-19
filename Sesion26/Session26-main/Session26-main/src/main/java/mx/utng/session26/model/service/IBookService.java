package mx.utng.session26.model.service;

import mx.utng.session26.model.entity.Book;
import java.util.List;

public interface IBookService {
    List<Book> list();
    void save(Book book);
    Book getById(Long id);
    void delete(Long id);
}

