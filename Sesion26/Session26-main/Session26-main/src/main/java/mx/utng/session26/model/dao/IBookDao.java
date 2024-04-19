package mx.utng.session26.model.dao;

import mx.utng.session26.model.entity.Book;
import java.util.List;

public interface IBookDao {
    List<Book> list();
    void save(Book book);
    Book getById(Long id);
    void delete(Long id);
}
