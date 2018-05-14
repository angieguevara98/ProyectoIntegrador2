package pe.com.proyectointegrador.dao;

import pe.com.proyectointegrador.exception.DAOException;
import pe.com.proyectointegrador.exception.EmptyResultException;
import pe.com.proyectointegrador.exception.LoginException;
import pe.com.proyectointegrador.model.User;

public interface UserDao {
	
	User findUser(int id) throws DAOException, EmptyResultException;

	User validate(String code, String password) throws LoginException, DAOException;

}