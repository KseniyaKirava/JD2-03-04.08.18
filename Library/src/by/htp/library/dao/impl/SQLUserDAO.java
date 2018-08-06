package by.htp.library.dao.impl;

import java.sql.SQLException;

import by.htp.library.bean.User;
import by.htp.library.dao.DAOException;
import by.htp.library.dao.UserDAO;

public class SQLUserDAO implements UserDAO{

	@Override
	public User singIn(String login, String password) throws DAOException{
		// stub
		User user = new User();
		user.setName("Vasay");
		
		/*try {
			throw new SQLException("error message");
		}catch(SQLException e) {
			throw new DAOException("sp. error message", e);
		}*/
		
		return user;
		
	}

	@Override
	public void registration(User user) {
		// TODO Auto-generated method stub
		
	}

}
