package mx.utng.session26.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mx.utng.session26.model.dao.IBookDao;
import mx.utng.session26.model.entity.Book;
import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Transactional(readOnly = true)
    @Override
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional
    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Transactional(readOnly = true)
    @Override
    public Book getById(Long id) {
        return bookDao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        bookDao.delete(id);
    }
}

