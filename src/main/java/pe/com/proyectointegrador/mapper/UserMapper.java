package pe.com.proyectointegrador.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.com.proyectointegrador.model.User;

public class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setCode(rs.getInt("code"));
		user.setId(rs.getInt("id"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setPassword(rs.getString("password"));
		user.setImg(rs.getString("img"));
		return user;
	}
}

