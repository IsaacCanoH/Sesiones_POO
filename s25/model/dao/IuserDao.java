package mx.utng.s25.model.dao;

import java.util.List;
import mx.utng.s25.model.entity.User;

public interface IuserDao {
    
    //Listar usuarios
    List<User> list();

    //Guardar un usuario
    void save (User user);

    //Obtener un usuario a partir de id
    User getById(long id);

    //Eliminar un usuario por el id
    void delete(long id);

}
