package pe.com.proyectointegrador.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;


import pe.com.proyectointegrador.dao.UserDaoImpl;

import pe.com.proyectointegrador.mapper.UserMapper;
import pe.com.proyectointegrador.exception.DAOException;
import pe.com.proyectointegrador.exception.EmptyResultException;
import pe.com.proyectointegrador.exception.LoginException;
import pe.com.proyectointegrador.model.User;

public class UserDaoImpl implements UserDao{
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User findUser(int id) throws DAOException, EmptyResultException {
		String query = "SELECT id, code, password, first_name, last_name, img"
				+ " FROM employees WHERE employee_id = ?";

		Object[] params = new Object[] { id };

		try {

			User user = (User) jdbcTemplate.queryForObject(query, params, new UserMapper());
			//
			return user;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	


	@Override
	public User validate(String code, String password) throws LoginException, DAOException {
		logger.info("validate(): code: " + code + ", password: " + password);
		
		if ("".equals(code) && "".equals(password)) {
			throw new LoginException("Login and password incorrect");
		}
	
		String query = "SELECT login, password, employee_id, first_name, last_name, salary, department_id  "
				+ " FROM employees WHERE login=? AND password=?";
	
		Object[] params = new Object[] { code, password };
	
		try {
	
			User user = (User) jdbcTemplate.queryForObject(query, params, new UserMapper());
			//
			return user;
	
		} catch (EmptyResultDataAccessException e) {
			logger.info("Employee y/o clave incorrecto");
			throw new LoginException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
}
