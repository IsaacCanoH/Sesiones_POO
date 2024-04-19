package mx.utng.s25.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.s25.model.entity.User;


@Repository
public class UserDaoImpl implements IuserDao{


    //Coloco un objeto que me permitira gestionar la entidad
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> list() {
        return em.createQuery("from Users").getResultList();
    }

    @Override
    public void save(User user) {


        //Si el id es distinto a nulo o es mayor que 0, quiere decir
        //que el registro ya esxite lo va a modificar
        if(user.getId() != null && user.getId()>0){
            em.merge(user);
        }else{
            //Registro nuevo al usar persist
            em.persist(user);
        }
    }

    @Override
    public User getById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void delete(long id) {
        User user = getById(id);
        em.remove(user);
       
    }
    
}
