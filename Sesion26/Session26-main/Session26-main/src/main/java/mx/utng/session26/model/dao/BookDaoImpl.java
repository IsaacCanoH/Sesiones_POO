package mx.utng.session26.model.dao;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.session26.model.entity.Book;
import java.util.List;

@Repository
public class BookDaoImpl implements IBookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> list() {
        return entityManager.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    @Override
    public void save(Book book) {
        if (book.getId() != null && book.getId() > 0) {
            entityManager.merge(book);
        } else {
            entityManager.persist(book);
        }
    }

    @Override
    public Book getById(Long id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void delete(Long id) {
        Book book = getById(id);
        entityManager.remove(book);
    }
}

